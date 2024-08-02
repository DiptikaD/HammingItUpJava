
public class Hamming {

    String sequence1 = "";
    String sequence2 = "";
    public Hamming(String s, String s1) {
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        sequence1 = s;
        sequence2 = s1;
    }

    public int getHammingDistance() {

        String[] sequence1arr = sequence1.split("");
        String[] sequence2arr = sequence2.split("");
        int hamCounter = 0;

        for (int i = 0; i < sequence1.length(); i++){
            if (!sequence1arr[i].matches(sequence2arr[i])){
                hamCounter++;
            }
        }
        return hamCounter;
    }
}
