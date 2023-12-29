package src.com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        // ======기본자료형======
        //1-1-1 숫자를 취급하는 자료형
            //정수를 취급하는 자료형은 4가지가 있다.
            byte bnum; //1byte
            short snum; //2byte
            int inum; //4byte (대표로 쓰임)
            long lnum; //8byte

            //실수를 취급하는 자료형은 2가지가 있다.
            float fnum; //4byte
            double dnum; //8byte (대표로 쓰임)

        //1-1-2 문자를 취급하는 자료형
        char ch;
        //1-1-3 논리 값을 취급하는 자료형
        boolean isTrue;

        // ======참조자료형======
        //1-1-4 문자열을 취급하는 자료형
        String str;

        //2 변수에 값을 대입한다. (값 대입 및 초기화)
        // "=" >> 대입 연산자
        bnum = 1; //┌
        snum = 2; //│ int
        inum = 4; //└
        lnum = 8L; //［ long 대문자 L을 꼭 붙여줘야함
        fnum = 4.0f; //뒤에 f를 붙여 float literal로 만들어 줘야 에러가 안뜸
        dnum = 8.0;
        ch = 'a';
        ch = 97;
        isTrue = true;
        isTrue = false;
        str = "안녕하세요";

        //선언과 동시에 초기화 할 수 있다.
        int point = 100;
        int bonus = 10;

        //3 변수를 사용한다.
        System.out.println("==== 변수에 저장 된 값 출력 ====");
        System.out.println("bnum : " + bnum);
        System.out.println("snum : " + snum);
        System.out.println("inum : " + inum);
        System.out.println("lnum : " + lnum);
        System.out.println("fnum : " + fnum);
        System.out.println("dnum : " + dnum);
        System.out.println("ch : " + ch);
        System.out.println("isTrue : " + isTrue);
        System.out.println("str : " + str);

        //대입 연산자의 왼쪽과 오른쪽에 변수 사용하기
        //대입 연산자의 왼쪽은 공간이라는 의미, 오른쪽은 값이라는 의미이다.
        point = point + 100;
        System.out.println("point : " + point);
    }
}
