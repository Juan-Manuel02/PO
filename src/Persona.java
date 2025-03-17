public class Persona {
    // definición de los atributos de la clase
    String nombre;
    byte edad;
    double altura;

    // Metodos constructores
    public Persona(String nombreDeLaPersona, byte edad, double altura) {
        this.nombre = nombreDeLaPersona;
        // es recomendable usar el this. porque aunque si cambias el nombre y lo ponemos de otra forma
        // sigue funcionando pero en el momento que coincidan los nombres se ralla el programa.
        this.edad = edad;
        this.altura = altura;
    }

    public Persona() {}
    // Métodos que se van a crear dentro de la clase. Esto son métodos no estáticos, porque la clase no es estática
    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    // Métodos -> comportamientos o acciones de la clase.

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    // Métodos setter, me permiten asignar o actualizar valores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }




    // Como último método -> toString -> se recomienda formatearlo

    @Override
    public String toString() {
        return "Nombre= " + nombre +
                "\nEdad= " + edad +
                "\nAltura= " + altura;
    }
}

