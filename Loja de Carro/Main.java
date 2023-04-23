import java.util.Scanner;

public class Main
{
    public static void Main (String[] args)
    {
        Carro carro1 = new Carro();
        Scanner leitura = new Scanner(System.in);
        String[] acessorios = {"Ar","Câmbio automático","Alarme","Pintura especial","Teto solar","Kit Multimidia"};

        System.out.println("Digite o valor do carro: ");
        carro1.setValorFinal(leitura.nextDouble());

        System.out.println("Digite o modelo do carro: ");
        carro1.setTipoCarro(leitura.next());/*String só next*/

        System.out.println("Digite a potência do motor: ");
        carro1.tipoMotor(leitura.nextDouble());

        System.out.println("Carro é importado?");
        carro1.setImportado(leitura.nextBoolean());

        for(String acessorio: acessorios)
        {
            System.out.println(acessorio);
        }
        System.out.println("Digite seus acessorios");
        System.out.println("Caso não queira um acessorio digite 0");
        while(acessorios.length>=carro1.getListaAcessorios().size())
        {
            carro1.addAcessorios(leitura.next());
        }
        carro1.verificaAcessorios();
        System.out.println("Valor final do carro: "+ carro1.getValorFinal());
    } 
}
