package caixaeletronico;

public class CaixaEletronico {
   
    private static void SelecionarOpcao() throws Exception{     
        
        String msg = "Entre com uma opção: \n\n" + 
                     "1 - Depósito \n" +
                     "2 - Saque \n"; 
        
        GUI gui = new GUI();        
        
        int numOpcao = gui.lerInt(msg);
        switch (numOpcao){
            case 1:
                Deposito deposito = new Deposito();
                deposito.Depositar();
                break;
            case 2:
                Saque saque = new Saque();
                saque.Sacar();
                break;
            
            default:
                gui.exibir("Nenhuma opção válida");
        }
    }

    public static void main(String[] args) throws Exception {        
        SelecionarOpcao();
    }        
}
