package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴 값으로 활용할 수 있다. */

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("name의 hashCode : " + names.hashCode());

        /* 1. 인자와 매개변수로 활용 */
        print(names);

        /* 2. 리턴 값으로 활용 */
        String[] animalsVariable = getAnimals(); // getAnimals라는 메소드를 호출 하여 그 안에 있는 값(animals라는 참조변수 주소와 배열의 값)을 String타입의 animalsVariable이라는 참조변수에 대입한다.

        System.out.println("리턴 받은 animals의 hashCode : " + animalsVariable.hashCode()); //아래서 리턴 받은 animals의 값을 animalsVariable에 넣어두고 그값의 hashCode를 출력해라.

        print(animalsVariable); //getAnimals라는 (그안에 선언된 animals 깂) 을 참조한 animalsVariable을 출력해라.
    }

    public static void print(String[] sarr) { // sarr에 String타입의 배열을 전달 받으면 값을 출력하는 메소드

        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for(int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() { // animals라는 참조 변수를 선언하고 , 낙타 호랑이 나무늘보 라는 값을 할당한후 그 animals 참조변수 값을 리턴해주는 메소드

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals의 hashCode : " + animals.hashCode());

        return animals;

    }

}