public class Mayan extends Linguagem {

    public Mayan(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
    }

    @Override
    public void getInfo() {
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + ".\nA linguagem segue a ordem das palavras: " + ordemDasPalavras + ".\nFato interessante: " + nome + " é uma linguagem ergativa.");
    }
}
