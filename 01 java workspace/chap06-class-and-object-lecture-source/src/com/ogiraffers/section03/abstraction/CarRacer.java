package com.ogiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    public void startUp() {
        car.startUp();  //1. (차의) 시동을 걸 수 있다.
    }

    public void stepAccelator() {
        car.go();  //2. (차의) 엑셀을 밟을 수 있다.
    }

    public void stepBreak(){
        car.stop(); //3. (차의) 브레이크를 밟을 수 있다.
    }

    public void turnOff(){
        car.turnOff();  //4. (차의) 시동을 끌 수 있다.
    }
}
