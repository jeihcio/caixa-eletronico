package caixaeletronico;

public class Deposito {
    
    private GUI gui;
    private String msg;
    
    private int qtdNotas;
    private int valorTotalDepositado;
    private int qtd100, qtd50, qtd20, qtd10, qtd5, qtd2, qtd1;

    public Deposito() {
        gui = new GUI(); 
    }
    
    private void ImprimirComprovante(){         
        msg = "[Comprovante]\n";
        msg += "===============================\n\n";
        
        msg += "Quantidade total de notas recebidas: "+qtdNotas+"\n\n";        
        msg += "Quantidade de notas de R$:100 : "+qtd100+"\n"+
               "Quantidade de notas de R$:50   : "+qtd50 +"\n"+ 
               "Quantidade de notas de R$:20   : "+qtd20 +"\n"+
               "Quantidade de notas de R$:10   : "+qtd10 +"\n"+
               "Quantidade de notas de R$:5     : "+qtd5  +"\n"+
               "Quantidade de notas de R$:2     : "+qtd2  +"\n"+
               "Quantidade de notas de R$:1     : "+qtd1  +"\n";
        
        msg += "\nValor total depositado: R$:"+valorTotalDepositado+",00";
        gui.exibir(msg);
    }
    
    private void PegarQuantidadeDeCadaNota(){        
        qtd100 = gui.lerInt("Quantas notas de R$:100?");        
        qtd50  = gui.lerInt("Quantas notas de R$:50?");        
        qtd20  = gui.lerInt("Quantas notas de R$:20?");        
        qtd10  = gui.lerInt("Quantas notas de R$:10?");        
        qtd5   = gui.lerInt("Quantas notas de R$:5?");        
        qtd2   = gui.lerInt("Quantas notas de R$:2?");
        qtd1   = gui.lerInt("Quantas notas de R$:1?");
    }
    
    private void calcularTotalDepositado(){
        valorTotalDepositado = (qtd100*100)+(qtd50*50)+(qtd20*20)+
                               (qtd10*10)+(qtd5*5)+(qtd2*2)+(qtd1*1);
    }
    
    private boolean Validar(){    
        
        // Quantidade de notas 
        int qtdTotalNotasDigitadas = qtd100+qtd50+qtd20+qtd10+qtd5+qtd2+qtd1;
        if (qtdNotas != qtdTotalNotasDigitadas){
            gui.exibir("Quantidade de notas digitadas é diferente do total de notas!");
            return false;
        }
        
        return true;
    }

    public void Depositar() throws Exception{         
        qtdNotas = gui.lerInt("Quantas notas irá depositar?");         
        
        PegarQuantidadeDeCadaNota();  
        
        if (Validar()){ 
            calcularTotalDepositado();
            ImprimirComprovante();
        }
        else{
            throw new Exception("Error ao validar o depósito"); 
        }
    }
}
