/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author 248543
 */
public class Teste {
    public static void main (String [] args) {
        Notebook note = new Notebook(10, 4, "Dell");
        Desktop desk = new Desktop(4, 8, "Asus");
        
        System.out.println(note.informacoesCompletas());
        System.out.println(desk.informacoesCompletas());
    }
}
