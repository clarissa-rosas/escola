public class Professor extends Pessoa {  //Herança para Diferença

    //Atributos

    private String especialidade;
    private double salario;

    //Métodos acessores

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos principais

    public void receberAumento(double valor) {
        this.setSalario(getSalario() + valor);
        System.out.println("O(A) professor(a) " + this.getNome() + " recebeu um aumento. Salário atual: " + this.getSalario() + ".");
    }

    public Professor(String nome, int documento, int idade, String sexo, String especialidade, double salario) {
        super(nome, documento, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public String detalhar() {
        return "Professor: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo() +
                ", especialidade = " + this.getEspecialidade() +
                ", salario = " + this.getSalario();
    }
}
