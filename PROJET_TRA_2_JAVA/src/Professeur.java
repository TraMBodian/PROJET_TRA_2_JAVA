import java.util.Set;

public class Professeur extends Personne implements IProfesseur {
    Set<String> specialite;

    public Professeur(String nom, String prenom, int anneeNaissance, String email, Set<String> specialite) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite = specialite;
    }

    @Override
    public void enseigner() {
        System.out.println("Le professeur " + nom + " enseigne.");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur " + nom + " corrige l'examen.");
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "specialite=" + specialite +
                '}';
    }
}