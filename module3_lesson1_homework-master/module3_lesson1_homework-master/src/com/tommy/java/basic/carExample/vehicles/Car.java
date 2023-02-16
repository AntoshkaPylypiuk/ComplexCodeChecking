package com.tommy.java.basic.carExample.vehicles;


import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;

public class Car {
    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnLightOn() {
        System.out.println("Включаю фары");
    }

    public void turnLightOff() {
        System.out.println("Выключаю фары");
    }

    public void signalOfTurningRight() {
        System.out.println("Поворачиваю направо");
    }

    public void signalOfTurningLeft() {
        System.out.println("Поворачиваю налево");
    }

    public void openingCarrier() {
        System.out.println("Открываю багажник");
    }

    public void turningBackLight() {
        System.out.println("Включаю подсветку");
    }

    public void cityMode() {System.out.println("Включаю режим езды по городу");}

    public void sportMode() {System.out.println("Включаю режим спорт");}

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}