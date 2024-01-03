package com.ohgiraffers.section01.method;

public class Calculator {

    public  int minNumber0f(int first , int second) { //인풋으로 인트 타입 2개를 받고
        return first > second ? second : first;  //first second 비교해서 first가 작으면 ? second의 값이 반환(둘중에 작은 값을 반환해 준다)
    }
    public  static  int maxNumber0f (int first, int second) {
        return first > second ? first : second;  //first second 비교해서 first가 작으면 ? first 값이 반환 /큰 값일 경우에 큰값을 반환 하겠다.
    }
}
