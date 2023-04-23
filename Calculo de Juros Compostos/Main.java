import java.util.Scanner;
public class Main
{
    public static void main (String [] args)
    {
        CalcInvest calc = new CalcInvest();
        Scanner leitura = new Scanner(System.in);  

        System.out.println("Qual o valor do capital?");
        calc.setCapital(leitura.nextDouble());

        System.out.println("Duarante quantos meses?");
        calc.setMes(leitura.nextInt());

        System.out.println("Rendera o valor de:" + calc.CalcJuros());

        System.out.println("Deseja calcular o proximo ano?");
        calc.setQuest(leitura.next());

        calc.ReCalcJuros();
    }
}
