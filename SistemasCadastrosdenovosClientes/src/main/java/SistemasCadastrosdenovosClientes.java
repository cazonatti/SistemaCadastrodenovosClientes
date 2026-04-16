


// Pode manter o nome do seu pacote

import java.util.ArrayList;
import java.util.Scanner;
//ler o cadastro
public class SistemasCadastrosdenovosClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>();
        String opcao = "";

        while (!opcao.equals("3")) {
            System.out.println("\n--- MENU ---");
            //atributo menu
            System.out.println("1. Adicionar Cliente");
            //adicao de cliente
            System.out.println("2. Listar Clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Nome: ");
                clientes.add(scanner.nextLine());
            } else if (opcao.equals("2")) {
                System.out.println("Clientes: " + clientes);
            }
        }
        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}