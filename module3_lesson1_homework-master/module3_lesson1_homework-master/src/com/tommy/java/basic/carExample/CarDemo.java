package com.tommy.java.basic.carExample;

import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;
import com.tommy.java.basic.carExample.vehicles.*;

public class CarDemo {

    public static void main(String[] args) {

        Driver bmwDriver = new Driver();
        bmwDriver.setFullName("Иванов В.В.");
        bmwDriver.setAge(50);
        bmwDriver.setExperience(30);

        Engine bmvEngine = new Engine();
        bmvEngine.setPower(60);
        bmvEngine.setProducer("Bmw");

        Car car = new Car();
        car.setProducer("Bmw");
        car.setaClass("C");
        car.setWeight(5000);
        car.setDriver(bmwDriver);
        car.setEngine(bmvEngine);

        Driver lorryDriver = new Driver();
        lorryDriver.setFullName("Петров");
        lorryDriver.setAge(45);
        lorryDriver.setExperience(20);

        Engine lorryEngine = new Engine();
        lorryEngine.setPower(30);
        lorryEngine.setProducer("LorryEngine");

        Lorry lorry = new Lorry();
        lorry.setProducer("Грузовик");
        lorry.setaClass("D");
        lorry.setWeight(8000);
        lorry.setDriver(lorryDriver);
        lorry.setDriver(lorryDriver);
        lorry.setLiftingCapacity(70);

        Driver sportDriver = new Driver();
        sportDriver.setFullName("Сидоров В.В.");
        sportDriver.setAge(30);
        sportDriver.setExperience(15);

        Engine sportEngine = new Engine();
        sportEngine.setPower(80);
        sportEngine.setProducer("SportEngine");

        SportCar sportCar = new SportCar();
        sportCar.setProducer("SportCar");
        sportCar.setaClass("C");
        sportCar.setDriver(sportDriver);
        sportCar.setEngine(sportEngine);
        sportCar.setSpeed(300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}