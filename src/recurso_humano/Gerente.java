package recurso_humano;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, String cpf, String email, double salario, String cargo, double bonus){
        super(nome, cpf, email, salario, cargo);
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Bonus: R$" + bonus);
    }

    public double calcularSalarioTotal(){
        return getSalario() + bonus;
    }
}
