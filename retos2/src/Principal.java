public class Principal {
    public static void main(String[] args) {
        // Con clase tradicional
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto Rock", 799.99);

        // Con record moderno
        Entrada_Record entrada3 = new Entrada_Record("Festival de Jazz", 350.0);

        System.out.println("🎟️ Entradas Tradicionales:");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        System.out.println("\n🎟️ Entrada con Record:");
        entrada3.mostrarInformacion();
    }
}

