package animal;

public class Main {
    public static void main(String[] args) {
        Cachorro boiao = new Cachorro("Boião", "Mamífero", 2);
        boiao.aniversario();
        boiao.apresentar();
        boiao.beberAgua();

        Ave frederico = new Ave("Frederico", "Papagaio", 5);
        frederico.cantar();




    }
}
