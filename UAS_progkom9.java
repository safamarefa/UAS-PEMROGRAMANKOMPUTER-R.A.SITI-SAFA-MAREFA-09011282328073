import java.util.Stack;

public class UAS_progkom9 {
    public static boolean isBracketSequenceValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String expression1 = "((4 + 2) * 2)";
        String expression2 = "((4 + 2) * 2";
        String expression3 = "((4 + 2) * 2))";
        String expression4 = "((4 + 2) * 2]";

        System.out.println(expression1 + " : " + isBracketSequenceValid(expression1));
        System.out.println(expression2 + " : " + isBracketSequenceValid(expression2));
        System.out.println(expression3 + " : " + isBracketSequenceValid(expression3));
        System.out.println(expression4 + " : " + isBracketSequenceValid(expression4));

    }
}