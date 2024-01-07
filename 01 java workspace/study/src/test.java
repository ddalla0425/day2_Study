import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 랜덤 숫자 출력 문제
        //
        // 자바허니블랙티 팀원 네 명의 이름을 입력받고,
        // 각자에게 1부터 4까지의 숫자를 랜덤으로 부여한다.
        //
        // -- 입력 예시 --
        // 팀원의 이름을 입력하세요 : 최시온
        // 팀원의 이름을 입력하세요 : 이소율
        // 팀원의 이름을 입력하세요 : 조한결
        // 팀원의 이름을 입력하세요 : 김다솔
        // -- 출력 예시 --
        // 김다솔은 1번, 조한결은 2번, 이소율은 3번, 최시온은 4번입니다.
        // 다음주는 위와 같은 순서대로 문제 출제바랍니다.

        String[] nameArr = new String[4];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<4; i++) {
            System.out.println("팀원의 이름을 입력하세요 : ");
            String name = sc.nextLine();
            nameArr[i] = name;
        }

        Random random = new Random();

        int[] numArr = new int[4];
        for (int i=0; i<4; i++) {
            int num = random.nextInt(4)+1;
            numArr[i] = num;
        }

        System.out.println( nameArr[0] + "은 " + numArr[0] + "번, " +
                nameArr[1] + "은 " + numArr[1] + "번, " +
                nameArr[2] + "은 " + numArr[2] + "번, " +
                nameArr[3] + "은 " + numArr[3] + "번입니다. " );
        System.out.println("다음주는 위와 같은 순서대로 문제 출제바랍니다.");
    }
}