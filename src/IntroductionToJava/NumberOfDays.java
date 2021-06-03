package IntroductionToJava;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap Thang Ban Muon Dem Ngay");
        int month = sc.nextInt();

        switch (month){
            case 2:
                System.out.println("Thang 2 Co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang" + month + " co 31 ngay");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11:
                System.out.println("Thang 6 co 30 ngay");
                break;
            default:
                System.out.println("Thang Khong Hop Le");
                break;

        }
    }
}
