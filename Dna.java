public class Dna { // program that determines whether there is a protein in a strand of DNA

    public void findProtein(String dna) {

    }

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // generic DNA var that can be set to any DNA sequence
        String dna = dna2;
        int length = dna.length();
        System.out.println("Length: " + length);

        // finding start (ATG) and stop (TGA) codon
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA");
        System.out.println("Start: " + startCodon);
        System.out.println("Stop: " + stopCodon);

        // Find the protein:
        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            System.out.println("Condition 1, 2 and 3 are fufilled.");
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein found.");
        }
    }
}
