package Lesson2;
/*
Задание 1: Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class HW_Lesson2_Task1 {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Новые значения элементов массива:");
        for (int i = 0; i< firstArray.length; i++){
            if(firstArray[i] == 1){
                firstArray[i] = 0;
            }else firstArray[i] =1;
            System.out.print(firstArray[i]);
        }
    }
}
