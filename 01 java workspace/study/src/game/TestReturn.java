package game;

import java.util.Scanner;

public class TestReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("시작할래?"); //게임 시작 문구
            String str1 = sc.nextLine();

            if(str1.equals("n")) {
                System.out.print("종료할래?");
                String str2 = sc.nextLine();
                /*if(str2.equals("y").toLow){
                    break;
                }*/
            }


        }//while
    }
}
