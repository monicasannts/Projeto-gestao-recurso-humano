package recurso_humano;

public class Funcionario extends Pessoa{

    private double salario;
    private String cargo;

    public Funcionario(String nome, String cpf, String emai, double salario, String cargo){
        super(nome, cpf, emai);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Funcionario: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$" + salario);
    }
}
