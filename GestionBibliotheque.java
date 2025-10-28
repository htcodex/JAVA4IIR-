// Class: GestionBibliotheque
// Purpose: Manage a simple collection of Livre instances: add and display books.
// Notes: Contains main() to demonstrate usage.
// Liaison: This class aggregates Livre objects (composition/aggregation). It stores Livre instances in a collection and calls their getters/toString() to present information.

import java.util.ArrayList;

public class GestionBibliotheque {
    private ArrayList<Livre> livres;

    public GestionBibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void afficherLivres() {
        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        GestionBibliotheque gb = new GestionBibliotheque();
        gb.ajouterLivre(new Livre("L'Étranger", "Albert Camus", 1942));
        gb.ajouterLivre(new Livre("1984", "George Orwell", 1949));
        gb.afficherLivres();
    }
}
