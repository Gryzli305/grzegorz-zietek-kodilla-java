package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        int licznik = 0;
        String name;
        int roundGame;
        boolean end = false;

        while (end == false) {
            System.out.print("Podaj imie: ");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();

            System.out.print("Podaj liczbę rund: ");

            roundGame = scanner.nextInt();
         //   Scanner name = new Scanner(System.in);
            System.out.println("\nZapoznaj się z instrukcją obsługi: klawisz 1 - zagranie \"kamień\",\n" +
                    "klawisz 2 - zagranie \"papier\",\n" +
                    "klawisz 3 - zagranie \"nożyce\",\n" +
                    "klawisz x - zakończenie gry.\n" +
                    "klawisz n - uruchomienie gry od nowa\n");
            String action = scanner.nextLine();
            if (action.equals("x")) {
                end =true;
            }
            if (action.equals("n")) {
                continue;
            }
            if (action.equals("1")) {

            }
        }
    }
}
