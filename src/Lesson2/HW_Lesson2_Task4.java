package Lesson2;
/*
 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */
public class HW_Lesson2_Task4 {
    public static void main(String[] args) {
        int[][] squareArray = new int[10][10];
        for (int i =0; i< squareArray.length; i++){
            for (int j = 0; j< squareArray[i].length; j++){
                if(i==j || i+j == squareArray.length-1) squareArray[i][j]=1;
                System.out.print(" " + squareArray[i][j] + " ");
                    }
            System.out.println();
            }
        }
    }