import java.util.HashSet;

// Class: GestionEtudiants
// Purpose: Manage a set of unique Etudiant instances.
public class GestionEtudiants {
    private HashSet<Etudiant> etudiants = new HashSet<>();

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void afficherEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        GestionEtudiants ge = new GestionEtudiants();
        ge.ajouterEtudiant(new Etudiant("Ali", 101));
        ge.ajouterEtudiant(new Etudiant("Sara", 102));
        ge.ajouterEtudiant(new Etudiant("Ali", 101)); // Duplicate
        ge.afficherEtudiants();
    }
}
