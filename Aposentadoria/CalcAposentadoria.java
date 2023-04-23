public class CalcAposentadoria
{
    Empregado empregadoQlquer;
    boolean podeAposentar;
    public CalcAposentadoria(Empregado empregadoQlquer){
        this.empregadoQlquer = empregadoQlquer;
    }
    
    public boolean verificaResultado(){
    if (empregadoQlquer.getIdade()>=65 || empregadoQlquer.getTempoTrabalho() >=30 ||
        empregadoQlquer.getIdade()>=60 && empregadoQlquer.getTempoTrabalho() >=25){
        podeAposentar = true;        
    } 
    else{
        podeAposentar = false;
    }
    return podeAposentar;
    }
}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public void Resultado() {
        if (empregadoQlquer.getIdade()>=65 || empregadoQlquer.getTempoTrabalho() >=30 ||
            empregadoQlquer.getIdade()>=60 && empregadoQlquer.getTempoTrabalho() >=25) {
        } 
        
    }
}
*/
/*
public class CalcAposentadoria {
    Dados dadosPessoais;

    public CalcAposentadoria(Dados dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public void Resultados() {
        if (dadosPessoais.getIdade() >=65 && dadosPessoais.getTempoTrabalho() >=30 ||
            dadosPessoais.getIdade() >=60 && dadosPessoais.getTempoTrabalho() >=25) {
            System.out.println("Você está apto para se aposentar");
        } else {
            System.out.println("Você NÃO está apto para se aposentar");
        }
    }
} 


if (empregadoQlquer.getIdade()>=65 && empregadoQlquer.getTempoTrabalho() >=30 ||
            empregadoQlquer.getIdade()>=60 && empregadoQlquer.getTempoTrabalho() >=25) {
            
        }   
*/