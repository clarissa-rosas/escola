public class Aluno extends Pessoa {  //Herança para Diferença

    //Atributos

    private String matricula;
    private String curso;

    //Métodos acessores

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Métodos principais

    public void cancelarMatricula() {
        if (this.getMatricula() != null) {
            this.setMatricula(null);
            System.out.println("A matrícula do(a) aluno(a) " + this.getNome() + " no curso de " + this.getCurso() + " foi cancelada.");
        } else {
            System.out.println("O(A) aluno(a) " + this.getNome() + " não tem matrícula ativa para cancelar.");
        }
    }

    public void pagarMensalidade() {
        System.out.println("A mensalidade do(a) aluno(a) " + this.getNome() + " foi paga.");
    }

    public Aluno(String nome, int documento, int idade, String sexo, String matricula, String curso) {
        super(nome, documento, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String detalhar() {
        return "Aluno: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo() +
                ", matricula = " + this.getMatricula() +
                ", curso = " + this.getCurso();
    }
}
