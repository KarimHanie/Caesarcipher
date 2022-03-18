import java.lang.Math;

public class Decryption {
    int key;
    int equation;
    private String[] Cipher;
    private String[] plaintext;
    private String[] engChar = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    // constructor
    public Decryption() {
    }

    public void decryption(String[] Cipher, int key) {
        this.key = key;
        this.Cipher = Cipher;
        plaintext = new String[Cipher.length];
        for (int i = 0; i < Cipher.length; i++) {
            for (int j = 0; j < engChar.length; j++) {
                if ((Cipher[i]).contains(" ")) {
                    plaintext[i] = " ";
                    break;
                } else if (Cipher[i].equalsIgnoreCase(engChar[j])) {
                    // System.out.println("character place in " + j + " value of i " + i);
                    equation = (j - key) % 26;
                    if(equation<0)
                        equation+=engChar.length;
                    // System.out.println("key equal "+ key);
                    // System.out.println(" Value of equation = "+equation);
                    plaintext[i] = engChar[equation];
                    // System.out.println(" value of plain text "+plaintext[i]);
                    break;
                }
            }
        }

        printDecryption();
    }

    public void printDecryption() {
        for (String values : plaintext)
            System.out.print(values.toLowerCase());
        System.out.println();

    }
}
