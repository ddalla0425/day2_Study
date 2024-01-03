package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        //매개변수와 리턴 값을 복하적으로 활용해볼 수 있다.

        int first = 10;
        int second = 20;


        Application7 app7 = new Application7();

        System.out.println("더하기 : " + app7.plusTowNumbers(first,second));
        System.out.println("빼기 : " + app7.miusTowNumbers(first,second));
        System.out.println("곱하기 : " + app7.multipleTowNumbers(first,second));
        System.out.println("나누기 : " + app7.divideTowNumbers(first,second));

    }
    public int plusTowNumbers (int first , int second) {
        return first + second;
    }
    public int miusTowNumbers (int first , int second) {
        return first - second;
    }
    public int multipleTowNumbers (int first , int second) {
        return first * second;
    }
    public int divideTowNumbers (int first , int second) {
        return first / second;
    }
}
