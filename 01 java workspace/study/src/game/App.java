package game;

import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

            game.gameStartPrint(); //게임 시작 문구
            String str1 = sc.nextLine();
        while(true){
            if(str1.equals("y")|| str1.equals("Y")){
                System.out.println("케릭터를 생성 하시겠습니까? Y/N");
                //char ch2 = sc.next().charAt(0)
            }else if(str1.equals("n")|| str1.equals("N")) {
                game.gameExitPrint();
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }


        //game.gameInfoPrint();
       // System.out.println(startCh);
    }
}
