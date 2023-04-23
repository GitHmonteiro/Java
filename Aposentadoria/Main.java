import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Empregado empregado01 = new Empregado();
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        empregado01.setNome(leitura.nextLine() );
        
        System.out.println("Informe sua idade: ");
        empregado01.setIdade(leitura.nextInt() );
        
        System.out.println("Informe o seu tempo trabalhado: ");
        empregado01.setTempoTrabalho(leitura.nextInt() );
        
        CalcAposentadoria calc = new CalcAposentadoria(empregado01);
        
        if(calc.verificaResultado()){
            System.out.println("Você está apto para se aposentar");
        }
        else{
        System.out.println("Você NÃO está apto para se aposentar");
        }
    }
}
