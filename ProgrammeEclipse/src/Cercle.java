public class Cercle extends Figure {
    private double rayon;
    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }
    public void afficher() {
        super.afficher();
        System.out.println("rayon = " + rayon);
    }
    public double surface() {
        return Math.PI * rayon * rayon;
    }
    public boolean estInterieur(double x, double y) {
        return (((x - getX()) * (x - getX())
                + (y - getY()) * (y - getY())) <= rayon * rayon);
    }
    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        if (rayon < 0.0) rayon = 0.0;
        this.rayon = rayon;
    }
}