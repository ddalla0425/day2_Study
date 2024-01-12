package game;

import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        boolean executeProgram = true;

        while(executeProgram){
            game.gameStartPrint(); //게임 시작 문구
            String str1 = sc.nextLine();

            if(str1.toLowerCase().equals("y")){
                System.out.println("케릭터를 생성 하시겠습니까? Y/N");
                String str2 = sc.nextLine();
                if(str2.toLowerCase().equals("n")){
                    game.gameExitPrint();
                } else{

                }
            }else if(str1.toLowerCase().equals("n")) {
                game.gameExitPrint();//게임 종료 문구
            }
        }
        System.out.println("while문 나왔는데?");



    }
}
