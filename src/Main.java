public class Main {
    public static void main(String[] args) {
        Actuador actuador1 = new Actuador();
        actuador1.codigo = "ACT-001";
        actuador1.tipo = "Cilindro Neumático";
        actuador1.posicion = 0.0;
        actuador1.activo = false;

        Actuador actuador2 = new Actuador();
        actuador2.codigo = "ACT-002";
        actuador2.tipo = "Válvula Proporcional";
        actuador2.posicion = 15.5;
        actuador2.activo = true;

        Actuador actuador3 = new Actuador();
        actuador3.codigo = "ACT-003";
        actuador3.tipo = "Motor Paso a Paso";
        actuador3.posicion = 45.0;
        actuador3.activo = false;


        System.out.println("=== ESTADO INICIAL DE LOS ACTUADORES ===");
        System.out.println("--- Actuador 1 ---");
        actuador1.mostrarInformacion();

        System.out.println("\n--- Actuador 2 ---");
        actuador2.mostrarInformacion();

        System.out.println("\n--- Actuador 3 ---");
        actuador3.mostrarInformacion();
        System.out.println("----------------------------------------");

        System.out.println("Modificando la posición únicamente del Actuador 1...\n");
        actuador1.activar();
        actuador1.cambiarPosicion(90.0);

        System.out.println("\n=== ESTADO FINAL (COMPROBACIÓN DE INDEPENDENCIA) ===");
        System.out.println("--- Actuador 1 ---");
        actuador1.mostrarInformacion();

        System.out.println("\n--- Actuador 2 (Sin cambios) ---");
        actuador2.mostrarInformacion();
    }
}