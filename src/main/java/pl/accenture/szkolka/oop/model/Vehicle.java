package pl.accenture.szkolka.oop.model;
// TODO 1 klasa Vehicle z metoda String startEngine() | "Wystartował pojazd"
// TODO 2 klasa: Car, Boat, Plane - dziedziczą z Vehicle, nadpisują startEngine()
// TODO 3 w klasach potomnych dodajemy metody, charakterystyczne dla danego typu
// TODO 4 tablica Vehicle z Car, Boat i Plane
// TODO 5 Iteracja, polimorficzne wywołanie startEngine
// TODO 6 w iteracji, dla danego typu, dodatkowe wywołanie jego charakterystycznej metody
// TODO 7 Test(y)
public class Vehicle {


    public String startEngine(){
        return "Wystartował pojazd";
    }
}
