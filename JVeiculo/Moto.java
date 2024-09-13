public class Moto extends Veiculo {
    // Armazena a capacidade do motor em cilindradas
    private int cilindradas;

    // Construtor da classe Moto, que inicializa os atributos herdados e a capacidade do motor
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano); // Inicializa atributos da classe pai Veiculo
        this.cilindradas = cilindradas; // Define a capacidade do motor
    }

    // Exibe detalhes da moto, incluindo a capacidade do motor
    @Override
    public void exibirDetalhes() {
        // Chama o método da classe pai para exibir detalhes básicos
        super.exibirDetalhes();
        // Mostra a capacidade do motor
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }

    // Define o comportamento de movimento específico da moto
    @Override
    public void mover() {
        // Mensagem de movimento da moto
        System.out.println("A moto está acelerando na pista.");
    }

    // Retorna a capacidade do motor em cilindradas
    public int getCilindradas() {
        // Fornece o valor da capacidade do motor
        return cilindradas;
    }

    // Define a capacidade do motor em cilindradas
    public void setCilindradas(int cilindradas) {
        // Atualiza o valor da capacidade do motor
        this.cilindradas = cilindradas;
    }
}
