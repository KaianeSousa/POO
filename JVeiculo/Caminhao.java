public class Caminhao extends Veiculo {
    // Armazena a capacidade de carga do caminhão em toneladas
    private double capacidadeCarga;

    // Construtor da classe Caminhao, inicializa atributos herdados e a capacidade de carga
    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        // Inicializa atributos da classe pai Veiculo
        super(marca, modelo, ano);
        // Define a capacidade de carga
        this.capacidadeCarga = capacidadeCarga;
    }

    // Exibe detalhes do caminhão, incluindo a capacidade de carga
    @Override
    public void exibirDetalhes() {
        // Chama o método da classe pai para exibir detalhes básicos
        super.exibirDetalhes();
        // Mostra a capacidade de carga
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }

    // Define o comportamento de movimento específico do caminhão
    @Override
    public void mover() {
        // Mensagem de movimento do caminhão
        System.out.println("O caminhão está transportando carga.");
    }

    // Retorna a capacidade de carga do caminhão
    public double getCapacidadeCarga() {
        // Fornece o valor da capacidade de carga
        return capacidadeCarga;
    }

    // Define a capacidade de carga do caminhão
    public void setCapacidadeCarga(double capacidadeCarga) {
        // Atualiza o valor da capacidade de carga
        this.capacidadeCarga = capacidadeCarga;
    }
}
