import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(new Etudiants("Seck", "Aissatou", 1990, "aissatou.seck1@gmail.com", "1", Classe.L3));
        personnes.add(new Etudiants("Faye", "Marie", 2003, "fayemarie@gmail.com", "2", Classe.M1));
        personnes.add(new Etudiants("Bodian", "Mariama", 2002, "mbodian@gmail.com", "3", Classe.M2));
        personnes.add(new Professeur("Bodian", "Nene", 2017, "nnbodian@gmail.com", new HashSet<>(Arrays.asList("JAVA", "JAVASCRIPT"))));
        personnes.add(new Professeur("Ndour", "Maissa", 2004, "maissandour@gmail.com", new HashSet<>(Arrays.asList("LARAVEL", "JAVA"))));
        personnes.add(new Professeur("TRAORE", "Tra", 1999, "tbodian@gmail.com", new HashSet<>(Arrays.asList("FLUTTER", "PHP"))));

        for (Personne personne : personnes) {
            System.out.println(personne);
            if (personne instanceof IEtudiant) {
                ((IEtudiant) personne).sInscrire();
                ((IEtudiant) personne).suivreCours();
                ((IEtudiant) personne).passerExamen();
            }
            if (personne instanceof IProfesseur) {
                ((IProfesseur) personne).enseigner();
                ((IProfesseur) personne).corrigerExamen();
            }
        }
    }
}