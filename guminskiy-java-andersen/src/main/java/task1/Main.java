package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста введите число большее чем 7(семь)");
        String line = scanner.nextLine();
        sayHello(line);

        System.out.println("Пожалуйста введите ваше имя");
        String name = scanner.nextLine();
        sayHelloVyacheslav(name);

        int[] array = {1, 3, 5, 7, 42, 111, 335};
        outputArray(array);
    }

    public static void sayHello(String line) {
        if (Integer.parseInt(line) > 7) {
                System.out.println("Привет\n");
        } else {
            System.out.println("Попробуйте еще раз запустить программу и ввести чсило 8(восемь) или более\n");
        }
    }

    public static void sayHelloVyacheslav(String name) {
        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет Вячеслав\n");
        } else {
            System.out.println("Нет такого имени\n");
        }
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++ )
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
    }
}
