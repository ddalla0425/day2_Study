package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        //사용자(java api 개발자) 지정 범위의 난수를 발생시킬 수 있다.

        //필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 있다.
        //공식 : (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값


        //1.0 ~9 사이의 난수 발생
        // 0 <= Math.random() < 1 항상 이값을 가진다. >>전부 곱하기 10을 해주면 >> 0*10 <=Math.random() * 10 <1*10
        int random1 = (int) (Math.random() * 10); // 실수 형태의 소숫점을 떼기 위해 (int)로 강제 형변환
        System.out.println("0부터 9사이의 난수 : " + random1);

        //2. 1 ~ 10 사이의 난수 발생
        int random2 = (int) (Math.random() * 10) + 1; // 0 <= Math.random() *10 < 10 만들려면 위의 1번 예제에 +1을 해준다
        System.out.println("1부터 10사이의 난수 : " + random2);

        //3. 10 ~ 15 사이의 난수 발생
        int random3 = (int) (Math.random() * 6) + 10; // 10,11,12,13,14,15 > 6개 필요 하니 곱하기 6해줌
        System.out.println("10부터 15사이의 난수 : " + random3);

        //4. -128 ~ 127 사이의 난수 발생
        int random4 = (int) (Math.random() * 256) - 128 ; // 10,11,12,13,14,15 > 6개 필요 하니 곱하기 6해줌
        System.out.println("-128부터 127사이의 난수 : " + random4);
    }
}
