package aes256;

import java.util.Scanner;

public class AesProgram {
    public static void main(String[] args) {
        AesTool aes_tool = new AesTool();
        Scanner sc = new Scanner(System.in);
        while(true) {
            aes_tool.help();
            System.out.print("번호를 입력하세요 >");
            int select = sc.nextInt();
            if(aes_tool.start(select) == -1) {
                System.out.println("종료.");
                return;
            }
        }
    }

}
