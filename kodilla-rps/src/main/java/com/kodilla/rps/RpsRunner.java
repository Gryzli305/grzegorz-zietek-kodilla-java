package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        String name;
        int roundGame;
        boolean end = false;
        System.out.print("Podaj imie: ");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
            System.out.print("Podaj liczbę rund: ");

              roundGame = scanner.nextInt();
              scanner.nextLine();

        while (end == false && roundGame > 0) {
            roundGame = roundGame -1;

            System.out.println("\nZapoznaj się z instrukcją obsługi: klawisz 1 - zagranie \"kamień\",\n" +
                    "klawisz 2 - zagranie \"papier\",\n" +
                    "klawisz 3 - zagranie \"nożyce\",\n" +
                    "klawisz x - zakończenie gry.\n" +
                    "klawisz n - uruchomienie gry od nowa\n");
            String action = scanner.nextLine();

            if (action.equals("x")) {
                end = true;
            }

            if (action.equals("n")) {
                continue;
            }

            Symbol computer;

            if (action.equals("1")) {
                computer = generateSymbol();
                Score score = calculateScore(Symbol.ROCK,computer);
                printScore(score);
            }

            if (action.equals("2")) {
                computer = generateSymbol();
                Score score = calculateScore(Symbol.PAPER,computer);
                printScore(score);
            }

            if (action.equals("3")) {
                computer = generateSymbol();
                Score score = calculateScore(Symbol.SCISSORS,computer);
                printScore(score);
            }
        }
    }
    public static Symbol generateSymbol() {
        Random random = new Random();

        int number = random.nextInt();
        number = number % 3;
        number = number + 1;
        if (number == 1) {
            return Symbol.ROCK;
        }
        if (number == 2) {
            return Symbol.PAPER;
        }
        return Symbol.SCISSORS;
    }
    public static Score calculateScore(Symbol player, Symbol computer) {
        if (player == computer) {
            return Score.EVEN;
        }
        if (player == Symbol.PAPER) {
            if (computer == Symbol.SCISSORS) {
                return Score.LOSE;
            } else {
                return Score.WIN;
            }
        }

        if (player == Symbol.SCISSORS) {
            if (computer == Symbol.ROCK) {
                return Score.LOSE;
            } else {
                return Score.WIN;
            }
        }

        if (player == Symbol.ROCK) {
            if (computer == Symbol.PAPER) {
                return Score.LOSE;
            } else {
                return Score.WIN;
            }
        }
        return Score.EVEN;
    }
    public static void printScore(Score score) {
        if (Score.WIN == score) {
            System.out.println("you win");
        }
        else if (Score.LOSE == score) {
            System.out.println("you lose");
        } else {
            System.out.println("no one wins");
        }
    }

}
