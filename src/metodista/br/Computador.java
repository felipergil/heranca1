package metodista.br;

/**
 *
 * @author Felipe Rodrigues Gil - R.A 248543
 */
public class Computador {

    private int velocidaProcessador;
    private int quantidadeDeMemoria;
    private String fabricanteProcessador;

    public Computador(int velocidade, int quantidade, String fabricante) {
        this.velocidaProcessador = velocidade;
        this.quantidadeDeMemoria = quantidade;
        this.fabricanteProcessador = fabricante;

    }

    public int getVelocidadeDeProcessador() {
        return this.velocidaProcessador;
    }

    public int getQuantidadeDeMemoria() {
        return this.quantidadeDeMemoria;
    }

    public String getFabricanteProcessador() {
        return this.fabricanteProcessador;
    }

    public String dizerInformacoes() {
        return "Sou um computador. Meu processador" + fabricanteProcessador
                + " trabalha a uma velocidade" + velocidaProcessador
                + ". Possuo " + quantidadeDeMemoria + " Mb de memória.";
    }
}
