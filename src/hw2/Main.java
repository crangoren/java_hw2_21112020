package hw2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
//        exerciseSeven();

    }

    public static void exerciseOne() {

        int[] bitArray = {1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0}; //1
        for (int i = 0; i < bitArray.length; i++) {
            if (bitArray[i] == 0) {
                bitArray[i] = 1;
            } else {
                bitArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(bitArray) + "\n");
    }

    public static void exerciseTwo() {

        int[] fillArr = new int[8]; //2
        for (int j = 0, k = 0; j < fillArr.length; j++, k += 3) {
            fillArr[j] = k;
        }
        System.out.println(Arrays.toString(fillArr) + "\n");
    }

    public static void exerciseThree() {

        int[] upArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //3

        for (int i = 0; i < upArray.length; i++) {
            if (upArray[i] < 6) {
                upArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(upArray) + "\n");
    }

    public static void exerciseFour() {

        int[][] sqArr = new int[10][10]; //4
        for (int i = 0, j = 0; i < sqArr.length; i++, j++) {
            if (i == j || i + j == 9) {
                sqArr[i][j] = 1;
            }
        }
        for (int i = 0, j = 9; i < sqArr.length; i++, j--) {
            if (i + j == 9) {
                sqArr[i][j] = 1;
            }
        }

        for (int i = 0; i < sqArr.length; i++) {
            System.out.println(Arrays.toString(sqArr[i]));
        }
    }

    public static void exerciseFive() { //5

        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ((int)(Math.random() * 100));
        }

        int min = randomArray[0];
        int max = 0;
        for (int i = 0; i < randomArray.length; i++){
            if (max < randomArray[i]) {
                max = randomArray[i];
            }
        }

        for (int i = 1; i < randomArray.length; i++){
            if (min > randomArray[i] ) {
                min = randomArray[i];
            }
        }
        System.out.println("Случайный массив задания 5 = " + Arrays.toString(randomArray) + "\n");
        System.out.println("min =" + min);
        System.out.println("max =" + max + "\n");
    }
    public static boolean exerciseSix() { //6

        int[] leftRightArr = new int[4];
        //int summ = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < leftRightArr.length; i++) {
            leftRightArr[i] = ((int) (Math.random() * 4));
        }
        System.out.println("Случайный массив задания 6 = " + Arrays.toString(leftRightArr));
        for (int j = 0; j < leftRightArr.length; j++) {

            left = left + leftRightArr[j];
        }
        for (int k = leftRightArr.length - 1; k > 0; k--) {
            left = left - leftRightArr[k];
            right = right + leftRightArr[k];

            if (left == right){
               System.out.println("\n true");
               return true;
            }
        }
        System.out.println("\n false");
        return  false;
    }



}




