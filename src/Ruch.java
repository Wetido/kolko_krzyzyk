import java.util.Scanner;

public class Ruch {

    private int x;
    private int y;
    private int gracz;

    public int getGracz() {
        return gracz;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Ruch(Gracz g) {


        //Adzia mówi zeby sprawdzic ifem
        Scanner scanner = new Scanner( System.in );
        System.out.print("Podej x");
        x = scanner.nextInt();

        System.out.print("Podej y");
        y = scanner.nextInt();

        if(g.pionek == 'X'){

            gracz = 1;
        }

        if(g.pionek == 'O'){

            gracz = 2;
        }


    }
}
