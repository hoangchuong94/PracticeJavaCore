package arrayandmethod;

import java.util.Scanner;

public class TotalCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao cot :");
        int cows = sc.nextInt();
        System.out.println("nhap vao hang");
        int rows = sc.nextInt();

        int[][] array = new int [rows][cows];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * 90) + 10;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("tinh tong so cot ? ");
        int cow  = sc.nextInt();
        System.out.println("tong so cot " + cow + " = ");
        System.out.println(total(array,cow));
    }
    public static int total(int[][] array, int cow) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0 ; j < array[i].length; j++) {
                if(j == (cow - 1)){
                    total += array[i][j];
                }
            }
        }
        return total;
    }
}
