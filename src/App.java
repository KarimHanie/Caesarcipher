import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // call class called encryption
        Encryption enc = new Encryption();
        Decryption decryption = new Decryption();
        Bruteorcelgorithm force=new Bruteorcelgorithm();
        int option;
        boolean exit = false;
        System.out.println("choose option :\n 1- Encryption \n 2- Decryption \n 3- attack (Hacker man) \n 4- exit ");
        while (exit == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter Plaintext : ");
            String plaintext = sc.nextLine();
            System.out.print("Enter the Key ");
            int key = sc.nextInt();
            String[] pk = new String[plaintext.length()];
            for (int i = 0; i < plaintext.length(); i++) {
                pk[i] = String.valueOf(plaintext.charAt(i));
            }
            System.out.println("enter number ( 1/2/3/4)");
            option = sc.nextInt();
            switch (option) {
                case 1:
                
                    enc.encryption(pk, key);
                    break;
                case 2:
                    decryption.decryption(pk, key);
                    break;
                case 3:
                    force.decryption(pk);
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }

    }
}
