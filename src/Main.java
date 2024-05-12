public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = {1500, 253, 53232, 431416, 3334};
        int sum = 0;

        for (int currentSum : arr) {
            sum += currentSum;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задача 2
        System.out.println("Задача 2");
        int[] arrTwo = {5, 10, 15, 3, 7, 55, 1};
        int min = arrTwo[0];
        int max = arrTwo[0];

        for (int i = 0; i < arrTwo.length; i++) {
            if (arrTwo[i] < min) {
                min = arrTwo[i];
            }
            if (arrTwo[i] > max) {
                max = arrTwo[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");

        //Задача 3
        System.out.println("Задача 3");
        int[] roubles = {500, 1522, 3030, 210, 701};
        double average;
        sum = 0;

        for (int i = 0; i < roubles.length; i++) {
            sum += roubles[i];
        }
        average = (double) sum / roubles.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
