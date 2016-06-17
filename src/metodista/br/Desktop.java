/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author 248543
 */
public class Desktop extends Computador {
    private String corGabinete;
    private int potenciaFonteEnergia;
    
    public Desktop(int velocidade, int memoria, String fabricante) {
        super(velocidade, memoria, fabricante);
        this.corGabinete = "Branco";
        this.potenciaFonteEnergia = 400;
    }
    public Desktop(int velocidade, int memoria, String fabricante, String cor, int potencia) {
        super(velocidade, memoria, fabricante);
        this.corGabinete = cor;
        this.potenciaFonteEnergia = potencia;
    }
    
    public String getCorGabinete() {
        return this.corGabinete;
    }
    
    public int getPotenciaFonteEnergia(){
        return this.potenciaFonteEnergia;
    }
    
    public String informacoesCompletas() {
        return "Sou um desktop. Meu processador " + super.getFabricanteProcessador() +
                " trabalho a uma velocidade " + super.getVelocidadeDeProcessador() + 
                " Possuo " + super.getQuantidadeDeMemoria() + "Mb de memória. "
                + "Meu gabinete é de cor " + corGabinete + ".";
    }
    
}
