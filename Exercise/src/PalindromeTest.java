import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

  @Test
  void palindromeTrue(){
    Palindrome p = new Palindrome();

    assertTrue(p.isPalindrome("racecar"));
    assertFalse(p.isPalindrome("jsndjhsbfcj"));
  }
}