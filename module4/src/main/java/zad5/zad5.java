package zad5;
import java.util.LinkedList;
/*
Powtórzmy jeszcze raz tworzenie klasy i kolekcji. Zadanie jest podobne do poprzedniego, ale warto te zagadnienia solidnie przećwiczyć.

W metodzie main klasy Program utwórz klasę Clock (z ang. zegar) i kilka obiektów tej klasy.

Utwórz również kolekcję typu LinkedList do przechowywania zegarów i dodaj do tej kolekcji kilka utworzonych obiektów klasy Clock

Następnie - używając pętli for – przesuń w każdym zegarze godzinę o jedną minutę do przodu.
 */
class Clock {
    public int godzina, minuta;

    Clock(int g, int m){
        try {
            nastawZegar(g, m);
        } catch(BledneDane e){
            godzina = 0;
            minuta = 0;
        }
    }

    public void nastawZegar(int a, int b) throws BledneDane {
        if(a>=0 && a<=23 && b>=0 && b<=59){
            godzina=a;
            minuta=b;
        } else throw new BledneDane();
    }
    public String toString() {return godzina + ":" + minuta;
    }
}

class BledneDane extends Exception {}


class Program {
    public static void main(String[] args){
        Clock a = new Clock(12,59);
        Clock b = new Clock(9,23);
        Clock c = new Clock(23,59);
        Clock d = new Clock(3,30);

        LinkedList<Clock> kolekcja = new LinkedList<Clock>();
        kolekcja.add(a);
        kolekcja.add(b);
        kolekcja.add(c);
        kolekcja.add(d);

        System.out.println(kolekcja);
        for(Clock x:kolekcja){
            if(x.minuta == 59){
                x.minuta=0;
                if(x.godzina==23)
                    x.godzina=0;
                else
                    x.godzina++;

            } else
                x.minuta++;
        }
        System.out.println(kolekcja);
    }

}