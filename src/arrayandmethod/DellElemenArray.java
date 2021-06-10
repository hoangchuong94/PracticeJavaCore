package arrayandmethod;

import java.util.Scanner;

public class DellElemenArray {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f"};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] +" ");
        }
        System.out.println("\n Nhap vao phan tu muon xoa");
        String x = sc.nextLine();
        System.out.println("mang Sau khi xoa");
        String[] arr2 = delete(array,x);
        for(int i=0;i<arr2.length-1;i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static int seachElement(String[] array, String x) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(x)){
                return i;
            }
        }
        return -1;
    }

    public static String[] delete (String[] array,String x) {
            int set = seachElement(array, x);
            if(set == -1){
                System.out.println("Khong tim thay phan tu muon xoa");
            }
            else{
                for (int i = set; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            return array;
    }
}