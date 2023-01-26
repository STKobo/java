
public class Rectangle extends Figure {
	private double largeur;
	private double longueur;
	public Rectangle(double x, double y, double larg, double longueur) {
		super(x, y);
		this.largeur = larg;
		this.longueur = longueur;
	}
	public double surface() {
		return largeur * longueur;
	}
	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double l) {
		longueur = l;
	}
	public void setLargeur(double l) {
		largeur = l;
	}
	public void afficher () {
		super.afficher();
		System.out.println("Largeur = " + largeur);
		System.out.println("Longueur = " + longueur);
	}
}
