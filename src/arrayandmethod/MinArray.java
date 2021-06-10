package arrayandmethod;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao size cua mang");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() *90 ) + 10;
            System.out.print( arr[i] + " ");
        }
        System.out.println("\n" + "gia tri nho nhat trong mang  la : " + min(arr));
    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }


}
