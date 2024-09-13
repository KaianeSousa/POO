public class Onibus extends Veiculo {
    // Armazena a capacidade de passageiros do ônibus
    private int capacidadePassageiros;

    // Construtor da classe Onibus, inicializa atributos herdados e a capacidade de passageiros
    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros) {
        // Inicializa atributos da classe pai Veiculo
        super(marca, modelo, ano);
        // Define a capacidade de passageiros
        this.capacidadePassageiros = capacidadePassageiros;
    }

    // Exibe detalhes do ônibus, incluindo a capacidade de passageiros
    @Override
    public void exibirDetalhes() {
        // Chama o método da classe pai para exibir detalhes básicos
        super.exibirDetalhes();
        // Mostra a capacidade de passageiros
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
    }

    // Define o comportamento de movimento específico do ônibus
    @Override
    public void mover() {
        // Mensagem de movimento do ônibus
        System.out.println("O ônibus está transportando passageiros.");
    }

    // Retorna a capacidade de passageiros do ônibus
    public int getCapacidadePassageiros() {
        // Fornece o valor da capacidade de passageiros
        return capacidadePassageiros;
    }

    // Define a capacidade de passageiros do ônibus
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        // Atualiza o valor da capacidade de passageiros
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
