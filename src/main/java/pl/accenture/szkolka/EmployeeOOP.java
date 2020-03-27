package pl.accenture.szkolka;

public class EmployeeOOP extends PersonOOP {

    @Override
    void introduceMyself() {
        super.introduceMyself();
        System.out.println("Pracuję we własnej firmie");
    }

    void getNewJob() {
        System.out.println("Nowa praca");
    }
}
