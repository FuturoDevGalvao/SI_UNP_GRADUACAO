import java.util.InputMismatchException;
import java.util.Scanner;

import utils.SimpleOperations;

public class App {

    private static String menuOptions[] = {
            "Soma",
            "Subtração",
            "Multiplicação",
            "Divisão",
            "Sair"
    };

    public static void main(String[] args) throws Exception {
        System.out.println("Opere agora, seu programa de facilidade matemática!");

        Scanner input = new Scanner(System.in);
        boolean finish = false;

        do {
            showMenu();

            try {
                int operation = input.nextInt();

                System.out.println("Operação escolhida: " + menuOptions[operation - 1]);

            } catch (InputMismatchException e) {
                System.out.println(
                        "Aviso: A opção que você escolher precisa ser UM NÚMERO e ESTAR CONTIDO NA LISTA APRESENTADA.");
                finish = false;
                continue;
            }

        } while (finish);

    }

    public static void showMenu() {
        System.out.println("Escolha a operação: ");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.printf("%d - %s\n", i + 1, menuOptions[i]);
        }
        System.out.print("Informe aqui: ");
    }
}
