import br.com.teste.models.ClassAux;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting Project...");
        ClassAux aux = new ClassAux();

        aux.metodoAux();
        System.out.println("""
                Do you want to play again???
                1- YES
                2- NO
                """);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            aux.metodoAux();
        } else if (n == 2) {
            System.exit(0);
        } else {
            System.out.println("Invalid option");
        }
    }

}
