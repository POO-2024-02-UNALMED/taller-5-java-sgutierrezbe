package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private List<Animal> animales;
    private Zoologico zoo;

    public Zona() {
        this.nombre = null;
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }
}