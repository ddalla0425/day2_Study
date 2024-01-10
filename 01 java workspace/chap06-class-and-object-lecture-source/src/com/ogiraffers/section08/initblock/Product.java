package com.ogiraffers.section08.initblock;

public class Product {
    //필드선언부
    //1. 필드를 초기화 하지 않으면 JVM이 정한 기본 값으로 초기화 되며 객체가 생성된다.
/*    private String name;
    private int price;
    private static String brand;*/

    //2. 명시적 초기화
    private String name = "사과폰";
    private int price = 1000000;
    private static String brand = "아폴";

    //3. 초기화 블럭
    //인스턴스 초기화 블럭
    {
        name = "갤록쉬";
        price = 800000;
        //static 초기화 블럭에서 이미 "쌈송"으로 초기화 되어 있지만
        //인스턴스 생성 시 다시 인스턴스 초기화 블럭이 동작하며 "헬쥐"로 값이 변경(덮어씌움)된다
        brand = "헬쥐";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }
    //static 초기화 블럭
    static {
        brand = "쌈송";

        /*//static 초기화 블럭에서는 non-static 필드를 초기화 할수 없다.
        //정적 초기화 블럭 동작 시에는 인스턴스가 존재하지 않기 때문이다
        name = "폴더폰";
        price = 1200000;*/
        System.out.println("static 초기화 블럭 동작함");
    }

    //생성자 선언부---------------------------------------
    public Product(){
        System.out.println("기본 생성자 동작함...");
    }
    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작함...");
    }

    //메소드 선언부---------------------------------------
    //게타세타
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }
    public String getInformation(){
        return "Product[name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
    }

}
