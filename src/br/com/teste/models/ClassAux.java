package br.com.teste.models;
import java.util.Random;
import java.util.Scanner;

public class ClassAux {
    public void metodoAux() {
        {
            //System.in é para ler a entrada q teve no console
            Scanner scanner = new Scanner(System.in);

            //class ramdom para usar o random para gerar o numero
            Random ramdom = new Random();
            int numberRandom = ramdom.nextInt(100) + 1;

            welcomeText();
            int numberDifficulty = scanner.nextInt();
            System.out.println("Enter you choice: " + numberDifficulty);

            //crir um contador para saber em quantas tentativas acertei
            int contador = 0;

            //caso o number == 1 ele tem 10 chances para acertar o numero.
            if (numberDifficulty == 1) {
                System.out.println("""                  
                        \nGreat! You have selected the Easy difficulty level.
                        Let's start the game!""");

                //Aqui faz o laço de repeticao que seria 10x um while ou um for
                for (int i = 0; i < 10; i++) {
                    ++contador;
                    int numberGuess = scanner.nextInt();
                    System.out.printf("\nEnter your guess: " + numberGuess + "\n");

                    if (numberGuess > numberRandom) {
                        System.out.println("Incorrect! The number is less than " + numberGuess + ".");

                    } else if (numberGuess < numberRandom) {
                        System.out.println("Incorrect! The number is greater than " + numberGuess + ".");

                    } else {
                        System.out.println("Congratulations! You guessed the correct number in " + contador + " attempts.");
                        break;
                    }
                }
                System.out.println("Game Over!");
            } else if (numberDifficulty == 2) {
                System.out.println("""                  
                        \nGreat! You have selected the Medium difficulty level.
                        Let's start the game!""");

                //Aqui faz o laço de repeticao que seria 10x um while ou um for
                for (int i = 0; i < 5; i++) {
                    ++contador;
                    int numberGuess = scanner.nextInt();
                    System.out.printf("\nEnter your guess: " + numberGuess + "\n");

                    if (numberGuess > numberRandom) {
                        System.out.println("Incorrect! The number is less than " + numberGuess + ".");

                    } else if (numberGuess < numberRandom) {
                        System.out.println("Incorrect! The number is greater than " + numberGuess + ".");

                    } else {
                        System.out.println("Congratulations! You guessed the correct number in " + contador + " attempts.");
                        break;
                    }

                }
                System.out.println("Game Over!");
            } else if (numberDifficulty == 3) {
                System.out.println("""                  
                        \nGreat! You have selected the Hard difficulty level.
                        Let's start the game!""");

                //Aqui faz o laço de repeticao que seria 10x um while ou um for
                for (int i = 0; i < 3; i++) {
                    ++contador;
                    int numberGuess = scanner.nextInt();
                    System.out.printf("\nEnter your guess: " + numberGuess + "\n");

                    if (numberGuess > numberRandom) {
                        System.out.println("Incorrect! The number is less than " + numberGuess + ".");

                    } else if (numberGuess < numberRandom) {
                        System.out.println("Incorrect! The number is greater than " + numberGuess + ".");

                    } else {
                        System.out.println("Congratulations! You guessed the correct number in " + contador + " attempts.");
                        break;
                    }
                }
                System.out.println("Game Over!");
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public void welcomeText() {
        System.out.println("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have 5 chances to guess the correct number.
                \nPlease select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                """);
    }
}
