
public class Encryption{
    // constructor 
    int key;
    int equation ;
    private String[] Cipher; 
    private String [] engChar={"A","B","C","D","E","F","G","H","I",
                            "J","K","L","M","N","O","P","Q",
                            "R","S","T","U","V","W","X","Y","Z"};
       //constructor                 
    public Encryption(){}
    public void encryption(String[] plaintext, int key){
        this.key=key;
        Cipher = new String[plaintext.length];
        for(int i =0 ;i<plaintext.length;i++){
            for(int j=0;j<engChar.length;j++){
                if((plaintext[i]).contains(" ")){
                    System.out.println();
                    Cipher[i]=" ";
                    break;
                }
                else if((plaintext[i].equalsIgnoreCase(engChar[j]))){
                    equation= ((j+key)%26);
                    if(equation<0)
                        equation+=engChar.length;

                    Cipher[i]=engChar[equation];     
                    break;
                }
            }
        }
        printEncryption();
    }
    public void printEncryption(){
        for(String values : Cipher)
        System.out.print(values.toLowerCase());

    } 
}