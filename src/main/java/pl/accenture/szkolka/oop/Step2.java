package pl.accenture.szkolka.oop;

import javafx.scene.Parent;

public class Step2 {

}
public class Parent {
    public String name = "Parent";

    public Parent() {
        System.out.println("Parent, konstruktor bezparamentrowy");
    }

    public String getName() {
        return name;
    }
}


public class Child extends Parent {

    public String name;

    public Child() {
        super();
        //nie musimy jawnie tego robic
        System.out.println("Child konstruktor bezparamentrowy");
    }


    public Child(String name) {
        this();
        this.name = name;
        System.out.println("Child konstruktor parametrowy");
    }
        @Override
        public String getName() {
            return String.format("Parent: %s, CHild: %s", super.getName(), name);
        }
    }




