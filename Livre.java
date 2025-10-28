// Class: Livre
// Purpose: Represents a book with a title (titre), an author (auteur), and a publication year (annee).
// Notes: Provides simple getters and a readable toString() for debugging and display.
// Liaison: Instances of Livre are stored and managed by GestionBibliotheque (aggregation). GestionBibliotheque maintains a collection of Livre objects and uses their getters/toString to display information.
// Liaison detail: Other modules instantiate Livre and pass these instances to manager classes (e.g., GestionBibliotheque). Livre has no external dependencies and can be used independently for storage, display, or persistence.

public class Livre {
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }

    @Override
    public String toString() {
        return "Livre{" +
               "titre='" + titre + '\'' +
               ", auteur='" + auteur + '\'' +
               ", annee=" + annee +
               '}';
    }
}