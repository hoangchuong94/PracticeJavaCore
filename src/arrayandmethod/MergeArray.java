package arrayandmethod;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang 1:");
        int sizeArray1 = sc.nextInt();
        int[] array1 = new int[sizeArray1];
        for (int i = 0; i < sizeArray1; i++) {
            System.out.print("nhap vao gia tri " + (i + 1) + " cua mang 1:");
            array1[i] = sc.nextInt();
        }
        System.out.println("nhap do dai mang 2:");
        int sizeArray2 = sc.nextInt();
        int[] array2 = new int[sizeArray2];
        for (int i = 0; i < sizeArray2; i++) {
            System.out.print("nhap vao gia tri " + (i + 1) + " cua mang 2:");
            array2[i] = sc.nextInt();
        }
        int[] array = Merge(array1,array2);
        System.out.println("Mang sau khi gop :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] Merge(int[]array1, int[]array2) {
        int[] array = new int[array1.length + array2.length];
        int size = 0;
        for (int i = 0; i < array1.length; i++) {
            array[size] = array1[i];
            size++;
        }
        for (int j = 0; j < array2.length; j++) {
            array[size] = array2[j];
            size++;
        }
        return array;
    }
}
