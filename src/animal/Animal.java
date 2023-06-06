package animal;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;

    public Animal(String nome, String tipo, int idade) {
        setNome(nome);
        setTipo(tipo);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Meu nome é " + getNome());
        System.out.println("Meu tipo é " + getTipo());
        System.out.println("Tenho " + getIdade() + " anos");
    }


}
