import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("========================CIKLAI==========================");
        System.out.println("---------------1.uzd.----------------------");
        //Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("Labas " + i);

        }

        System.out.println("---------------2.uzd.-------------------");
        //Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        System.out.println("---------------3.uzd.------------------");
        //Sukurkite masyvą su dešimt augalų pavadinimų.
        //  0           1           2              3        4           5           6           7               8           9
        String[] augalai = {"orhideja", "sansevejra", "lapenis", "dracena", "guzmanija", "bonsai", "papartis", "sukulentas", "puansetija", "skindapas"};


        System.out.println("---------------4.uzd.-----------------");
        //Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        for (int i = 0; i < augalai.length; i++) {
            System.out.println(augalai[i]);
        }


        System.out.println("---------------5.uzd.-----------------");
        //Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo
        //paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        for (int i = augalai.length - 1; i >= 0; i--) {
            System.out.println(augalai[i]);

        }

        System.out.println("---------------6.uzd.-----------------");
        //Atspausdinkite kas antrą skaičių nuo 10 iki 50 (pornius);

        for (int i = 10; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("---------------7.uzd.-----------------");
        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (pornius) Jei
        //skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite
        //continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie
        //dalinasi iš 10 be liekanos)

        for (int i = 10; i < 50; i++) {
            if (i % 10 == 0) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("---------------8.uzd.-----------------");
        //Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek
        //kartų kintamasis i turėjo porinę reikšmę;

        int porineReiksme = 0;

        for (int i = 0; i < 21; i++) {

            if (i % 2 == 0) {
                System.out.println(i);

                porineReiksme++;
            }
        }
        System.out.println("porininiu skaiciu rasta " + porineReiksme);


        System.out.println("---------------9.uzd.-----------------");
        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių
        //nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

        int uzd1 = 0;
        int uzd2 = 0;

        for (int i = 0; i < 10; i++) {
            if (augalai.length < 5) {
                uzd1++;
            }
        }

        System.out.println("Augalu pavadinimai trumpesni nei 5 raides: " + uzd1);

        {
            if (augalai.length > 7) {

                uzd2++;
            }
        }
        System.out.println("Augalu pavadinimai ilgesni nei 7 raides: " + uzd2);


        System.out.println("---------------10.uzd.-----------------");
        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei
        //5 simboliai bet trumpesnių nei 10 simboliai. (tarp 5 ir 10 simbolių
        //ilgio)


        int count = 0;
        for (int i = 0; i < 10; i++) {
            if ((augalai[i].length() > 5) && (augalai[i].length() < 10)) {
                count++;
            }
        }
        System.out.println("Zodziu, ilgesniu nei 5 raides ir trumpesniu nei 10 raides, suma: " + count);


        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("---------------1.1.uzd.-----------------");

        int count1 = 0;

        for (int i = 0; i < 301; i++) {
            System.out.println(i);
            System.out.println();
            {
                if (i > 274)
                    System.out.println(" [" + i + "]");

            }
        }


//        System.out.println("---------------1.2.uzd.-----------------");
//        for (int i = 1; i < 3000; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//                continue;
//
//            }
//        }

        System.out.println("---------------1.3.uzd.-----------------");





















    }
}




















































































