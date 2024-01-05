package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        //5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "번째 학생의 자바 점수 입력 : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0.0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = (double) sum / arr.length;
        System.out.println("합계 점수 : " + sum);
        System.out.println("평균 점수 : " + avg);

    }
}
