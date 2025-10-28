import java.util.Objects;

// Class: Etudiant
// Purpose: Represents a student with a name (nom) and an identifier (numero).
public class Etudiant {
    private String nom;
    private int numero;

    public Etudiant(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    // Getters
    public String getNom() { return nom; }
    public int getNumero() { return numero; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return numero == etudiant.numero && nom.equals(etudiant.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, numero);
    }

    @Override
    public String toString() {
        return "Etudiant{" + "nom='" + nom + '\'' + ", numero=" + numero + '}';
    }
}
