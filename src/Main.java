import java.util.Stack;

public class Main {

    public static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            if (ch == ',' || ch == '(') continue;

            if(ch == '&' || ch == '|' || ch == '!' || ch == 't' || ch == 'f')
                stack.push(ch);
            else if(ch == ')'){
                boolean hasTrue = false, hasFalse = false;

                while(stack.peek() != '!' && stack.peek() != '&' && stack.peek() != '|'){
                    char topVal = stack.pop();
                    if (topVal == 't') hasTrue = true;
                    if (topVal == 'f') hasFalse = true;
                }

                char op = stack.pop();
                if(op == '&')
                    stack.push(hasFalse ? 'f' : 't');
                else if (op == '|')
                    stack.push(hasTrue ? 't' : 'f');
                else
                    stack.push(hasTrue ? 'f' : 't');

            }

        }

        return stack.peek() == 't';
    }
    public static void main(String[] args) {
        String val = "!(&(!(f),&(f),|(f, t, f, t)))";
        boolean expr = parseBoolExpr(val);

        System.out.println(expr);
    }
}