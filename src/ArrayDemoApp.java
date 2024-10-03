public class ArrayDemoApp {
    public static void main(String[] args) {

        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = 9;
        array1[2] = 1;

        int[] array2 = {4, 7, 3};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + array2[i]);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] * array2[i]);
        }

        int[] array3 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println(sum);

    }
}
