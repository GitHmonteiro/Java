
public class CalcInvest
{
    private double capital; 
    private double taxaJuros = 0.01; 
    private double capitaFinal;
    private int mes;
    String quest;

    public CalcInvest()
    {

    }

    public void setCapital(double capital)
    {
        this.capital=capital;
    }  

    public double getCapital()
    {
        return capital;
    }

    public void setCapitalFinal(double capitaFinal)
    {
        this.capitaFinal=capitaFinal;
    }  

    public double getCapitalFinal()
    {
        return capitaFinal;
    }

    public void setMes(int mes)
    {
        this.mes=mes;
    }  

    public int getMes()
    {
        return mes;
    }

    public void setQuest(String quest)
    {
        this.quest = quest;
    }

    public String getQuest()
    {
        return quest;
    }

    public double CalcJuros()
    {

        for(int i = 0; i < mes; i++) {
            capitaFinal *= (1 + taxaJuros);
            capitaFinal += capital;      
        }
        return capitaFinal;
    }

    public double ReCalcJuros()
    {
        if(getQuest().equalsIgnoreCase("S"))
        {   
            for(int i = 0; i < mes; i++) {
                capitaFinal *= (1 + taxaJuros);   
                capitaFinal += capital;
            }
            System.out.println("Capital final após mais um ano investido: " + capitaFinal);
        }
        return capitaFinal;
    }
}
