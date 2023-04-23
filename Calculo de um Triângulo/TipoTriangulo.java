
public class TipoTriangulo
{
    private double ladoA,ladoB,ladoC;
    private double calculoArea=0;
    //LADO A
    public TipoTriangulo ()
    {
    
    }
    
    public void setLadoA(double ladoA)
    {
    this.ladoA=ladoA;
    }
    public double getLadoA()
    {
    return ladoA;
    }
    
    //LADO B
    public void setLadoB(double ladoB)
    {
    this.ladoB=ladoB;
    }
    public double getLadoB()
    {
    return ladoB;
    }
    
    //LADO C
    public void setLadoC(double ladoC)
    {
    this.ladoC=ladoC;
    }
    public double getLadoC()
    {
    return ladoC;
    }
    
    public double CalcArea()
    {
        //calculoArea=0;
        double p = (getLadoA()+getLadoB()+getLadoC())/2.0;
        calculoArea = Math.sqrt(p*(p-getLadoA())*(p-getLadoB())*(p-getLadoC()));
        return calculoArea;
    }
    
    public String CalcTipo()
    {
     if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC)
        {
            return "Equilátero";
        }
        
        else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC)
        {
            return "Isósceles";
        }
        
        else 
        {
            return "Escaleno";
        }
        
   }
    
}
