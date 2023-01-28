public class Livre {
    private static int nombreLivresEnregistres = 0;
    
    private String titre;
    private String nomAuteur;
    private int anneeParution;
    private String nomEditeur;
    private String description;
    
    public Livre(String titre, String nomAuteur, int anneeParution, String nomEditeur, String description) {
        nombreLivresEnregistres++;
        
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.anneeParution = anneeParution;
        this.nomEditeur = nomEditeur;
        this.description = description;
    }
    public String getTitre() {
        return this.titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getNomAuteur() {
        return this.nomAuteur;
    }
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
    public int getAnneeParution() {
        return this.anneeParution;
    }
    public void setAnneeParution(int anneeParution) {
        this.anneeParution = anneeParution;
    }
    public String getNomEditeur() {
        return this.nomEditeur;
    }
    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }
    
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void afficherInformations() {
        System.out.println("Titre : " + this.getTitre());
        System.out.println("Auteur : " + this.getNomAuteur());
        System.out.println("Année de parution : " + this.getAnneeParution());
        System.out.println("Éditeur : " + this.getNomEditeur());
        
        System.out.println("Description : " + this.getDescription() + "\n");
    }
    
    public static int getNombreLivresEnregistres() {
        return nombreLivresEnregistres;
    }
}
