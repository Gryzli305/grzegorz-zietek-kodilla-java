package zad2;
/*
1.2. Interfejs
Zadanie: Bankomat
Stwórz interfejs obsługujący bankomat (eng. ATM) zawierający:

Dwie metody wymagające implementacji - wpłata i wypłata
Metodę domyślną - informacja o połączeniu z bankiem
Metodę statyczną - informacja o zakończeniu działania bankomatu
Następnie zaimplementuj taki interface do klasy o nazwie ATMImpl (ATM Implementation) i stwórz ciała dla metod, które tego wymagają. W klasie Application w metodzie main wywołaj każdą metodę.
 */
interface ATM {

    void paymentIn();
    void paymentOut();

    default void connection() {

        System.out.println("Connection with server");
    }
    static String getStatus() {
        return "ATM is disble";
    }
}
class ATMImpl implements ATM {

    public void paymentIn() {

        System.out.println("Save in the bank");
    }

    public void paymentOut() {

        System.out.println("Load in the bank");
    }
}
class Application  {
    public static void main (String[] args) {

        ATMImpl atmImpl = new ATMImpl();

        atmImpl.paymentIn();
        atmImpl.paymentOut();
        atmImpl.connection();
        System.out.println(ATM.getStatus());
    }
}