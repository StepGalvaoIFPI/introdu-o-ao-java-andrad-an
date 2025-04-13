import java.util.Scanner;

public class CalcularAreaTrianngulo{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("==Calculo da area do triangulo==");

      System.out.print("digite o valor da base:");
      double base = scanner.nextDouble();

      System.out.print("digite o valor da altura:");
      double altura = scanner.nextDouble();

      double area = (base * altura) /2;

      System.out.printf("a area é %.2f \n" area);
  
  
  
      
