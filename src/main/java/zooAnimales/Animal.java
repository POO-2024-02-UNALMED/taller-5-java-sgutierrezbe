package zooAnimales;

import gestion.Zona;

public class Animal {
    protected static int totalAnimales = 0;
    protected static int totalMamiferos = 0;
    protected static int totalAves = 0;
    protected static int totalReptiles = 0;
    protected static int totalPeces = 0;
    protected static int totalAnfibios = 0;

    private String nombre;
    private int edad;
    private String habitat; // Updated spelling
    private String genero;
    private Zona[] zonas;

    public Animal() {
        this.nombre = null;
        this.edad = 0;
        this.habitat = null; // Updated spelling
        this.genero = null;
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat; // Updated spelling
        this.genero = genero;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static String totalPorTipo() {
        return "Mamíferos: " + totalMamiferos + "\n" +
               "Aves: " + totalAves + "\n" +
               "Reptiles: " + totalReptiles + "\n" +
               "Peces: " + totalPeces + "\n" +
               "Anfibios: " + totalAnfibios;
    }

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

    public String getHabitat() { // Updated spelling
        return habitat; // Updated spelling
    }

    public void setHabitat(String habitat) { // Updated spelling
        this.habitat = habitat; // Updated spelling
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

    public String movimiento() {
        return "desplazarse";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero; // Updated spelling
    }
}