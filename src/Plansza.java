public class Plansza implements Drukowalny {

    static char[] plansza = new char[9];
    static int numerek = 0;

    Plansza() {

        for (int i = 0; i < 9; i++) {

            plansza[i] = '-';
        }
    }

    @Override
    public void drukuj() {


        if (Gra.getRuch().get(numerek).getGracz() == 1) {

            plansza[Gra.getRuch().get(numerek).getRuch()] = 'X';
        } else {

            plansza[Gra.getRuch().get(numerek).getRuch()] = 'O';
        }

        numerek++;



        for (int i = 0; i < 9; i++) {

            System.out.print(plansza[i]);

            if ((i + 1) % 3 == 0) System.out.print("\n");
        }


    }


}

