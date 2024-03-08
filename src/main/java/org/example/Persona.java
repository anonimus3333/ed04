package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JohnPaul
 * @version 1.0
 * @since 2024
 */
class Persona {

    /**
     *Variable para el nombre
     */
    private String name;
    /**
     * Array para los teléfonos
     */
    private List<String> phones;

    /**
     * Constructor que inicializa una nueva instancia de la clase
     * @param name variable para los nombres
     * @param phone variable para los telefonos
     */

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece el número de teléfono
     * @return número de teléfono
     */

    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Establece el nombre
     * @return nombre
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Establece el teléfono
     * @return teléfono
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}