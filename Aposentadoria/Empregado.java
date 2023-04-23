

public class Empregado
{
    private int idade;
    private int tempoTrabalho;
    private String nome;
    
    // PEDE A IDADE
    
    public Empregado()
    {
    
    }
    
    
    public void setIdade(int idade)
    {
        this.idade=idade;
    }
     public int getIdade()
    {
        return this.idade;
    }    
    
    // PEDE O TEMPO TRABALHADO
    
    public void setTempoTrabalho(int tempoTrabalho)
    {
        this.tempoTrabalho=tempoTrabalho;
    }
    public int getTempoTrabalho()
    {
        return this.tempoTrabalho;
    }
    
    //PEDE O NOME
    
    public void setNome(String nome)
    {
    this.nome=nome;
    }
    public String getNome()
    {
    return nome;
    }
 
}
