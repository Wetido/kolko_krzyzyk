import java.util.Scanner;

public class Ruch {

    private int ruch;
    private int gracz;

    public Ruch() { }

    public int getGracz() {
        return gracz;
    }

    public int getRuch() {
        return ruch;
    }


    public Ruch(Gracz g) {

        System.out.println( "Ruch gracza " + g.getImie() );

        do{

            Scanner scanner = new Scanner( System.in );
            System.out.print("Podaj pole ( 1 - 9 ) ");
            ruch = scanner.nextInt() - 1;
        } while ( ruch < 0 || ruch >= 9 );


        if( g.pionek == 'X'){

            gracz = 1;
        }

        if( g.pionek == 'O'){

            gracz = 2;
        }


    }
}
