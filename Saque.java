package caixaeletronico;

public class Saque {
    
    private GUI gui;
    private String msg;
    
    private int valorSaque;
    private int qtdNota100, qtdNota50, qtdNota20, qtdNota10, qtdNota5, qtdNota2, qtdNota1;

    public Saque() {
        gui = new GUI(); 
    }
    
    private void ImprimirComprovante(){ 
        int qtdTotalNotas = qtdNota100+qtdNota50+qtdNota20+qtdNota10+qtdNota5+qtdNota2+qtdNota1;
                
        msg = "[Comprovante]\n";
        msg += "===============================\n\n";
        
        msg += "Valor sacado: R$:"+valorSaque+",00\n"+        
               "Quantidade de notas usadas: "+qtdTotalNotas+"\n\n"+
        
               "R$:100 : "+qtdNota100+"\n"+
               "R$:50   : "+qtdNota50 +"\n"+
               "R$:20   : "+qtdNota20 +"\n"+
               "R$:10   : "+qtdNota10 +"\n"+
               "R$:5     : "+qtdNota5  +"\n"+
               "R$:2     : "+qtdNota2  +"\n"+
               "R$:1     : "+qtdNota1  +"\n";
        
        gui.exibir(msg);
    }
    
    private void EscolherNotas(){      
        int saque = valorSaque;        
        qtdNota100 = qtdNota50 = qtdNota20 = qtdNota10 = qtdNota5 = qtdNota2 = qtdNota1 = 0;
        
        // notas de 100
        if (saque >= 100) {
            qtdNota100 = (int) Math.floor(saque/100);
            saque = saque-(qtdNota100*100);
        }
        
        // notas de 50
        if (saque >= 50) {
            qtdNota50 = (int) Math.floor(saque/50);
            saque = saque-(qtdNota50*50);
        }
        
        // notas de 20
        if (saque >= 20) {
            qtdNota20 = (int) Math.floor(saque/20);
            saque = saque-(qtdNota20*20);
        }
        
        // notas de 10
        if (saque >= 10) {
            qtdNota10 = (int) Math.floor(saque/10);
            saque = saque-(qtdNota10*10);
        }
        
        // notas de 5
        if (saque >= 5) {
            qtdNota5 = (int) Math.floor(saque/5);
            saque = saque-(qtdNota5*5);
        }
        
        // notas de 2
        if (saque >= 2) {
            qtdNota2 = (int) Math.floor(saque/2);
            saque = saque-(qtdNota2*2);
        }
        
        // notas de 1
        if (saque >= 1) {
            qtdNota1 = (int) Math.floor(saque/1);
            saque = saque-(qtdNota1*1);
        }
    }
 
    public void Sacar(){
        valorSaque = gui.lerInt("Qual valor deseja sacar?");
        
        EscolherNotas();
        ImprimirComprovante();
    }
}
