package arrayandmethod;

import java.util.Scanner;

public class MaxElemenMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so cot :");
        int cow = sc.nextInt();
        System.out.println("Nhap so hang :");
        int row = sc.nextInt();

        int[][] array = new int[row][cow];

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 90);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Gia tri lon nhat trog mang :");
        System.out.println(MaxElemen(array));
    }
    public static int MaxElemen(int[][]array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
