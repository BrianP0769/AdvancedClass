import java.util.Stack;
public class StackQuestion{
  public static boolean paranthese(String string){
    Stack stack = new Stack();
      for(int i = 0; i < string.length(); i++){
      if(string.charAt(i) = '('){
      stack.push(string.charAt(i));
      }
      else if(string.charAt(i) = ')'){
      if(stack.empty() = true)
      return false;
      }
      stack.pop();
      }
      }
      if(stack.empty() == false){
      return false;
      }
      return true;
      }
      public static void main(String[] args) {
      System.out.println(parentheses("(()()"));
      }
}
