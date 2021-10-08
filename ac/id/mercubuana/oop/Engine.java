package ac.id.mercubuana.oop;

public class Engine {
    private float _capacity;
    private int _numberOfCylinder;

    public Engine() {

    }

    public Engine(float capacity, int numberOfCylinder) {
        this._capacity = capacity;
        this._numberOfCylinder = numberOfCylinder;
    }

    public void start() {
        System.out.println("Engine started!, bruum!");
    }

    public void brake() {
        System.out.println("Engine brake");
    }

    public void accerate() {
        System.out.println("Engine accerate");
    }

    public float get_capacity() {
        return this._capacity;
    }

    public void set_capacity(float _capacity) {
        this._capacity = _capacity;
    }

    public int get_numberOfCylinder() {
        return this._numberOfCylinder;
    }

    public void set_numberOfCylinder(int _numberOfCylinder) {
        this._numberOfCylinder = _numberOfCylinder;
    }

}