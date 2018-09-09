package zad4;

/*
Czas na powtórkę z tworzenia klasy. Zadanie będzie lekko abstrakcyjne, żeby ciekawiej się je rozwiązywało. ;)

Część 1
Napisz klasę Cannon (z ang. armata) z publicznym polem loaded (z ang. załadowana) typu boolean, oraz metodą fire() (z ang. wystrzel), która sprawdza przed wystrzeleniem czy kula znajduje się w armacie.

Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println) o braku kuli w armacie, a następnie kula zostanie załadowana do tej armaty.

Część 2
W metodzie main klasy Program utwórz kolekcję typu LinkedList do przechowywania armat.

Dodaj kilka obiektów klasy Cannon do kolekcji, a następnie - używając pętli for - załaduj wszystkie armaty.
 */
import java.util.LinkedList;

class Cannon {

    public boolean loaded;

    public void fire() {

        if (loaded) {
            System.out.println("wystrzelono");
            loaded = false;
        } else {
            loaded = true;
            System.out.println("załadowano");
        }

    }
}
class Main {

    public static void main(String[] args) {

        LinkedList<Cannon> cannons = new LinkedList<>();
        cannons.add(new Cannon());
        cannons.add(new Cannon());
        cannons.add(new Cannon());
        cannons.add(new Cannon());

        for (Cannon cannon : cannons) {
            cannon.fire();
        }
        for (Cannon cannon : cannons) {
            cannon.fire();
        }

    }
}