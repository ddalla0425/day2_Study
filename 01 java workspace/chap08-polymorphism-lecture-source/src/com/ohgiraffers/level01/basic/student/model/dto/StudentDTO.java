package com.ohgiraffers.level01.basic.student.model.dto;

public class StudentDTO {
    //필드선언 -----------------------
    private int grade; //학년
    private int classroom; //반
    private  String name; // 이름
    private int kor; //국어점수
    private int eng; //영어점수
    private int math; //수학점수

    //생성자선언 -----------------------
    public StudentDTO(){
        System.out.println("기본 호출 확인...");
    }
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math){
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

//        System.out.println("학년 : " + grade);
//        System.out.println("반 : " + classroom);
//        System.out.println("이름 : " + name);
//        System.out.println("국어점수 : " + kor);
//        System.out.println("영어점수 : " + eng);
//        System.out.println("수학점수 : " + math);
    }

    //메소드선언 -----------------------
    public String getInformation() {
        return "학년=" + grade
                + ", 반=" + classroom
                + ", 이름=" + name
                + ", 국어=" + kor
                + ", 영어=" + eng
                + ", 수학=" + math;
    }

        //----getter 메소드
    public int getGrade() {
        return grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }
        //----setter 메소드
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMath(int math) {
        this.math = math;
    }

}
