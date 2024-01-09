package com.ogiraffers.section07;

public class kindsofvariable {
    //다양한 변수를 이해하고 사용할 수 있다.
    //이곳에 선언하면 전역 변수 > 전역 변수를 나눠 보자면

        //non-static field를 인스턴스 변수라고 한다(인스턴스 생성 시점에 사용 가능한 변수) ┐
        private int globalNum;                                              //   │

        //static field를 클래스 변수라고 한다(정적 메모리 영역에 생성 되는 변수 )         ├> 전역변수
        private static int staticNum;                                       //   ┘

    public void method1(int num) { //(int num)>매개변수(method라는 메서드 안에서만 쓸수 있는일종의 지역변수)
        int localNum; //지역 변수>> 지역변수는 반드시 초기화 해야함!!

        //매개변수는 호출 시 값이 전달 되므로 별도의 초기화는 필요 없다.
        System.out.println("num : "+num); //에러 안남

        //위의 지역 변수 초기화 안하면 아래와 같이 에러남
        //System.out.println("localNum : "+localNum); //에러남

        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }
    public void method2() {
        //지역 변수는 해당 지역(블럭 내) 에서만 사용이 가능하며
        //전역 변수는 클래스 내의 모든 영역에서 사용할 수 있다.
        //System.out.println("localNum : " + localNum); // method1번의 지역변수를 method2안에서 사용하려니 에러남
        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }


}
