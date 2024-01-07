package com.ohgiraffers.section03.copy;

import javax.sound.midi.Soundbank;

public class Application4 {
    public static void main(String[] args) {
        //향상 된 for문을 이해하고 활용할 수 있다.

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone();

        //기존 for문을 이용해 인덱스 값을 10씩 누적 증가
        for (int i=0; i< arr1.length; i++) {
            arr1[i] += 10;
        }
        for (int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //향상된 for문 : jdk 1.5 버전부터 추가 된 문법
        //배열 인덱스에 차례로 접근해서 심시로 사용할 변수에 값을 담고 반복문을 실행한다.
        //for(int i : arr2) { //:의오른쪽엔 이 반복문에서 반복하고자 하는배열의 레퍼런스 변수명을 쓴다. arr2라는 배열을 반복문에서 반복할거다.
        for(int i : arr2) { //:의왼쪽엔 그 배열의 인덱스의 차례로 접근했을때 가지는 데이타 타입으로. 임시변수를 하나 선언하세요
            i += 10;
        }

        //향상 된 for문은 배열 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다
        //인덱스에 접근해서 값을 변경한 것이 아니라 꺼낸 값을 복사해서 사용하고 있기 때문이다
        //대신 변경이 아니라 사용이 목적인 경우 더 편리하게 사용할 수 있다.

        for(int i : arr2) {
            System.out.print(i+" ");
        }
        System.out.println();

        double[] darr = {1.0,2.0,3.0,4.0,5.0};
        for(double num : darr ) {
            System.out.print(num + " ");
        }
    }
}
