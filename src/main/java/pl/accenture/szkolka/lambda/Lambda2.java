package pl.accenture.szkolka.lambda;

public class Lambda2 {
    public static void main(String[] args) {

        //TODO 2c anonimowa implementacja

        MyInterface2 anonimowa2 = new MyInterface2() {
            @Override
            public String go() {
                return "Anonimowa implementacja!";
            }
        };

        MyInterface2 lamba2 =() -> System.out.println("Lambda2");

    }
}

//TODO 2a - tworzymy interfejs funkcyjny
@FunctionalInterface
interface MyInterface2{
    String go();
}

//TODO 2b - klasyczna implementacja

class Klasycznie2 implements MyInterface2{
    @Override
    public String go() {
return "Klasyczna implementacja!"
    }
}
