import java.util.ArrayList;


public class Gra {


    static private Gracz player1 = new Gracz("Gracz1");
    static private Gracz player2 = new Gracz("Gracz2");


    static private ArrayList< Ruch > ruchy = new ArrayList<>( 9 );
    static private ArrayList< Boolean > ruch2 = new ArrayList<>( 9 );


    public static ArrayList<Boolean> getRuch2() {
        return ruch2;
    }

    public static ArrayList<Ruch> getRuch() {
        return ruchy;
    }

    Gra(){

        for( int i = 0; i < 9; i ++){

            ruchy.add( new Ruch());
            ruch2.add( false );
        }

    }

    public static void main(String[] args) {


        Gra gra = new Gra();
        Plansza plansza = new Plansza();
        short liczbaRuchow = 0;

        while( true ){

            do{

                ruchy.set( liczbaRuchow, new Ruch( player1 ));
            } while( Gra.getRuch2().get( Gra.getRuch().get( ) ) == true);

            Gra.getRuch2().set( liczbaRuchow, true );

            liczbaRuchow ++;

            plansza.drukuj();

            if( liczbaRuchow == 9 ) break;

            do{

                ruchy.set( liczbaRuchow, new Ruch( player2 ));
            } while ( Gra.getRuch2().get( Gra.getRuch().get( liczbaRuchow ).getRuch()) == true );


            Gra.getRuch2().set( liczbaRuchow, true );

            liczbaRuchow ++;

            plansza.drukuj();

            if( liczbaRuchow == 9 ) break;
        }



    }


}
