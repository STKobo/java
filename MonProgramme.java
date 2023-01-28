public class MonProgramme {
    public static void main(String[] args){
        Livre l1 = new Livre("Le Horla", "Guy de Maupassant", 1887, "Paul Ollendorff", "Recueil de nouvelles écrites par les soins de Guy de Maupassant, grand écrivain s'il en est.");
		Livre l2 = new Livre("Ubu roi", "Alfred Jarry", 1896, "Mercure de France", "Pièce de théâtre évoquant l'histoire d'un roi nommé Ubu, aussi tyrannique que burlesque.");
		
		System.out.println(Livre.getNombreLivresEnregistres() + " enregistré(s) actuellement.");
		l1.afficherInformations();
		l2.afficherInformations();
    }
}