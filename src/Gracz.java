public class Gracz {

    private String imie;
    protected char pionek;

    private static int gracz = 0;

    public Gracz(String imie) {

        gracz++;

        this.imie = imie;

        if (gracz == 1) {
            this.pionek = 'X';
        }

        if (gracz == 2){
            this.pionek = 'O';
        }

        if( gracz > 2){
            throw new IllegalArgumentException("Moze byc dwóch graczy");
        }


    }

}
