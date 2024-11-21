package recurso_humano;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Departamento(String nome, Gerente gerente) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println(funcionario.getNome() + " foi adicionado ao departamento.");
    }

    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
        System.out.println(funcionario.getNome() + " foi removido do departamento.");
    }

    public void exibirDepartamento() {
        System.out.println("Departamento: " + nome);
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(" - " + f.getNome() + " (Cargo: " + f.getCargo() + ")");
        }

    }

}
