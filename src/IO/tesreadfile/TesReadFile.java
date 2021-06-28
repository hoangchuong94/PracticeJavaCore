package IO.tesreadfile;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TesReadFile {
    public static void main(String[] args) {

        System.out.println("nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.nextLine();

        ReadFileText read = new ReadFileText();
        read.readFileText(inputFile);


    }
}
