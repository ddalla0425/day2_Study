package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */
        int[] arr = new int[10];
        //int value = 0; 이렇게 쓸수도 있지만, 밑의 for문의 초기식 안에 넣은 이유는 for라는 스코프 (범위) 밖에서 쓸일이 없을거라 판단하여 이렇게 쓴것
        //만약 value 변수를 메인 스코프(범위) 안에서 쓸일 이 또 있었다면 밖에서 선언 했을것.
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;

            System.out.println("arr[" + i + "] 값은 : " + arr[i]);
        }
    }
}
