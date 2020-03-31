package pl.accenture.szkolka.lambda;

public class Lambda {
    public static void main(String[] args) {

        MyInterface impl1 = new KlasycznaImplementacja();

        //tworzymy w locie anonimowa implementację
//        MyInterface impl2 = new MyInterface() {
//            @Override
//            public String go() {
//                return null;
//            }
//        };
        //tworzymy w locie anonimowa implementację ALT+Enter replace with
        MyInterface impl2 = () -> null;

        System.out.println(impl1);
        System.out.println(impl2);

    }
}

interface MyInterface{
    String go();
}
//klasyczna implementacja

class KlasycznaImplementacja implements MyInterface{

    @Override
    public String go() {
        return null;
    }

}
