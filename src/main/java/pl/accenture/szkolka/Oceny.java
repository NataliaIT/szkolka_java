package pl.accenture.szkolka;

import java.util.Scanner;

// Wszystkie implementacje - razem z testami JUnit
// TODO 1 zaimplementuj metodę z uzyciem if
// TODO 2 zaimplementuj metodę z uzyciem switch
// TODO 2 zaimplementuj metodę z uzyciem (do) while
// TODO 3 zaimplementuj metodę z uzyciem for i break
// TODO 4 zaimplementuj metodę z uzyciem foreach i continue
// TODO 5 Zaimplementuj dowolną metodę przyjmującą jako parametr vararg
/*
        TODO 6 Zaimplementuj w metodę, która przeiteruje po poniższych tablicach i zaloguje wartości (przykład poniżej):
          1-2-3-4-5-6-7-8
          ...{
                {
                    {1,2}, {3,4}
                },
                {
                    {5,6}, {7,8}
                }
            };
 */
public class Oceny {

    public static String bardzoDobry = "bardzo dobry";
    public static String dobry = "dobry";
    public static String dostateczny = "dostateczny";
    public static int liczbaPunktow;
    public static int[][][] tab = {
            {
                    {1, 2}, {3, 4}
            },
            {
                    {5, 6}, {7, 8}
            }
    };

    public static String out = "";
    public static int liczba1 = 5;
    public static int parzysta = 6;
    public static int[] tablicaPrzykladowa ={1,2,3,4,5,6};


//    public static void menu() {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Wprowadz ilosc punktow:");
////        liczbaPunktow = scanner.nextInt();
////        scanner.nextLine();
////        System.out.println("Twoja ocena to:" + jakaOcenaIF());
////        System.out.println("Twoja ocena to:");
////        jakaOcenaSWITCH();
//
//    }

    public static String jakaOcenaIF(int liczbaPunktow) {

            if (liczbaPunktow == 5) {
                return bardzoDobry;
            } else if (liczbaPunktow == 4) {
                return dobry;
            } else if (liczbaPunktow == 3) {
                return dostateczny;
            }
            return "";
    }

    public static void jakaOcenaSWITCH(int liczbaPunktow) {

        switch (liczbaPunktow) {
            case '3':
                System.out.println("dostateczny");
                break;
            case '4':
                System.out.println("dobry");
                break;
            case '5':
                System.out.println("bardzo dobry");
                break;
            default:
                System.out.println("");
        }
    }
public static void doWhilePrzyklad(){
        do {
            System.out.println("Przyklad DO-WHILE: Robimy cos");
            liczba1++;
        }
        while (liczba1 != 6 );

}

public static void przykladForBreak(){
    for (int i : tablicaPrzykladowa) {
        if(i%2 ==0){
            System.out.println(" Przyklad break: " + i+ " jest podzielne przez 2");
        }
        else
            break;
    }
}

// TODO 4 zaimplementuj metodę z uzyciem foreach i continue

    public static void przykladForEachContinue(){
        for (int i : tablicaPrzykladowa) {
            if(i%3==0){
                System.out.println("Przyklad continue: " + i + " jest podzielne przez 3");
            }
            else if (i%3 !=0){
                continue;
            }

        }

    }

// TODO 5 Zaimplementuj dowolną metodę przyjmującą jako parametr vararg



    public static void tablicaPrzyklad() {
        for (int[][] ints : tab) {
            for (int[] antInt : ints) {
                for (int i : antInt) {
                    out = out + "-" +String.valueOf(i);
                }

            }

        }
        System.out.println(out);
    }

}
