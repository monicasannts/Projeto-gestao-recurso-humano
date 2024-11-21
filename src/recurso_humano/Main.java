package recurso_humano;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Monica", "123.444.555-01", "monica@gmail.com", 1250.00, "Gerente de TI", 2000.00);


        Departamento departamento = new Departamento("Tecnologia da Informação", gerente);


        Funcionario f1 = new Funcionario("Pedro ALberto", "111.222.333-44", "perdroalb@empresa.com", 5000.00, "Desenvolvedor");
        Funcionario f2 = new Funcionario("Marcos Antonio", "555.666.777-88", "marcosant@empresa.com", 6000.00, "Analista de Sistemas");


        departamento.adicionarFuncionario(f1);
        departamento.adicionarFuncionario(f2);


        departamento.exibirDepartamento();


        gerente.exibirInfo();
        System.out.println("Salário Total do Gerente: R$" + gerente.calcularSalarioTotal());
    }


}
