
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Inicializa o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Dados para o Carro
        System.out.println("Digite as informações do Carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine(); // Lê a marca do carro
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine(); // Lê o modelo do carro

        int anoCarro = 0; // Variável para armazenar a entrada do usuário
        while (true) {
            try {
                System.out.print("Ano: ");
                anoCarro = scanner.nextInt(); // Lê o ano do carro
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor inteiro para o ano.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        int numeroDePortas = 0; // Variável para armazenar a entrada do usuário
        while (true) {
            try {
                System.out.print("Número de portas: ");
                numeroDePortas = scanner.nextInt(); // Lê o número de portas
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para o número de portas.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        // Cria um objeto Carro com os dados fornecidos
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroDePortas);

        // Dados para a Moto
        System.out.println("\nDigite as informações da Moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine(); // Lê a marca da moto
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine(); // Lê o modelo da moto

        int anoMoto = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Ano: ");
                anoMoto = scanner.nextInt(); // Lê o ano da moto
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para o ano.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        int cilindradas = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Cilindradas (em centímetros cúbicos): ");
                cilindradas = scanner.nextInt(); // Lê a capacidade do motor em cilindradas
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para as cilindradas.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        // Cria um objeto Moto com os dados fornecidos
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindradas);

        // Dados para o Caminhão
        System.out.println("\nDigite as informações do Caminhão:");
        System.out.print("Marca: ");
        String marcaCaminhao = scanner.nextLine(); // Lê a marca do caminhão
        System.out.print("Modelo: ");
        String modeloCaminhao = scanner.nextLine(); // Lê o modelo do caminhão

        int anoCaminhao = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Ano: ");
                anoCaminhao = scanner.nextInt(); // Lê o ano do caminhão
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para o ano.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        double capacidadeCarga = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Capacidade de carga (em toneladas): ");
                capacidadeCarga = scanner.nextDouble(); // Lê a capacidade de carga
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal para a capacidade de carga.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        // Cria um objeto Caminhão com os dados fornecidos
        Caminhao caminhao = new Caminhao(marcaCaminhao, modeloCaminhao, anoCaminhao, capacidadeCarga);

        // Dados para o Ônibus
        System.out.println("\nDigite as informações do Ônibus:");
        System.out.print("Marca: ");
        String marcaOnibus = scanner.nextLine(); // Lê a marca do ônibus
        System.out.print("Modelo: ");
        String modeloOnibus = scanner.nextLine(); // Lê o modelo do ônibus

        int anoOnibus = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Ano: ");
                anoOnibus = scanner.nextInt(); // Lê o ano do ônibus
                scanner.nextLine(); // Limpa o buffer do scanner
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para o ano.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        int capacidadePassageiros = 0; // Variável para armazenar a entrada do usuário
        
        while (true) {
            try {
                System.out.print("Capacidade de passageiros: ");
                capacidadePassageiros = scanner.nextInt(); // Lê a capacidade de passageiros
                break; // Sai do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro para a capacidade de passageiros.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        // Cria um objeto Ônibus com os dados fornecidos
        Onibus onibus = new Onibus(marcaOnibus, modeloOnibus, anoOnibus, capacidadePassageiros);

        // Exibe os detalhes de cada veículo
        // Exibe os detalhes de cada veículo
        System.out.println("\nDetalhes do Carro:");
        carro.exibirDetalhes(); // Mostra os detalhes do carro
        System.out.println();

        System.out.println("Detalhes da Moto:");
        moto.exibirDetalhes(); // Mostra os detalhes da moto
        System.out.println();

        System.out.println("Detalhes do Caminhão:");
        caminhao.exibirDetalhes(); // Mostra os detalhes do caminhão
        System.out.println();

        System.out.println("Detalhes do Ônibus:");
        onibus.exibirDetalhes(); // Mostra os detalhes do ônibus
        System.out.println();

        // Demonstra o polimorfismo com o método mover()
        // Criando um array com os veículos
        Veiculo[] veiculos = {carro, moto, caminhao, onibus}; 

        System.out.println("Movendo os veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.mover(); // Chama o método mover() de cada veículo
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
