public class Bolsista extends Aluno {

    //Atributos

    private boolean bolsa;

    public Bolsista(String nome, int documento, int idade, String sexo, String matricula, String curso) {
        super(nome, documento, idade, sexo, matricula, curso);
        this.bolsa = true;
    }

    //Métodos acessores

    public boolean getBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    //Métodos principais

    public void renovarBolsa() {
        if (bolsa) {
            System.out.println("O(a) aluno(a) " + this.getNome() + " já tem bolsa ativa.");
        } else {
            bolsa = true;
            System.out.println("A bolsa do(a) aluno(a) " + this.getNome() + " foi renovada.");
        }
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("O(A) aluno(a) " + this.getNome() + " é bolsista! Pagamento facilitado!");
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
                ", bolsista = " + this.getBolsa();
    }



}
