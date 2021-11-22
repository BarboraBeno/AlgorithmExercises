public class Palindrome {

  //A palindrome is a word, number, phrase, or other sequence of characters
  // which reads the same backward as forward, such as madam or racecar.

  public static void main(String[] args) {

    String a = "abba";
    String b = "jbfjsdb";
    String c = "";
    System.out.println(isPalindrome(a));
    System.out.println(isPalindrome(b));
    System.out.println(isPalindrome(c));
  }

  public static boolean isPalindrome(String a){
    int i = 0;
    int j = a.length() -1;

    while(i < j){
      if(a.charAt(i) != a.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}
