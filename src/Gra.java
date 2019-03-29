import java.util.ArrayList;


public class Gra {


    static private Gracz player1 = new Gracz("Gracz1");
    static private Gracz player2 = new Gracz("Gracz2");


    static private ArrayList< Ruch > ruch = new ArrayList<>( 9 );
    static private ArrayList< Boolean > ruch2 = new ArrayList<>( 9 );


    public static ArrayList<Boolean> getRuch2() {
        return ruch2;
    }

    public static ArrayList<Ruch> getRuch() {
        return ruch;
    }

    Gra(){

        for( int i = 0; i < 9; i ++){

            ruch.add( new Ruch());
            ruch2.add( false );
        }

    }

    public static void main(String[] args) {


        new Gra();
        Plansza plansza = new Plansza();
        short liczbaRuchow = 0;

        while( true ){

            do{

                ruch.set( liczbaRuchow, new Ruch( player1 ));
            } while( getRuch2().get( getRuch().get( liczbaRuchow ).getRuch() ) == true);

            Gra.getRuch2().set( getRuch().get( liczbaRuchow ).getRuch() , true );

            liczbaRuchow ++;

            plansza.drukuj();

            if( liczbaRuchow == 9 ) break;

            do{

                ruch.set( liczbaRuchow, new Ruch( player2 ));
            } while ( getRuch2().get( getRuch().get( liczbaRuchow ).getRuch()) == true );


            Gra.getRuch2().set( getRuch().get( liczbaRuchow ).getRuch(), true );

            liczbaRuchow ++;

            plansza.drukuj();

            if( liczbaRuchow == 9 ) break;
        }



    }


}
