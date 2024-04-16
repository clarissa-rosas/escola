public class Funcionario extends Pessoa {  //Herança para Diferença

    //Atributos

    private String setor;
    private boolean trabalhando;

    //Métodos acessores

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Métodos principais

    public void mudarTrabalho() {
        if (trabalhando) {
            this.setTrabalhando(false);
            System.out.println("O(A) funcionário(a) " + this.getNome() + " não está trabalhando no momento.");
        } else {
            this.setTrabalhando(true);
            System.out.println("O(A) funcionário(a) " + this.getNome() + " está trabalhando no momento.");
        }
    }

    public Funcionario(String nome, int documento, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, documento, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    @Override
    public String detalhar() {
        return "Funcionario: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo() +
                ", setor = " + this.getSetor() +
                ", trabalhando = " + this.getTrabalhando();
    }
}
