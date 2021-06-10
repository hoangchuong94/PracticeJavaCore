package introductiontojava;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tien can chuyen doi USD");
        Scanner sc = new Scanner(System.in);

        double usd = sc.nextDouble();
        double VND = usd * 24000;

        System.out.println(usd + " = " + VND + "vnd");

    }
}
