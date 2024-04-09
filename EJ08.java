// EJ08.java
// EJ08.java
public class EJ08 {
    public static void main(String[] args) {
        // Crear una instancia de Programador
        Programador programador = new Programador("Juan Perez", 25, new String[]{"C#", "JavaScript", "SQL"});

        // Imprimir detalles del programador
        programador.imprimirDetalles();

        // Modificar los parámetros del programador
        programador.setNombre("Ana García");
        programador.setEdad(30);
        programador.setLenguajes(new String[]{"Java", "Python", "C++"});

        // Imprimir nuevos detalles del programador
        System.out.println("\nNuevos detalles del programador:");
        programador.imprimirDetalles();
    }
}


