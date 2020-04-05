import java.util.Stack;

public class StackReverseElementInArray {
    private static int size = 0;
    private static double arrNumber[];

    public static void initArray(int size) {
        arrNumber = new double[size];
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = Math.floor(Math.random() * 10);
        }
    }

    public static void display(){
        for (int i = 0; i < arrNumber.length - 1; i++){
            System.out.print(arrNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        initArray(10);
        System.out.println("Your array: ");
        display();
        for (int i = 0; i < arrNumber.length - 1; i++){
            stack.push(arrNumber[i]);
        }
        for (int i = 0; i < arrNumber.length - 1; i++){
            arrNumber[i] = stack.pop();
        }
        System.out.println("\nYour new array: ");
        display();
    }
}
