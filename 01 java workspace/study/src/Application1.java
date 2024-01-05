import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //한결's 출제 문제
        //1부터 10까지의 정수 중에 짝수만 출력하는 프로그램을 만드시오
        //(단, 조건문의 사용이 없어야 합니다)

//        int x2 = 0;
//        for (int i = 1; i <= 10; i+=2) {
//            System.out.print((i+1) + " ");
//        }

        //문제만들어보기

        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */
        //1부터 10사이의 정수를 하나 입력받아
        // 그 수가 짝수면 짝수이다.
        //홀수면 홀수이다.
        //1부터 10 사이의 수가 아니면 "1부터 10사이의 숫자를 입력해주세요"
        //

        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 10사이의 정수를 하나 입력해 주세요 : ");
        int inum = sc.nextInt();
        if(!(inum < 1 && inum > 10)) {
            System.out.println("1부터 10 사이의 숫자만 입력 가능합니다.");
        }

//        for(int i=1; i<=10;i++){
//
//        }
//        if (inum > 0) {
//            System.out.println("양수다");
//        } else {
//            System.out.println("양수가 아니다");
//        }

    }
}
