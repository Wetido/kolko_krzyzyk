import java.util.ArrayList;

public class Plansza implements intefejsik {

    static char[][] plansza = new char[3][3];
    static int numerek = 0;

    Plansza(){

        for( int i = 0; i < 3 ; i++ ){
            for( int j = 0; j < 3; j++ ){

                plansza[i][j] = '-';
            }

        }
    }

    @Override
    public void drukuj( ) {



            if( Gra.ruchy.get(numerek).getGracz() == 1 ){

                plansza[ Gra.ruchy.get(numerek).getX() ]
                        [ Gra.ruchy.get(numerek).getY()] = 'X';
            }

            if( Gra.ruchy.get(numerek).getGracz() == 2 ){

                plansza[ Gra.ruchy.get(numerek).getX() ]
                        [ Gra.ruchy.get(numerek).getY()] = 'O';
            }

            numerek ++;


        for( int i = 0; i < 3 ; i++ ){
            for( int j = 0; j < 3; j++ ){

                System.out.print( plansza[i][j]);
            }
            System.out.println();

        }


    }
}
