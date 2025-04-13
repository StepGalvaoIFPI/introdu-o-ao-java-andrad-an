import java.util.Scanner;

public class CalculaAreaPerimetroRetangulo {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Calculo area e perimetro do retangulo ==");
    
        System.out.print("Digite o valor da altura : ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o valor da largura : ");
        double largura = scanner.nextDouble();
        
        double area = altura * largura;
        double perimetro = 2 * altura + 2 * largura;

        System.out.printf("area: %.2f cm²\n", area);
        System.out.printf("perimetro: %.2f cm\n", perimetro);

        scanner.close();
    }
}
