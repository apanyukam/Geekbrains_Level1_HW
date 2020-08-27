package Lesson2;
/*
Задание 2: Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */
public class HW_Lesson2_Task2 {
    public static void main(String[] args) {
        int[] arrayToFill = new int[8];
        for(int i = 1; i < arrayToFill.length; i++) {
            arrayToFill[i] =arrayToFill[i-1] +3;
        }

        for (int value : arrayToFill) {
            System.out.print(" " + value);
        }
    }
}
