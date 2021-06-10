package arrayandmethod;

import java.util.Scanner;

public class MinElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so cot :");
        int cow = sc.nextInt();
        System.out.println("nhap vao hang :");
        int row = sc.nextInt();

        int[][] array = new int[row][cow];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 90);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Gia tri nho nhat trong mang ");
        System.out.println(minArray(array));
    }
    public static int minArray(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
