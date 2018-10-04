package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        int licznik = 0;
        String name;
        int roundGame;





        while (licznik<10) {
            System.out.print("Podaj imie: ");
            Scanner scannerName = new Scanner(System.in);
            name = scannerName.nextLine();

            System.out.print("Podaj liczbę rund: ");
            Scanner scannerRoundGame = new Scanner(System.in);
            roundGame = scannerRoundGame.nextInt();
         //   Scanner name = new Scanner(System.in);
            System.out.println("\nZapoznaj się z instrukcją obsługi: klawisz 1 - zagranie \"kamień\",\n" +
                    "klawisz 2 - zagranie \"papier\",\n" +
                    "klawisz 3 - zagranie \"nożyce\",\n" +
                    "klawisz x - zakończenie gry.\n" +
                    "klawisz n - uruchomienie gry od nowa\n");
        }
    }
}
