import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // cuando son datos byte hay que ponerlo entre parentesis
        // hemos creado nuestro primer objeto, instanciamos la clase Persona
        // objeto es una instancia de una clase
        Persona p1 = new Persona("Fernando", (byte) 45, 1.78);
        // valores de tipo objeto -> "Referencia" un espacio en memoría
        System.out.println(p1);
        // ocupa el mismo espacio de memoria y la misma referencia de memoria
        Persona p2 = p1;
        // cualquier cambio que hagas en p1 se aplica en p2 y viceversa.
        System.out.println(p2);
        // Usan la misma referencia de memoria
        Persona p3 = new Persona();
        System.out.println(p3);
        p3 = null; // Este objeto se queda sin referencia de memoria y el recolector de basura lo elimina...
        System.out.println(p3);
        Persona p4; // new es quien crea el objeto y su referencia en memoria.

        // Otra forma que actua el recolector de basura
        p4 = new Persona();
        p4 = new Persona(); // anula la referencia de la línea anterior.

        // Llamada a metodos getter -> solicitar información o mostrar
        System.out.println("Nombre: " + p1.getNombre()); // NOMBRE Fernando
        System.out.println("Edad: " + p1.getEdad()); // EDAD Fernando
        System.out.println("Estatura: " + p1.getAltura()); // ALTURA Fernando

        Persona p5 = new Persona("Juan", (byte) 22, 1.78);
        System.out.println("Nombre: " + p5.getNombre()); // NOMBRE Juan
        System.out.println("Edad: " + p5.getEdad()); // EDAD Juan
        System.out.println("Estatura: " + p5.getAltura()); // ALTURA Juan

        p4.setNombre("Alba");
        p4.setEdad((byte) 24);     // Ahora p4 tiene datos y antes estaba vacío
        p4.setAltura(1.60);
        System.out.println(p4.toString());
//        ArrayList<Persona> lista = new ArrayList();
//        lista.add(p1);
//        lista.add(p2);        MÁS ADELANTE
//        lista.add(p3);
    }
}