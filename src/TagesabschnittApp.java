public class TagesabschnittApp {
    public static void main(String[] args) {
        int hour = 27;

        /*
        6-9 -> Früh
        9-12 -> Vormittag
        12-16 -> Nachmittag
        16-20 -> Abend
        20-6 -> Nacht
         */
        printDayTime1(hour);
    }

    public static void printDayTime1(int hour) {

        if (hour >= 6 && hour <= 9) {
            System.out.println("Früh");
        } else if (hour > 9 && hour <= 12) {
            System.out.println("Vormittag");
        } else if (hour > 12 && hour <= 16) {
            System.out.println("Nachmittag");
        } else if (hour > 16 && hour <= 20) {
            System.out.println("Abend");
        } else if (hour > 20 && hour <= 23 || hour < 6) {
            System.out.println("Nacht");
        } else {
            System.out.println("falsche Uhrzeit");
        }
    }

    public static void printDayTime2(int hour) {

        if (hour < 0 || hour > 23) {
            System.out.println("Falsche Uhrzeit");
            return;
        }

        if (hour < 6) {
            System.out.println("Nacht");
        } else if (hour <= 9) {
            System.out.println("Früh");
        } else if (hour <= 12) {
            System.out.println("Vormittag");
        } else if (hour <= 16) {
            System.out.println("Nachmittag");
        } else if (hour <= 20) {
            System.out.println("Abend");
        } else {
            System.out.println("Nacht");
        }

    }

}
