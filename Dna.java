public class Dna { // program that determines whether there is a protein in a strand of DNA

    public void findProtein(String dna) {
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
            System.out.println("Protein: " + protein + "\n");
        } else {
            System.out.println("No protein found.\n");
        }
    }

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        Dna myDna = new Dna();
        System.out.print("------CHECKING DNA1------\n");
        myDna.findProtein(dna1);
        System.out.print("------CHECKING DNA2------\n");
        myDna.findProtein(dna2);
        System.out.print("------CHECKING DNA3------\n");
        myDna.findProtein(dna3);
    }
}
