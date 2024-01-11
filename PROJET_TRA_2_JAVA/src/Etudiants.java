public class Etudiants extends Personne implements IEtudiant {
    String numeroEtudiant;
    Classe classe;

    public Etudiants(String nom, String prenom, int anneeNaissance, String email, String id, Classe classe) {
        super(nom, prenom, anneeNaissance, email);
        this.numeroEtudiant = nom + nom.length() + anneeNaissance + "000" + id;
        this.classe = classe;
    }

    @Override
    public void sInscrire() {
        System.out.println("L'étudiant " + nom + " s'inscrit.");
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant " + nom + " suit le cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant " + nom + " passe l'examen.");
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numeroEtudiant='" + numeroEtudiant + '\'' +
                ", classe=" + classe +
                '}';
    }
}
