package ac.id.mercubuana.oop;

import ac.id.mercubuana.oop.Engine;

public class Car extends Engine {
    private String _registeredNum, _licensedNumber;
    private int _year;

    public Car(String registeredNum, int year, String licensedNumber) {
        this._registeredNum = registeredNum;
        this._year = year;
        this._licensedNumber = licensedNumber;
    }

    public void moveForward() {
        System.out.println("Car move forward, ngeeng;");
    }

    public void moveBackward() {
        System.out.println("Car move backward");
    }

    public void stop() {
        System.out.println("Car stoping ...");
    }

    public void turnRight() {
        System.out.println("Car turning right ->");
    }

    public void turnLeft() {
        System.out.println("Car turning left <-");
    }

    public String get_registeredNum() {
        return this._registeredNum;
    }

    public void set_registeredNum(String _registeredNum) {
        this._registeredNum = _registeredNum;
    }

    public String getLicensedNumber() {
        return this._licensedNumber;
    }

    public void setLicensedNumber(String licensedNumber) {
        this._licensedNumber = licensedNumber;
    }

    public int get_year() {
        return this._year;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

}