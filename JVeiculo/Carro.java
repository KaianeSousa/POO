public class Carro extends Veiculo {
    // Armazena o número de portas do carro
    private int numeroDePortas;

    // Construtor da classe Carro, inicializa atributos herdados e o número de portas
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        // Inicializa atributos da classe pai Veiculo
        super(marca, modelo, ano);
        // Define o número de portas
        this.numeroDePortas = numeroDePortas;
    }

    // Exibe detalhes do carro, incluindo o número de portas
    @Override
    public void exibirDetalhes() {
       // Chama o método da classe pai para exibir detalhes básicos
        super.exibirDetalhes();
        // Mostra o número de portas
        System.out.println("Número de portas: " + numeroDePortas);
    }

    // Define o comportamento de movimento específico do carro
    @Override
    public void mover() {
        // Mensagem de movimento do carro
        System.out.println("O carro está acelerando na estrada.");
    }

    // Retorna o número de portas do carro
    public int getNumeroDePortas() {
        // Fornece o valor do número de portas
        return numeroDePortas;
    }

    // Define o número de portas do carro
    public void setNumeroDePortas(int numeroDePortas) {
        // Atualiza o valor do número de portas
        this.numeroDePortas = numeroDePortas;
    }
}
