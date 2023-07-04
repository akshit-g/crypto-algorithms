import java.util.Scanner;

//caeserencryp: is a function that houses all the instructions to be conducted
public class caeserencryp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the plaintext: "); //input: plain text
        String plaintext = scanner.nextLine();
        
        System.out.print("Enter the key (a number from 1 to 25): ");//key to move the number of alphabets
        int key = scanner.nextInt();
        
        String ciphertext = encrypt(plaintext, key);
        System.out.println("Ciphertext: " + ciphertext);
        
        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decrypted text: " + decryptedText);
        
        scanner.close();
    }
    
    public static String encrypt(String plaintext, int key) {
        StringBuilder ciphertext = new StringBuilder(); //StringBuilder will enable to modify strings without creating new string elements
        
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            
            if (Character.isLetter(ch)) {
                char encryptedCh = (char) ((ch - 'A' + key) % 26 + 'A');
                ciphertext.append(encryptedCh);
            } else {
                ciphertext.append(ch);
            }
        }
        
        return ciphertext.toString();
    }
    
    public static String decrypt(String ciphertext, int key) {
        StringBuilder plaintext = new StringBuilder();
        
        for (int i = 0; i < ciphertext.length(); i++) { //initiates a loop that iterates over each character of the ciphertext
            char ch = ciphertext.charAt(i);
            
            if (Character.isLetter(ch)) {
                char decryptedCh = (char) ((ch - 'A' - key + 26) % 26 + 'A');
                plaintext.append(decryptedCh);
            } else {
                plaintext.append(ch);
            }
        }
        
        return plaintext.toString();
    }
}
