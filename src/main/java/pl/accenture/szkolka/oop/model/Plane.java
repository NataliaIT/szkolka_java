package pl.accenture.szkolka.oop.model;

// TODO 2 klasa: Car, Boat, Plane - dziedziczą z Vehicle, nadpisują startEngine()
public class Plane extends Vehicle {

    @Override
    public String startEngine() {
        super.startEngine();
    }

    public String endEngine(){
        return "Wyłączamy silniki";
    }
}
