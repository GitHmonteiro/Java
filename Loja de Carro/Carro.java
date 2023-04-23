import java.util.ArrayList;
public class Carro
{
    private ArrayList<String>listaAcessorios; /*<=array de atributos  private ArrayList<String> <--- tipo do arraylist ---> nome como se fosse uma variável listaAcessorios; */ 
    private double valorFinal;
    private String tipoCarro;
    private boolean importado;
    private double motor;
    public Carro()
    {
        listaAcessorios = new ArrayList<String>(); /*instanciei o ArrayList de string */
    }  
    public void setValorFinal(double valorFinal)
    {
        this.valorFinal=valorFinal; 
    }
    public double getValorFinal()
    {
        return valorFinal;
    }   
    public void setTipoCarro(String tipoCarro)
    {
        this.tipoCarro=tipoCarro; 
    }
    public String getTipoCarro()
    {
        return tipoCarro;
    }    
    public void setImportado(boolean importado)
    {
        this.importado=importado; 
    }
    public boolean getImportado()
    {
        return importado;
    } 
    /*SERVE PARA INSERIR DADOS QUE O USUÁRIO DIGITOU NO ARRAYLIST carro.addAcessorios(leitura.next()) PASSOU OS DADOS PARA  listaAcessorios.add(recebeAcessorios); E está fazendo as comparações dentro dos If's de verificaAcessorios*/
    public void addAcessorios(String recebeAcessorios)
    {
        listaAcessorios.add(recebeAcessorios);    
    }
    /*get de um ArrayList*/ 
    public ArrayList<String> getListaAcessorios()
    {
        return listaAcessorios;
    }
    public void verificaAcessorios()
    {
        for(String acessorioCarro:listaAcessorios)
        {
            if(acessorioCarro.equalsIgnoreCase("Ar"))
            {
                valorFinal+=3000; 
            }
            if(acessorioCarro.equalsIgnoreCase("Câmbio automático"))
            {
                valorFinal+=5000; 
            }
            if(acessorioCarro.equalsIgnoreCase("Alarme"))
            {
                valorFinal+=800; 
            }
            if(acessorioCarro.equalsIgnoreCase("Pintura especial"))
            {
                valorFinal+=2500; 
            }
            if(acessorioCarro.equalsIgnoreCase("Teto solar"))
            {
                valorFinal+=4000; 
            }
            if(acessorioCarro.equalsIgnoreCase("Kit multimidia"))
            {
                valorFinal+=1800; 
            }
        }
    }
    void impostoImportacao()
    {
        if(importado)
        {
            valorFinal+=1.3;  
        } 
    }
    public void tipoMotor(double motor)
    {
        if(motor==1.0)
        {
            valorFinal+=1.1;  
        }else
        {
            valorFinal+=1.2;     
        }
    }
}


