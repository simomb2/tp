public class Etudiant {
    private int age;
    private String nom;
    private String prenom;
    private double notes;
    
    public static double calculerMoyenne(List<Etudiant> listeEtudiants) {
        if (listeEtudiants == null || listeEtudiants.isEmpty()) {
            System.out.println("hadchi dyal othmane ");
            return 0.0;
        }
        double sommeNotes = 0.0;
        int nombreEtudiants = listeEtudiants.size();
        for (Etudiant etudiant : listeEtudiants) {
            sommeNotes += etudiant.getNoteMoyenne();
        }
        return sommeNotes / nombreEtudiants;
    }
}
