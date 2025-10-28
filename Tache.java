

// Class: Tache
// Purpose: Represents a task with a description and completion status.
// Liaison: Instances of Tache are stored and managed by GestionTaches (aggregation). GestionTaches keeps a LinkedList of Tache objects and calls their methods (e.g., terminer(), toString()) to update and display task state.
public class Tache {
    private String description;
    private boolean estComplete;

    public Tache(String description) {
        this.description = description;
        this.estComplete = false;
    }

    public String getDescription() { return description; }
    public boolean estComplete() { return estComplete; }
    public void terminer() { estComplete = true; }

    @Override
    public String toString() {
        return "Tache{" + "description='" + description + '\'' + ", estComplete=" + estComplete + '}';
    }
}
