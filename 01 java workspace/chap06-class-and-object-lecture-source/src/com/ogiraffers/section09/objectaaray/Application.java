package com.ogiraffers.section09.objectaaray;

public class Application {
    public static void main(String[] args) {
        //객체 배열에 대해 이해할 수 있다.

        //동일 타입의 인스턴스를 여러 개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용이 가능하다.
        Car[] carArray = new Car[5];

        //carArray의 각 인덱스는 기본 값 null로 초기화 되어 있기 때문에 인덱스 별로 인스턴스를 생성해야 한다.
        carArray[0] = new Car("랜드로버",300);
        carArray[1] = new Car("벤츠",300);
        carArray[2] = new Car("롤스로이스",300);
        carArray[3] = new Car("부가티",300);
        carArray[4] = new Car("아우디",300);

        //배열은 반복문을 통해 일괄 처리가 가능하다는 장점이 있다.
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        //객체 배열도 할당과 동시에 초기화 할 수 있다.
        Car[] carrArray2 = {
          new Car("랜드로버",300),
          new Car("벤츠",300),
          new Car("롤스로이스",300),
          new Car("부가티",300),
          new Car("아우디",300)
        };

        //향상 된 for문, for each문도 사용이 가능하다.
        for(Car car : carrArray2) {
            car.driveMaxSpeed();
        }
    }
}
