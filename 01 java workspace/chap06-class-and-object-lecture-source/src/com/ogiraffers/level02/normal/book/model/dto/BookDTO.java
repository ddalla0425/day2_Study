package com.ogiraffers.level02.normal.book.model.dto;

public class BookDTO {
    //필드선언
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    //생성자 선언
    public BookDTO(){
       // System.out.println("호출");
    } //기본생성자
    public BookDTO(String title, String publisher, String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
       // System.out.println("2번째 호출");
    }
    public BookDTO(String title, String publisher, String author,int price,double discountRate){
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;
       // System.out.println("3번쨰 호출");
    }

    //메소드 선언
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public String printInformation() {
        return this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate;
    }
}
