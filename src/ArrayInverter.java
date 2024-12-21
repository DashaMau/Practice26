import java.util.Stack;

public class ArrayInverter {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        printArray(array);

        invertArray(array);

        System.out.println("Инвертированный массив:");
        printArray(array);
    }

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int value : array) {
            stack.push(value);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

