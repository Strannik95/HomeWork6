public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] arr = generateRandomArray();
        int arr1 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1 += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arr1 + " рублей");

        // Задание 2
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum){
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        int minSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minSum){
                minSum = arr[i];
                if (arr[0] == minSum){
                    System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
                    break;
                }
            }
        }
        // Задание 3
        double midSum = 0;
        for (int i = 0; i < arr.length; i++) {
            midSum += arr[i];
        }
        midSum = midSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + midSum + " рублей ");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }



    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}