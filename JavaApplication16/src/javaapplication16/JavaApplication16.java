
package javaapplication16;

public class JavaApplication16 {

    public static void main(String[] args) {
        double[][] notas = new double[2][4];
        notas[0][0] = 10;
        notas[0][1] = 7;
        notas[0][2] = 8;
        notas[0][3] = 9;

        notas[1][0] = 9;
        notas[1][1] = 8;
        notas[1][2] = 5;
        notas[1][3] = 7;
     
        double soma = 0;
     
        for (int i=0; i<notas.length; i++){
           for (int j=0; j<notas[i].length; j++){
               soma += notas[i][j];
               }
           System.out.println("Média do aluno " + i + " é = "+(soma/4));
           }
    }
    
}
