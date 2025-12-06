class Vehiculo {
    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }
}

class Carro extends Vehiculo {
    public void tocarBocina() {
        System.out.println("El carro hace: Beep beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.arrancar();
        miCarro.tocarBocina();
    }
}
