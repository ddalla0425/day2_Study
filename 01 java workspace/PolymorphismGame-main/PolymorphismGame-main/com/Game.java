
package com.ohgiraffers.section00.hw;

import java.util.Scanner;

public class Game {
    private String characterName;
    private int characterHp;

    public Game(String characterName, int characterHp) {
        this.characterName = characterName;
        this.characterHp = characterHp;
    }

    public void changedHp(int amount) {
        this.characterHp += amount;
        if (this.characterHp < 0) {
            this.characterHp = 0;
        }

        System.out.println("체력이 " + this.characterHp + "가 되었습니다.");
    }

    public void gameStartPrint() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("           게임을 시작 하시겠습니까?");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("         게임 시작 Y  │  게임 종료 N    : ");
    }

    public void gameCharacter() {
        System.out.println();
        System.out.println();
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("           캐릭터가 생성 되었습니다.");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println("              이름 : " + this.characterName);
        System.out.println("                HP : " + this.characterHp);
    }

    public void gameExitPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("           게임을 종료 하시겠습니까?");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("          게임 종료 Y  │  돌아 가기 N    : ");
        String str1 = sc.nextLine();
        if (str1.toLowerCase().equals("y")) {
            System.out.println();
            System.out.println();
            System.out.println("게임을 종료합니다...");
            System.exit(0);
        } else if (!str1.toLowerCase().equals("n")) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
        }

    }

    public void gameInfoPrint() {
        System.out.println();
        System.out.println();
        System.out.println("[좀비 촹궐] 게임을 시작합니다...");
        System.out.println();
        System.out.println();
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("       [좀비 촹궐]에 오신것을 환영합니다.");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println();
        System.out.println();
        System.out.println("[[간단한 설명]]");
        System.out.println();
        System.out.println("학원에서 개발을 배우던 중,");
        System.out.println("갑작스럽게 좀비 사태가 발생 했습니다.");
        System.out.println("가까스로 목숨을 건진 당신!");
        System.out.println("사태가 해결되기 전까지 살아남으세요.");
        System.out.println();
        System.out.println("*HP가 0이 되면 죽습니다.");
        System.out.println("-파밍해서 자원을 얻거나, 휴식을 통해 HP는 증가합니다.");
        System.out.println("-하루가 지나면 장소를 이동할 수 있습니다.");
        System.out.println("-HP가 100을 달성하면 구출됩니다.");
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterHp() {
        return this.characterHp;
    }

    public void setCharacterHp(int characterHp) {
        this.characterHp = characterHp;
    }
}