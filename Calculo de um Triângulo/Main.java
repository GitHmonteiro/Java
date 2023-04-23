/*
next(): localiza e retorna a informação seguinte deste objeto Scanner.
close(): fecha o Scanner.
nextLine(): avança para a próxima linha, mostrando também qual é a atual.
nextInt(): faz a verificação do token de entrada seguinte como um int.
nextFloat(): aponta o próximo símbolo de entrada como flutuação.
Radix(): faz retornar o índice atual deste objeto Scanner.
nextDouble()
*/


import java.util.Scanner; 

public class Main
{
    public static void main (String args[]){
    TipoTriangulo valor = new TipoTriangulo();
        
    Scanner leitura = new Scanner(System.in);
    
    
    System.out.println("Digte o lado A do triagulo");
    valor.setLadoA(leitura.nextDouble());
    
    System.out.println("Digte o lado B do triagulo");
    valor.setLadoB(leitura.nextDouble());
    
    System.out.println("Digte o lado C do triagulo");
    valor.setLadoC(leitura.nextDouble());
    //equilátero,isósceles,escaleno;
    
    System.out.println("A área do triangulo é: " + valor.CalcArea());
    System.out.println("O triangulo e do tipo: " + valor.CalcTipo());
    
    
    
    
    }
}
