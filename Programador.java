// Programador.java
public class Programador {
    private String nombre;
    private int edad;
    private String[] lenguajes;

    // Bloque de inicialización
    {
        nombre = "John Doe";
        edad = 30;
        lenguajes = new String[]{"Java", "Python", "JavaScript"};
    }

    // Constructor
    public Programador(String nombre, int edad, String[] lenguajes) {
        this.nombre = nombre;
        this.edad = edad;
        this.lenguajes = lenguajes;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    // Método para imprimir detalles del programador
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Lenguajes: ");
        for (String lenguaje : lenguajes) {
            System.out.println("- " + lenguaje);
        }
    }
}
