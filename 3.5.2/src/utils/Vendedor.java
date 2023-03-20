package utils;

public class Vendedor {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Vendedor() {
        this.nombre = "Carlos";
        this.apellido = "Reyes";
        this.edad = 18;
    }

    public Vendedor(String nombre, String apellido, int edad) {

        if (edad > 0 && edad < 120) {
            if (edad > 18) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
            } else {
                throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
            }
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        }        
    }    
    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public void verificarEdad(int edad) {

        if (edad > 0 && edad < 120) {
            
            if (edad > 18) {
                System.out.println("Bien, eres mayor de 18");
            } else {
                throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
            }

        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        }       

    }

    
}
