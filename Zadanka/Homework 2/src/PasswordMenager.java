import java.util.Scanner;


public class PasswordMenager {
    private String haslo = "Admin1";
    private int bledneHaslo = 3;
    private boolean check = false;
    Scanner userInput = new Scanner(System.in);

    boolean getCheck() {
        return check;
    }

    void resetCheck() {
        this.check = false;
    }

    void setNewPassword() {
        System.out.println("***Zmiana Hasla***");
        checkForPassword();
        if (check == true) {
            System.out.println("Podaj nowe haslo: ");
            String passwordCheck = userInput.nextLine();
            this.haslo = passwordCheck;
            resetCheck();
        }
    }

    public void checkForPassword() {
        while (bledneHaslo > 0) {
            System.out.println("Podaj haslo: ");
            String passwordCheck = userInput.nextLine();

            if (passwordCheck.equals(haslo) == true) {
                this.bledneHaslo = 3;
                this.check = true;
                break;
            } else {
                bledneHaslo--;
                if (bledneHaslo < 1) {
                    System.out.println("Konto zablokowane");
                    break;
                }
                System.out.println("Bledne haslo, masz jeszcze " + bledneHaslo + " proby!");

            }
        }

    }
}


