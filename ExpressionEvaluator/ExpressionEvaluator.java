public class ExpressionEvaluator {
    public static void main (String[] args) {
        CustomizedStack stack = new CustomizedStack();
        int first, second;
        
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("-?\\d+(\\.\\d+)?")) {
                stack.push(args[i]);
            } else if (args[i].equals("+")) {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first + second));
            } else if (args[i].equals("-")) {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first - second));
            } else if (args[i].equals("x")) {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first * second));
            } else if (args[i].equals("/")) {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first / second));
            } else if (args[i].equals("%")) {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first % second));
            } else {
                throw new IllegalArgumentException();
            }
        }
        System.out.println(stack.peek());
    }
}