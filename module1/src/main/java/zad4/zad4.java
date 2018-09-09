package zad4;

/*
1.4. Klasa abstrakcyjna
Zadanie: Transakcja bankowa
Aby przećwiczyć wykorzystywanie klas abstrakcyjnych w praktyce, stwórz swoje własne zachowanie dla transakcji bankowej.

Załóżmy, że transakcja bankowa zawiera się w 8 metodach, z czego 3 są zawsze po stronie banku (w klasie abstrakcyjnej).

Schemat transakcji bankowej do zaimplementowania:

Prośba o wprowadzenie karty (Bankomat)
Prośba o wprowadzenie kodu PIN (Bankomat)
Prośba o wprowadzenie kwoty do wypłaty (Bankomat)
Informacja o przyjęciu prośby wypłaty przez Bank (Bank)
Sprawdzenie stanu konta (Bank)
Potwierdzenie możliwości wypłaty (Bank)
Wypłacanie gotówki (Bankomat)
Podziękowanie za skorzystanie z usług Banku (Bankomat)
Załóż, że każde z tych działań sygnalizujemy zwykłym println - tak jak wspominaliśmy wcześniej, póki co zajmujemy się głównie poznawaniem samego języka Java - praktyczne zadania przyjdą niebawem :)

Posługuj się przypadkiem przedstawionym w tym submodule: https://kodilla.com/pl/project-java/38591

Spróbuj po prostu napisać kod, który będzie imitował transakcję bankową - w tym zadaniu najważniejsze jest to, żebyś samodzielnie spróbował podejść do definiowania metod i pisania kodu.
 */

abstract class BankTransactionAlgorithm {

    private void phaseOne() {
        System.out.println("1. Please insert you card");
    }
    private void phaseTwo() {
        System.out.println("2. A request to enter a PIN code");
    }
    private void phaseThree() {
        System.out.println("3. Request to enter the payout amount");
    }
    abstract protected void phaseFour(); {

    }
    abstract protected void phaseFive();{

    }
    abstract protected void phaseSix();{

    }
    private void phaseSeven(){
        System.out.println("7. Withdrawing cash");
    }
    private void phaseEight() {
        System.out.println("8. Thank you for using the Bank's services");
    }
    public void run() {
        this.phaseOne();
        this.phaseTwo();
        this.phaseThree();
        this.phaseFour();
        this.phaseFive();
        this.phaseSix();
        this.phaseSeven();
        this.phaseEight();
    }
}
class BankTransactionCheck extends BankTransactionAlgorithm {


    protected void phaseFour() {
        System.out.println("4. Information about the withdrawal request by the Bank");
    }
    protected void phaseFive() {
        System.out.println("5. Checking the account balance");
    }
    protected void phaseSix() {
        System.out.println("6. Confirmation of the withdrawal option");
    }
}
class Application {
    public static void main (String[] args) {
        BankTransactionCheck check = new BankTransactionCheck();

        check.run();
    }
}