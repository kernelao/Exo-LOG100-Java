package poo5;

import java.util.ArrayList;

public class GestionnaireContacts {
    ArrayList<Contact> contacts;

    public GestionnaireContacts() {
        contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }

    public void afficherContacts() {
        for (Contact contact : contacts) {
            contact.afficherInfo();
        }
    }

    public void rechercherContact(String nom) {
        for (Contact contact : contacts) {

            if (nom.equals(contact.getNom())) {
                contact.afficherInfo();
                return;
            }
        }

        System.out.println("Le contact n'existe pas.");
    }

    public void supprimerContact(String nom) {
        for (Contact contact : contacts) {

            if (nom.equals(contact.getNom())) {
                System.out.println("Contact trouvé :");
                contact.afficherInfo();
                contacts.remove(contact);
                System.out.println("Le contact a bien été supprimé.");
                return;
            }
        }

        System.out.println("Le contact n'existe pas.");
    }
}
