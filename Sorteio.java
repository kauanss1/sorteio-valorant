import java.util.Random;
public class Sorteio {
    private String[] agentes;
    Random gerador = new Random(); 


    public void setTagentes(String[] agentes) {

        if (agentes != null) {
            
            this.agentes = agentes;
        }else {
            System.out.println("O array de agentes não pode ser nulo.");
        }
    }
    public String[] getTagebtes(){
        return this.agentes;
    }


    public Sorteio(String[] agentes) {
        this.agentes = agentes;

    }

    public String sortear(){
        int tamanho = agentes.length;
        int numero = gerador.nextInt(tamanho);
        String agen = agentes[numero];
        //System.out.println(numero);
        //System.out.println(agen);
        return agen;

    }

    public String[] sclass (String[][] class1){
        int tamanho = class1.length;
    String[] class_S = class1[gerador.nextInt(tamanho)];
    return class_S;
    }
}
