
package aplicacao1;
import java.util.Scanner;
import aplicacao1.Funcionario;
import java.util.Locale;


public class Exercicio1 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.print("Nome do(a) Funcionário(a): ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto incidente: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println("Nome: " + funcionario.nome);
        System.out.printf("Salário Bruto: %.3f%n", funcionario.salarioBruto);
        System.out.printf("Imposto: %.2f%n", funcionario.imposto);

        System.out.printf("Imposto incidente no valor de %.2f%n", funcionario.salarioLiquido());
        System.out.printf("Salário Líquido de %.3f%n", funcionario.salarioBruto - funcionario.salarioLiquido());
        sc.close();
        
    }
    
}
