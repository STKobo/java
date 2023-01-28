public class Chanson {
	private String titre;
	private String nomArtiste;
	private int anneeSortie;
	private String genre;

	public Chanson(String titre, String nomArtiste, int anneeSortie, String genre) {
		this.titre = titre;
		this.nomArtiste = nomArtiste;
		this.genre = genre;
		this.anneeSortie = anneeSortie;
	}

	public Chanson(String titre, String nomArtiste, int anneeSortie) {
		this(titre, nomArtiste, anneeSortie, "Variété");
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNomArtiste() {
		return nomArtiste;
	}

	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	
	public void afficherInformations() {
		System.out.println("Titre : " + this.getTitre());
		System.out.println("Artiste : " + this.getNomArtiste());
		System.out.println("Genre : " + this.getGenre());
		System.out.println("Année de sortie : " + this.getAnneeSortie());
	}
}