
public class Helicoptere extends Aeronef {
	public Helicoptere(int numeroImmatriculation, String nomModele, int nombrePlacesABord) {
		super(numeroImmatriculation, nomModele, nombrePlacesABord);
	}
	@Override
	public void decoller() {
		System.out.println("L'h�licopt�re " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", fait tourner son h�lice.");
		System.out.println("L'h�licopt�re " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ",  monte et quitte le sol.");
	}
	@Override
	public void atterrir() {
		System.out.println("L'h�licopt�re " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", descend jusqu'au sol.");
		System.out.println("L'h�licopt�re " + this.getNomModele() + ", immatricul� " + this.getNumeroImmatriculation() + ", arr�te de faire tourner son h�lice.");
	}
}
