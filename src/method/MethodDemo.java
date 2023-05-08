package method;

public class MethodDemo {

    public static void main(String[] args) {
        printNumbers(13, 7, 4);
        printNumbers(-1, 9);
        printNumbers();
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    private static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
