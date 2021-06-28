package oop.sendmessage;

import java.util.Scanner;

public class TesMessenger {
    public static void main(String[] args) {
        Phone phone = new Iphone("IPHONE X", 2021, "ME");
        Phone phone1 = new Iphone("NOKIA", 1080, "YOU");
        System.out.println(phone);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        phone.setText(text);
        System.out.println(phone1);
        phone1.displayMessage();

    }
}
