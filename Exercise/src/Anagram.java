import java.util.Arrays;

public class Anagram {

  //An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
  // typically using all the original letters exactly once.

  public static void main(String[] args) {

    String a = "foefet";
    String b = "toffee";

    System.out.println(isAnagram(a,b));

  }

  public static boolean isAnagram(String a, String b) {
    if( a == null || b == null || a.length() != b.length())
      return false;

    char arr1 [] = a.toLowerCase().toCharArray();
    char arr2 [] = b.toLowerCase().toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);

  }

}
