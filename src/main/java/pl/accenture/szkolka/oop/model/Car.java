package pl.accenture.szkolka.oop.model;

public class Car extends Vehicle {

    @Override
    public String startEngine() {
        super.startEngine();
    }

    public String endEngine(){
        return "Wyłączamy silniki";
    }

}
