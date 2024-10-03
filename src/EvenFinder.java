public class EvenFinder {
    public static void main(String[] args) {

        int number = 57;

        int counter = 0;

        while (counter < number) {
            if (counter % 2 == 0) {
                System.out.println("counter is even: " + counter);
            }

            counter++;
        }
        System.out.println("Ende der Schleife erreicht");

    }
}
