package arrayandmethod;

import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cot matrix :");
        int cow = sc.nextInt();
        System.out.println("Nhap hang matrix : ");
        int row = sc.nextInt();

        int[][] matrix = new int[row][cow];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.floor(Math.random()*5)+5;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("tong duong cheo chinh : ");
        System.out.println(mainDiagonal(matrix));
    }
    public static int mainDiagonal(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <= i; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }
}
