package introductiontojava;

import java.util.Scanner;

public class weightIBM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Can nag cua ban (kg)");
        weight = sc.nextDouble();

        System.out.println("Chieu cao cua ban (met)");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);

        if(bmi < 18){
            System.out.printf("%-20s%s", bmi, "Gay");
        }else if(bmi < 25.0){
            System.out.printf("%-20s%s", bmi, "Binh thuong");
        }else if(bmi < 30.0){
            System.out.printf("%-20s%s", bmi, "Thua can");
        }else {
            System.out.printf("%-20s%s", bmi, "Beo phi");
        }




    }
}
