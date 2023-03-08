package Cucumber;

public class StepDefinitions {
    VirtualPet pet = new VirtualPet();
    @Given("La jauge de faim du compagnon est inferieure a {int}")
    public void la_jauge_de_faim_du_compagnon_est_inferieure_a(int jaugeFaim) {
        pet.setjaugeFaim((int)(Math.random() * jaugeFaim));
    }
    @When("On nourrit le compagnon virtuel avec {string}")
    public void nourrir_compagnon(String nourriture) {
        pet.eat(nourriture);
    }
    @Then("Le compagnon virtuel n'a plus faim")
    public void compagnon_repu() {
        assertTrue(100 == pet.getJaugeFaim());
        System.out.println("Energie : " + pet.getJaugeFaim());
    }
}