public class Dna { // program that determines whether there is a protein in a strand of DNA

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // generic DNA var that can be set to any DNA sequence
        String dna = dna1;
        int length = dna.length();
        System.out.println("Length: " + length);

        // finding start (ATG) and stop (TGA) codon
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA");
        System.out.println("Start: " + startCodon);
        System.out.println("Stop: " + stopCodon);
    }
}
