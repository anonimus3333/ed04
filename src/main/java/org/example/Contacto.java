package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JohnPaul
 * @version 1.0
 */
class Contacto {
    /**
     * Variable para el nombre
     */
    private String name;
    /**
     * Variable para los teléfonos
     */
    private List<String> phones;

    /**
     *
     * @param name es la variable para los nombres
     * @param phone es la variable para los telefonos
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Coge el nombre
     * @return valor nombre
     */
    public String getName() {
        return this.name;
    }

    /**
     *  Coge el número de teléfono
     * @return número de teléfono
     */
    public List<String> getPhones() {
        return this.phones;
    }
}