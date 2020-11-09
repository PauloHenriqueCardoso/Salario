
package aplicacao1;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido(){
        return salarioBruto * imposto / 100.0;
    }

}
