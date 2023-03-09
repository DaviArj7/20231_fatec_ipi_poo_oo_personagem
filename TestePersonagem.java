public class TestePersonagem {
    public static void main (String []args){
        //p é uma variável de referência. Ela faz referência ao objeto contruído com new
        // Personagem p = new Personagem();
        //java 10+
        var p = new Personagem();
        p.nome = "John";
        p.cacar();
        p.comer();
        p.dormir();
    }

}
