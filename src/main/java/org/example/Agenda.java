package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a List of contacts
 *
 * @author Juan Pujalte Martinez
 * @version 1.0 06/03/2024
 */
public class Agenda {
    /**
     * The class List of contacts.
     */
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Default constructor, which initializes the list of contacts.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Adds a new contact.
     * If a contact with the same name already exists (ignoring case),
     * instead the phone number is added to the contact with such name.
     *
     * @param name  The contact's name
     * @param phone The contact's phone number
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Removes any contact with the given name.
     *
     * @param name The name of the contact to remove
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Replaces a phone number of any contact with a given name with a new phone number.
     *
     * @param name     The name of the contact to which the phone number we want to replace belongs.
     * @param oldPhone The phone number to replace with the new one.
     * @param newPhone The new phone number.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Gets the List of contacts.
     *
     * @return A List of contacts.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}