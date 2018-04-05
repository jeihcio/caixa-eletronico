package caixaeletronico;

import javax.swing.JOptionPane;

public class GUI {
    public String ler(String msg) {
        return JOptionPane.showInputDialog(null,
                msg, "Caixa Eletronico",
                JOptionPane.QUESTION_MESSAGE);
    }
    
    public int lerInt(String msg){
        int resultado = 0;
        
        try {
            resultado = Integer.parseInt(ler(msg));
        } catch(Exception e) {        
        }
        
        return resultado;
    }

    public void exibir(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Caixa Eletronico",
                JOptionPane.INFORMATION_MESSAGE);
    }    
}
