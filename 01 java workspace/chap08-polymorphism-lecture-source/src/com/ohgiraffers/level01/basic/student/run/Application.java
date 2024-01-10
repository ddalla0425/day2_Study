package com.ohgiraffers.level01.basic.student.run;

import com.ohgiraffers.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        StudentDTO[] student = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int count = 0;
        while (true) {

            System.out.print("학년 : ");
            int grad = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            student[num] = new StudentDTO(grad, classroom, name, kor, eng, math);
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");

            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {

            }else {
                continue;
            }

            count++;
            System.out.println(student[count].getInformation());
        }
        System.out.println("while 밖");
    }
}
