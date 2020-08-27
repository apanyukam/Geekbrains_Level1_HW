package Lesson2;
/*
Задание 3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public class HW_Lesson2_Task3 {
    public static void main(String[] args) {
        int[] filledArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int value : filledArray) {
            System.out.print(" " + value);
        }

        System.out.println("\n--------------------------------");

        for (int value : filledArray) {
            if(value < 6){
                value = value * 6;
            }
            System.out.print(" " + value);
        }
    }
}
