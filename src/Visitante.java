public class Visitante extends Pessoa {  //Herança de Implementação

    public Visitante(String nome, int documento, int idade, String sexo) {
        super(nome, documento, idade, sexo);
    }

    public String detalhar() {
        return "Visitante: " +
                "nome = " + this.getNome() +
                ", documento = " + this.getDocumento() +
                ", idade = " + this.getIdade() +
                ", sexo = " + this.getSexo();
    }
}
