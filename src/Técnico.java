public class Técnico extends Aluno {

    //Atributos

    private int registroProfissional;

    public Técnico(String nome, int documento, int idade, String sexo, String matricula, String curso, int registroProfissional) {
        super(nome, documento, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    //Métodos acessores

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    //Métodos principais

    public void praticar() {
        System.out.println("O(A) aluno(a) " + this.getNome() + " está praticando.");
    }

    @Override
    public String detalhar() {
        return "Aluno: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo() +
                ", matricula = " + this.getMatricula() +
                ", curso = " + this.getCurso() +
                ", técnico = true ";
    }
}
