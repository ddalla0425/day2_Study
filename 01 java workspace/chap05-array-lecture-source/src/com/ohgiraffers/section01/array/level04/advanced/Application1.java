package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요
         * */
        int[] num = new int[6];
        for(int i=0;i<num.length; i++){
           num[i] = (int)(Math.random()*45)+1;
           for(int j=0; j<i; j++){
               if(num[i]==num[j]){
                   i--;
                   break;
               }
           }
        }
        Arrays.sort(num);
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        System.out.println(num[5]);
       Arrays.toString(num);
       for(int i=0;i<num.length;i++){
           System.out.print(num[i]+ " ");
       }
    }
}
