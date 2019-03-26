import java.util.*;

public class PompaPaliwa {
    Random rndm = new Random();
    Scanner input = new Scanner(System.in);
    private double cenaPaliwa = 5.5;
    private boolean kontynuowac;
    private double rachunek;
    private double ilePaliwa;
    PasswordMenager mojeHaslo = new PasswordMenager();

    // Metoda odpowiedzialna za dolewanie benzyny i drukowanie rachunku
    void tankowanie() {
        this.rachunek = 0;
        this.ilePaliwa = 0;
        System.out.println("Rachunek = " + getRachunek() + "\nilosc paliwa = " + getIlePaliwa());
        czyKontynuowac();
        while (kontynuowac == true) {
            this.ilePaliwa = ilePaliwa + rndm.nextInt(5) + 5;
            this.rachunek = (cenaPaliwa * ilePaliwa);
            czyKontynuowac();
        }
        System.out.println("Zatankowano " + getIlePaliwa() + "L, " + "Do zaplaty: " + getRachunek() + " PLN");
    }



    // Metoda sprawdzjaca czy klient chce dalej tankowac
    public void czyKontynuowac() {
        System.out.println("Kontynuować tankowanie?");
        while (true) {
            char odpowiedz = input.next().charAt(0);
            if (odpowiedz == 'T' || odpowiedz == 't') {
                this.kontynuowac = true;
                break;
            } else if (odpowiedz == 'N' || odpowiedz == 'n') {
                this.kontynuowac = false;
                break;
            } else {
                System.out.println("Podaj 't' albo 'n'");
            }
        }
    }
    //SETTERS

    //Metoda zmieniajaca cene paliwa
    public void setCenaPaliwa(double cenaPaliwa) {
        mojeHaslo.checkForPassword();
        if (mojeHaslo.getCheck() == true) {
            this.cenaPaliwa = cenaPaliwa;
            mojeHaslo.resetCheck();
        }
    }

    //GETTERS

    public double getIlePaliwa() {
        return ilePaliwa;
    }

    public double getCenaPaliwa() {
        return cenaPaliwa;
    }

    public double getRachunek() {
        return rachunek;
    }

    public boolean getKontynuowac() {
        return kontynuowac;
    }

}
