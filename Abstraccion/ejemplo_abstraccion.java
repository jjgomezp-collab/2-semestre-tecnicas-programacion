abstract class Animal {
    public abstract void hacerSonido();

    public void dormir() {
        System.out.println("El animal está durmiendo...");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau guau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido();
        miPerro.dormir();
    }
}
