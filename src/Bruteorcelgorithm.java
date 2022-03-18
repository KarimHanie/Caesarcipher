public class Bruteorcelgorithm {
    // constructor
    public Bruteorcelgorithm() {
    }

    int key;
    int equation;
    private String[] Cipher;
    private String[] plaintext;
    private String[] engChar = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    private String[] bruteForce ={ "", "", "", "", "", "", "", "", "",
    "", "", "", "", "", "", "", "",
    "", "", "", "", "", "", "", "", "" };

    public void decryption(String[] Cipher) {

        this.key = key;
        this.Cipher = Cipher;
        plaintext = new String[Cipher.length];
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < Cipher.length; i++) {
                for (int j = 0; j < engChar.length; j++) {
                    if ((Cipher[i]).contains(" ")) {
                        plaintext[i] = " ";
                        bruteForce[k] = bruteForce[k] + plaintext[i];
                        break;
                    } else if (Cipher[i].equalsIgnoreCase(engChar[j])) {
                        // System.out.println("character place in " + j + " value of i " + i);
                        equation = (j - k) % 26;
                        // System.out.println("Key "+k+"Value of i " +i+ "value of j "+j+" Equation :
                        // "+equation);
                        
                        // why this if condition cause the result of mod can be negative so we will add
                        // the length of array to it to give us positive number
                        if (equation < 0)
                            equation += engChar.length;
                        // System.out.println("using key "+k+" Value of cipher :"+Cipher[i]+" to
                        // character : "+engChar[equation]);
                        plaintext[i] = engChar[equation];
                        // System.out.println(" value of plain text "+plaintext[i]);
                        bruteForce[k] += "" + plaintext[i];
                        // System.out.println("value of first element in k "+bruteForce[k]);

                        break;
                    }
                }
            }
        }
        printBruteForce();
    }

    public void printBruteForce() {
        for (int i = 0; i < bruteForce.length; i++) {
            System.out.printf("Caesar(%d)\t:%S \n", i, bruteForce[i]);
        }
    }
}
