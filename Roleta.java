
public class Roleta {
    public static void main(String[] args) {
        
        String [] duelista= {"jett", "reyna", "yoru", "raze", "phoenix", "neon", "iso"};
        String[] controladores = {"omen", "brimstone", "viper", "astra", "harbor", "clove"};
        String[] iniciadores = {"sova", "breach", "skye", "kayo", "fade", "gekko", "tejo"};
        String[] sentinelas = {"sage", "cypher", "killjoy", "chamber", "deadlock", "vyse"};


        Sorteio sorteio = new Sorteio(duelista); 
        System.err.println(sorteio.sortear());

        sorteio.setTagentes(controladores);
        System.err.println(sorteio.sortear());

        sorteio.setTagentes(iniciadores);
        System.err.println(sorteio.sortear());
        
        sorteio.setTagentes(sentinelas);
        System.err.println(sorteio.sortear());


        String [][] cclass={ duelista,controladores,iniciadores,sentinelas };



        sorteio.setTagentes(sorteio.sclass(cclass));


        System.err.println(sorteio.sortear());
        
        
        
    }
}
