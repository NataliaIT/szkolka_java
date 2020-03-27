package pl.accenture.szkolka.oop.model;

public class Boat extends Vehicle {

    @Override
    public String startEngine() {
        super.startEngine();
    }

    public String endEngine(){
        return "Wyłączamy silniki";
    }

}
