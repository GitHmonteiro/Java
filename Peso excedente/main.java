import java.util.*;

public class main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcpesca p = new calcpesca();
        
        while (true) {
            System.out.print("Digite o peso do peixe (ou 0 para sair): ");
            int peso = scanner.nextInt();
            
            if (peso == 0) {
                break;
            }
            
            p.adicionarPeixe(peso);
        }
        
        System.out.println("Total de peixes: " + p.getTotalPeso() + " kg");
        System.out.println("Valor da multa: R$" + p.getMulta());
    }
}
