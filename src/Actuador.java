public class Actuador {
    public String codigo;
    public String tipo;

    double posicion;
    boolean activo;

    public void activar() {
        activo = true;
        System.out.println("El actuador con código " + codigo + " ha sido activado.");
    }

    public void cambiarPosicion(double nuevaPosicion) {
        posicion = nuevaPosicion;
        System.out.println("La posición del actuador " + codigo + " ha cambiado a: " + posicion);
    }

    void desactivar() {
        activo = false;
        System.out.println("El actuador con código " + codigo + " ha sido desactivado.");
    }

    void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Posición: " + posicion);
        System.out.println("Activo: " + activo);
    }
}