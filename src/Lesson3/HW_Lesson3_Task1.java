package Lesson3;

/*
Задача 1: Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается
3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем
число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

import java.util.Scanner;

public class HW_Lesson3_Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 9;
        System.out.println("Ваша задача угадать число, используя три попытки");
        while (true) {
            playLevel(i);
            System.out.println("Повторить игру?\nВведите 0 или 1\n1 - ДА, 0 - НЕТ\n");
            int decision = scanner.nextInt();
            if (decision == 0) {
                System.out.println("Игра завершена. Спасибо за активное участие!");
                break;
            }
        }
    }

    private static void playLevel(int range) {

        int number = (int) (Math.random() * range);
        int y = 0; //  кол-во попыток
        System.out.println("Угадайте число от 0 до " + range);
        while (true) {
            if (y == 3) {
                System.out.println("Это была последняя попытка! Вы проиграли!");
                System.out.println("Загаданное случайное число = " + number);
                break;
            }
            int input_number = scanner.nextInt();
            y++;

            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number < number) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }
    }
}



