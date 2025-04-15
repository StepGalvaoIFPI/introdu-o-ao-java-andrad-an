import java.until.Scanner;

public class App{
    public static void main(String args[]){
      Scanner entrada = new = Scanner(System.in);
      double salario = Double.valueof(entrada.nextLine());
      double imposto = salario * 0.10;
      double salario_final = salario - imposto;
      System.out.println("salario: " + salario_final);
      
    }
}
