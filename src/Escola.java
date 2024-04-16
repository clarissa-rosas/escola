public class Escola {
    public static void main(String[] args) {

        //Programa principal

//        Pessoa[] p = new Pessoa[4];
//        p[0] = new Pessoa ("Pedro", 7645690, 40, "M");
//        p[1] = new Pessoa ("Maria", 8546733, 21, "F");
//        p[2] = new Pessoa ("Cláudio", 2452145, 45, "M");
//        p[3] = new Pessoa ("Fabiana", 2899670, 38, "F");
//
//        for (Pessoa pessoa : p) {
//            pessoa.detalhar();
//        }

        var aluno1 = new Aluno("Maria", 8546733, 21, "F", "21878900", "Informática");
        var professor1 = new Professor("Cláudio", 2452145, 45, "M", "História", 2500.75);
        var funcionario1 = new Funcionario("Fabiana", 2899670, 38, "F", "Estoque", true);
        var visitante1 = new Visitante("Antônio", 5587293, 43, "M");
        var bolsista1 = new Bolsista("Kalina", 2569981, 19,"F", "21878455", "Tradução");
        var tecnico1 = new Técnico("Samir", 9785112, 20, "M", "21873890", "Arquitetura", 7663);

        System.out.println(aluno1.detalhar());
        aluno1.cancelarMatricula();
        System.out.println(professor1.detalhar());
        professor1.receberAumento(550.20);
        System.out.println(funcionario1.detalhar());
        funcionario1.mudarTrabalho();
        visitante1.fazerAniversario();
        System.out.println(visitante1.detalhar());
        bolsista1.setBolsa(false);
        bolsista1.renovarBolsa();
        bolsista1.pagarMensalidade();
        System.out.println(bolsista1.detalhar());
        tecnico1.praticar();
        System.out.println(tecnico1.detalhar());
    }
}