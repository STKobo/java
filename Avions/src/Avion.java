
public class Avion extends Aeronef {
	public Avion(int numeroImmatriculation, String nomModele, int nombrePlacesABord) {
		super(numeroImmatriculation, nomModele, nombrePlacesABord);
	}
	@Override
	public void decoller() {
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", roule sur la piste.");
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", quitte le sol.");
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", vient de d�coller.");
	}
	@Override
	public void atterrir() {
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", vient de regagner le sol.");
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", roule sur la piste.");
		System.out.println("L'avion " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", s'est arr�t�.");
	}
}
