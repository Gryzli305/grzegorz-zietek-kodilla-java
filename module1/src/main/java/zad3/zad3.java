package zad3;

/*
1.3. Wykorzystanie interfejsu w programach
Zadanie: Odważny rycerz
W swojej aplikacji stwórz:

Interfejs Quest, który będzie zawierał w metodę process().
Dwie klasy DeadIslandQuest i EliteKnightQuest, które implementują interfejs Quest - wykorzystaj polecenie System.out.println().
Stwórz klasę Knight, która w konstruktorze przyjmie różne zadania implementujące interfejs Quest, oraz dowolną metodę, która wywoła metodę process() interfejsu Quest.
Główny program powinien wyświetlić informacje o zakończeniu zadania razem z jego nazwą.
 */

interface Quest {

    void process();

}
class DeadIslandQuest implements Quest  {

    public void process() {

        System.out.println("Zginął na wyspie");
    }
}

class EliteKnightQuest implements Quest	{

    public void process() {

        System.out.println("Wygrał bitwe");
    }
}

class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void process() {

        this.quest.process();
        System.out.println("The end program " + quest);
    }
}

class Application {

    public static void main (String[] args) {

        Quest deadIslandQuest  = new DeadIslandQuest();

        Knight knight = new Knight(deadIslandQuest);

        knight.process();
    }
}