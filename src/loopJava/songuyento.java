package loopJava;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter in : ");
        n = scanner.nextInt();
        if(n < 2){
            System.out.print("khong co so nguyen to hien thi");
        }else
            for (int i = 2; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) count += 1;
            }if (count == 2) System.out.print("so nguyen to " + i + "\n");
        }
    }
}
