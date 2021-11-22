import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

  @Test
  void isAnagram() {
    Anagram a = new Anagram();
    assertTrue(a.isAnagram("foefet", "toffee"));
    assertTrue(a.isAnagram("Buckethead", "DeathCubeK"));
    assertTrue(a.isAnagram("Twoo", "Woot"));
    assertFalse(a.isAnagram("apple", "pale"));
  }
}