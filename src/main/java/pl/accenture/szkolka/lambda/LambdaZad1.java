package pl.accenture.szkolka.lambda;

public class LambdaZad1 {

    public static void main(String[] args) {

        //TODO 1c anonimowa implementacja

        MyInterface1 anonimowa1 = new MyInterface1() {
            @Override
            public void go() {
                System.out.println("Anonimowa implementacja");
            }
        };

        MyInterface1 lamba1 =() -> System.out.println("Lambda1");

    }
}

//TODO 1a - tworzymy interfejs funkcyjny
@FunctionalInterface
interface MyInterface1{
    void go();
}

//TODO 1b - klasyczna implementacja

class Klasycznie1 implements MyInterface1{
    @Override
    public void go() {
        System.out.println("Klasyczna implementacja");
    }
}
