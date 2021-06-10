package arrayandmethod;

import java.util.Scanner;

public class AddElemenArray {
    public static void main(String[] args) {
        System.out.print("nhap vao kik thuoc mang : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size + 1];
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu cua mang " + (i + 1)+ " :");
            array[i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi them");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "nhap vao gia tri muon them");
        int value = sc.nextInt();
        System.out.println("nhap vi tri muon them");
        int index = sc.nextInt();
        if(index >= 1 && index < array.length){

            System.out.println("\n" + "mang sau khi them");
            int[] newarray = add(array,index,value);
            for (int j : newarray) {
                System.out.print(j + " ");
            }
        }else {
            System.out.println("khong tim thay vi tri mon chen");
        }
    }
    public static int seach(int[] array, int index) {

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == index) {
                return i;
            }
        }
        return -1;
    }

    public static int[] add(int[] array, int index, int value) {
        int index0f = seach(array,index);
        for (int i = array.length - 1; i > index0f; i--) {
            array[i] = array[i - 1];
        }
        array[index0f] = value;
        return array;
    }
}
