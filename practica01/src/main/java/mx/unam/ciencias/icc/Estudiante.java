package mx.unam.ciencias.icc;

/**
 * Clase para representar estudiantes. Un estudiante tiene nombre, número de
 * cuenta, promedio y edad.
 */
public class Estudiante {

    /* Nombre del estudiante. */
    private String nombre;
    /* Número de cuenta. */
    private int cuenta;
    /* Pormedio del estudiante. */
    private double promedio;
    /* Edad del estudiante.*/
    private int edad;

    /**
     * Define el estado inicial de un estudiante.
     *
     * @param nombre   el nombre del estudiante.
     * @param cuenta   el número de cuenta del estudiante.
     * @param promedio el promedio del estudiante.
     * @param edad     la edad del estudiante.
     */
    public Estudiante(String nombre,
                      int cuenta,
                      double promedio,
                      int edad) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.promedio = promedio;
        this.edad = edad;
    }

    /**
     * Regresa el nombre del estudiante.
     *
     * @return el nombre del estudiante.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Define el nombre del estudiante.
     *
     * @param nombre el nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el número de cuenta del estudiante.
     *
     * @return el número de cuenta del estudiante.
     */
    public int getCuenta() {
        return this.cuenta;
    }

    /**
     * Define el número cuenta del estudiante.
     *
     * @param cuenta el nuevo número de cuenta del estudiante.
     */
    public void setCuenta(int cuenta) {
        // Aquí va su código.
    }

    /**
     * Regresa el promedio del estudiante.
     *
     * @return el promedio del estudiante.
     */
    public double getPromedio() {
        return this.promedio;
    }

    /**
     * Define el promedio del estudiante.
     *
     * @param promedio el nuevo promedio del estudiante.
     */
    public void setPromedio(double promedio) {
        // Aquí va su código.
    }

    /**
     * Regresa la edad del estudiante.
     *
     * @return la edad del estudiante.
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Define la edad del estudiante.
     *
     * @param edad la nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        // Aquí va su código.
    }

    /**
     * Regresa una representación en cadena del estudiante.
     *
     * @return una representación en cadena del estudiante.
     */
    public String toString() {
        // Aquí va su código.
        return "123";
    }

    /**
     * Nos dice si el estudiante recibido es igual al que manda llamar el
     * método.
     *
     * @param estudiante el estudiante con el cual comparar.
     * @return <tt>true</tt> si el estudiante recibido tiene las mismas
     * propiedades que el estudiante que manda llamar al método,
     * <tt>false</tt> en otro caso.
     */
    public boolean equals(Estudiante estudiante) {
        // Aquí va su código.
        return true;
    }
}
