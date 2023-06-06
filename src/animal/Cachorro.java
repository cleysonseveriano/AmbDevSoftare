package animal;
//Heric Ferreira
public class Cachorro extends Animal {
    private String raca;
    private String porte;

    public Cachorro(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }

    public void latir(){
        System.out.println("AU AU AU!!!");
    }

    public void morder(){
        System.out.println("NHEC NHEC NHEC");
    }

    public void correr(){
        System.out.println("ESTOU CORRENDO PELA CASA");
    }
}
