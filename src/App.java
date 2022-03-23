import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // call class called encryption
        Encryption enc = new Encryption();
        Decryption decryption = new Decryption();
        Bruteorcelgorithm force = new Bruteorcelgorithm();
        int option;
        boolean exit = false;
        System.out.println("choose option :\n 1- Encryption \n 2- Decryption \n 3- attack (Hacker man) \n 4- exit ");
        while (exit == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("enter number ( 1/2/3/4)");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter Plaintext : ");
                    sc.nextLine(); // cause the first scan will skipped as the next line take the enter as an input
                    String plaintext = sc.nextLine();
                    System.out.print("Enter the Key ");
                    String key = sc.next();
                    int k = Integer.parseInt(key);
                    String[] pk = new String[plaintext.length()];
                    for (int i = 0; i < plaintext.length(); i++) {
                        pk[i] = String.valueOf(plaintext.charAt(i));
                    }
                    enc.encryption(pk, k);
                    break;
                case 2:
                    System.out.print("Enter Plaintext : ");
                    sc.nextLine();
                    plaintext = sc.nextLine();
                    System.out.print("Enter the Key ");
                    key = sc.next();
                    k = Integer.parseInt(key);
                    pk = new String[plaintext.length()];
                    for (int i = 0; i < plaintext.length(); i++) {
                        pk[i] = String.valueOf(plaintext.charAt(i));
                    }

                    decryption.decryption(pk, k);
                    break;
                case 3:
                    System.out.print("Enter Plaintext : ");
                    sc.nextLine();
                    plaintext = sc.nextLine();
                    System.out.println("first print in 3 " + plaintext);
                    pk = new String[plaintext.length()];
                    for (int i = 0; i < plaintext.length(); i++) {
                        pk[i] = String.valueOf(plaintext.charAt(i));
                    }
                    force.decryption(pk);
                    for (String value : pk)
                        System.out.print(value);
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }

    }
}
