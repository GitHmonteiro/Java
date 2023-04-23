/*Um pescador deseja controlar o rendimento diário de seu trabalho. Toda vez que ele
traz um peixe maior que o estabelecido pelo regulamento de pesca do Estado de Minas
Gerais (50 quilos), deve pagar uma multa de R$4,00 por quilo excedente. Escreva um
app que leia as informações dos peixes pegos pelo pescador, ao final mostre quanto o
mesmo deve pagar
*/
public class calcpesca
{
    private int totalPeso;
    private int multa;
    
    public void adicionarPeixe(int peso) {
        if (peso > 50) {
            int excesso = peso - 50;
            this.totalPeso += peso;
            this.multa += excesso * 4;
        } else {
            this.totalPeso += peso;
        }
    }
    
    public int getTotalPeso() {
        return totalPeso;
    }
    
    public int getMulta() {
        return multa;
    }
}
