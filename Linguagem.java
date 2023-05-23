public class Linguagem {

    public String nome, regioesFaladas, ordemDasPalavras;
    public int numFalantes; 

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.nome = nome;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
        this.numFalantes = numFalantes;
    }

    public void getInfo() {
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + ".\nA linguagem segue a ordem das palavras: " + ordemDasPalavras + ".");
    }
    public static void main(String[] args) {
        Linguagem portugues = new Linguagem("Português", 1000000, "Brasil, Portugal, Angola", "sujeito-verbo-objeto");
        portugues.getInfo();
        Linguagem kiche = new Mayan("Ki'che", 1000);
        kiche.getInfo();
        Linguagem mandarim = new SinoTibetan("Mandarim", 100000000);
        mandarim.getInfo();
        Linguagem birmanes = new SinoTibetan("Birmanês", 10);
        birmanes.getInfo();
    }
}