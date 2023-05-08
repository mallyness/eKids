package loop;

public class LoopDemo {

    public static void main(String[] args) {

        int[] myArray = {1, 10, 15};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);

        int i = 0;
        while (i < 2) {
            System.out.println(i);
            i++;
        }
    }
}
