package HWThree;

import java.util.Arrays;

public class HomeWorkThree {

    public static void main(String[] args) {

        invertArr();
        fillArr();
        changeArray();
        fillDiagonal();
        printLenIN(lenIn(4,4));

    }

    public static void invertArr() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static int[] lenIn (int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printLenIN (int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i] + " ");
        }
        System.out.println();
    }

}
