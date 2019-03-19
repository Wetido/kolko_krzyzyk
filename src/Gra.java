import java.util.ArrayList;

public class Gra {


    static private Gracz player1 = new Gracz("Adzia");
    static private Gracz player2 = new Gracz("Olga");

    //Adzia mówi ze moze być tylko 9 ruchów
    static protected ArrayList< Ruch > ruchy = new ArrayList<>( 9 );


    public static void main(String[] args) {

        Plansza plansza = new Plansza();

        for( int i = 0; i < 9 ; i++){

            ruchy.add( new Ruch( player1 ));

            plansza.drukuj();

            ruchy.add( new Ruch( player2 ));

            plansza.drukuj();
        }

    }


}
