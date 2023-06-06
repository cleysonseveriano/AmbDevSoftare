package animal;
//Diego Loyola

public class Ave extends Animal{
    public Ave(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }

    private String raca;
    private String porte;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void voar(){
        System.out.println("Estou voando pela casa");
    }

    public void comer(){
        System.out.println("Estou comendo semente de girassol");
    }
}
