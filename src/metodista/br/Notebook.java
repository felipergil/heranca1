/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author Felipe Rodrigues Gil - R.A 248543
 */
public class Notebook extends Computador {
    private int quantidadeAltoFalantes;
    private boolean possuiTouchPad;
    
    public Notebook(int velocidade, int quantidade, String fabricante) {
        super(velocidade, quantidade, fabricante);
        this.quantidadeAltoFalantes = 0;
        this.possuiTouchPad = false;        
    }
    
    public Notebook(int velocidade, int quantidade, String fabricante, int quantidadeFalantes, boolean possuiTouchPad) {
        super(velocidade, quantidade, fabricante);
        this.quantidadeAltoFalantes = quantidadeFalantes;
        this.possuiTouchPad = possuiTouchPad;        
    }
    
    public int getQuantidadeFalantes(){
        return this.quantidadeAltoFalantes;
    }
    
    public boolean getPossuiTouchPad(){
        return this.possuiTouchPad;
        
    }
    public String informacoesCompletas() {
        return "Sou um notebook. Meu processador " + super.getFabricanteProcessador() 
                + " trabalha a uma velocidade " + super.getVelocidadeDeProcessador() 
                + " Possuo " + super.getQuantidadeDeMemoria() + " Mb de memória."
                + " Tenho um total de " + quantidadeAltoFalantes + " alto-falantes.";
    }
}