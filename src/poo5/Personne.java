package poo5;

public class Personne extends Contact {

    private int age;
    private String numeroTelephone;

    public Personne(String nom, String email, int age, String numeroTelephone) {
        super(nom, email);
        this.age = age;
        this.numeroTelephone = numeroTelephone;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Age : " + this.age + "\nNumero Telephone : " + this.numeroTelephone);
    }



}
