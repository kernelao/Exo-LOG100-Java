package poo5;

import java.util.ArrayList;

/**
 * Classe permettant de gérer une liste de contacts (personnes ou entreprises).
 * Fournit des méthodes pour ajouter, afficher, rechercher et supprimer des contacts.
 *
 * @author kernelao
 * @version 1.0
 */
public class GestionnaireContacts {

    ArrayList<Contact> contacts;

    /**
     * Constructeur de la classe GestionnaireContacts.
     * Initialise la liste des contacts.
     */
    public GestionnaireContacts() {
        contacts = new ArrayList<>();
    }

    /**
     * Ajoute un contact à la liste s’il n’est pas null.
     *
     * @param contact le contact à ajouter
     */
    public void ajouterContact(Contact contact) {

        if (contact == null) {
            System.out.println("Échec de l'ajout - le contact n'existe pas (null)");
            return;
        }

        contacts.add(contact);
    }

    /**
     * Affiche les informations de tous les contacts de la liste.
     */
    public void afficherContacts() {

        if (contacts.isEmpty()) {
            System.out.println("Échec de l'affichage - la liste des contacts est vide !");
            return;
        }

        for (Contact contact : contacts) {
            contact.afficherInfo();
        }
    }

    /**
     * Recherche un contact par son nom et affiche ses informations s’il existe.
     *
     * @param nom le nom du contact à rechercher
     */
    public void rechercherContact(String nom) {

        if (contacts.isEmpty()) {
            System.out.println("Échec de l'affichage - la liste des contacts est vide !");
            return;
        }

        for (Contact contact : contacts) {
            if (nom.equals(contact.getNom())) {
                contact.afficherInfo();
                return;
            }
        }

        System.out.println("Le contact n'existe pas.");
    }

    /**
     * Supprime un contact de la liste s’il est trouvé.
     *
     * @param nom le nom du contact à supprimer
     */
    public void supprimerContact(String nom) {

        if (contacts.isEmpty()) {
            System.out.println("Échec de suppression - la liste des contacts est vide !");
            return;
        }

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
