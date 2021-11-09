
import java.util.Stack;

public class Parentheses {

  public static void main(String[] args) {

    String parens = "(())((()())())";
    String par = ")(()))";
    String p = "()";
    String pa = "(";

    System.out.println(validParentheses(parens));
    System.out.println(validParentheses(par));
    System.out.println(validParentheses(p));
    System.out.println(validParentheses(pa));

  }

  public static boolean validParentheses(String parens) {

    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < parens.length(); i++) {
      if(parens.charAt(i) == '(') {
        stack.push(parens.charAt(i));
      }
      else if(!stack.isEmpty() && parens.charAt(i) == ')'
          && stack.peek() == '('){
        stack.pop();
      }else{
        stack.push(parens.charAt(i));
      }
    }
    if(stack.isEmpty()) {
      return true;
    }
    return false;
  }

}
