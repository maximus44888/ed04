package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        Agenda agendaContactos = new Agenda();

        // Añadir contactos a la agenda.
        agendaContactos.addContact("John Doe", "1234567890");
        agendaContactos.addContact("Jane Doe", "9876543210");
        agendaContactos.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}