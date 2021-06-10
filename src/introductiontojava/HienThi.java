package introductiontojava;

import java.util.Scanner;

public class HienThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = -1;
        while (a != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. exit");
            a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                case 2:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                case 3:
                    System.out.println("****");
                    System.out.println("******");
                    System.out.println("*******");
                    System.out.println("*********");
                    System.out.println("**********");
                case 0:
                    break;

            }
        }
    }
}
