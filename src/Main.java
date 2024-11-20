public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Задача 1");
        System.out.println();
        int[] salary = {276000,299000,228000,254000,304000};
        int sum = 0;
        for (int i : salary) {
            sum+=i;
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей.");
        System.out.println();

        //Task2
        System.out.println("Задача 2");
        System.out.println();
        int min = salary[0];
        int max = salary[0];
        for (int i : salary) {
            if (min > i) {
                min = i;
            }
            if (max<i) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println();


        //Task3
        System.out.println("Задача 3");
        System.out.println();
        sum = 0;
        for (int i : salary) {
            sum+=i;
        }
        int avr = sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила "+avr+" рублей.");
        System.out.println();

        //Task4
        System.out.println("Задача 4");
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        int indexMax =reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length; i++) {
            if (i < indexMax - i) {
                temp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[indexMax - i];
                reverseFullName[indexMax - i] = temp;
            }
            System.out.print(reverseFullName[i]);
        }
        System.out.println();








    }



}