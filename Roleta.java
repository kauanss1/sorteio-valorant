import java.util.Scanner;
public class Roleta {
    public static void main(String[] args) {
        
        String[] duelista = {"JETT", "REYNA", "YORU", "RAZE", "PHOENIX", "NEON", "ISO"};
        String[] controladores = {"OMEN", "BRIMSTONE", "VIPER", "ASTRA", "HARBOR", "CLOVE"};
        String[] iniciadores = {"SOVA", "BREACH", "SKYE", "KAYO", "FADE", "GEKKO", "TEJO"};
        String[] sentinelas = {"SAGE", "CYPHER", "KILLJOY", "CHAMBER", "DEADLOCK", "VYSE"};
        String [][] cclass={ duelista,controladores,iniciadores,sentinelas };
        int n = 1;
        Scanner scanf = new Scanner(System.in);

        do {
            
            Sorteio sorteio = new Sorteio(duelista); 
            System.err.println(sorteio.sortear());
            
            sorteio.setTagentes(controladores);
            System.err.println(sorteio.sortear());
            
            sorteio.setTagentes(iniciadores);
            System.err.println(sorteio.sortear());
            
            sorteio.setTagentes(sentinelas);
            System.err.println(sorteio.sortear());
            
            
            sorteio.setTagentes(sorteio.sclass(cclass));
            System.err.println(sorteio.sortear());
            System.out.println("digite 0 para sair ou 1 para sortear novamente ");
            n = scanf.nextInt();

        } while (n !=0);
        
        
        
    }
}
