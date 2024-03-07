package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JohnPaul
 * @version 1.0
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     *
     * @param name es la variable para los nombres
     * @param phone es la variable para los telefonos
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Variable para el nombre
     */ /**
     * Coge el nombre
     * @return valor nombre
     */
    public String getName() {
        return this.name;
    }

    /**
     * Variable para los teléfonos
     */ /**
     *  Coge el número de teléfono
     * @return número de teléfono
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}