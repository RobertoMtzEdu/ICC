package mx.unam.ciencias.icc;

/**
 * Práctica 1: Orientación a Objetos y sintaxis de Java.
 */
public class Practica1 {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Armando", 15, 5.0, 27);
        e1.setNombre("Choche");
        System.out.println(e1.getNombre()); // R. Choche
        e1.setCuenta(1500);
        System.out.println(e1.getCuenta()); // Esperado R. 1500
        System.out.println(e1.getPromedio()); // R. 5.0
        System.out.println(e1.getEdad()); // R. 27

        Estudiante e2 = new Estudiante("Roberto", 100, 10.0, 25);
        System.out.println(e2.getNombre()); // R. Roberto
        System.out.println(e2.getCuenta()); // R. 100
        System.out.println(e2.getPromedio()); // R. 10.0
        System.out.println(e2.getEdad()); // R. 25
    }

}
