package ClassStudy;
import java.util.Scanner;
public class WhileTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;  // 반복 횟수를 저장할 변수 초기화

        while (count < 10) {
            System.out.print("입력하세요: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("조건")) {
                System.out.println("true");
                count++;
            } else {
                System.out.println("잘못입력하셨습니다. 다시입력해주세요");
            }
        }

        System.out.println("프로그램이 종료되었습니다.");
        scanner.close();
    }
}