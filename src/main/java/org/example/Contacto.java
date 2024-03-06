package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a contact with a name, and a list of phones associated with it.
 *
 * @author Juan Pujalte Martinez
 * @version 1.0 06/03/2024
 */
class Contacto {
    /**
     * The contact's name.
     */
    private String name;
    /**
     * The contact's List of phones' number.
     */
    private List<String> phones;

    /**
     * Creates a new contact with a name and a phone.
     *
     * @param name  The name of the contact.
     * @param phone The phone of the contact.
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.phones.add(phone);
    }

    /**
     * Gets the name of the contact.
     *
     * @return A string with the name of the contact.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the phones of the contact.
     *
     * @return A List of strings with the phones of the contact.
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