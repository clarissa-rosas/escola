public abstract class Pessoa {  //Superclasse

    //Atributos

    private String nome;
    private int documento;
    private int idade;
    private String sexo;

    //Métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Métodos principais

    public final void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    public Pessoa(String nome, int documento, int idade, String sexo) {
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String detalhar() {
        return "Pessoa: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo();
    }
}
