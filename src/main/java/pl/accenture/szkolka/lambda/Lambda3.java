package pl.accenture.szkolka.lambda;

import java.sql.SQLOutput;

public class Lambda3 {
    public static void main(String[] args) {
        MyInterface3 anonimowa3 = new MyInterface3(){
            @Override
            public String go(String name) {
                return "Anoninoma implementacja 3";
            }
        };

        MyInterface3 lambda3 = () - > System.out.println("Lambda");
    }


}

@FunctionalInterface
interface MyInterface3 {
    String go(String name);

}

class Klasycznie3 implements  MyInterface3{
    @Override
    public String go(String name) {
        return "Klasyczna implementacja 3";
    }
}
