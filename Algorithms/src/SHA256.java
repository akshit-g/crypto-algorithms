import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {
    public static String getSHA256(String input) throws NoSuchAlgorithmException {
        // Create an instance of the SHA-256 MessageDigest
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Compute the hash of the input string
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

        // Convert byte array to hexadecimal string representation
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            // Convert each byte to a 2-character hexadecimal string
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                // Add leading zero if the hexadecimal string is a single character
                hexString.append('0');
            }
            // Append the hexadecimal string to the result
            hexString.append(hex);
        }

        // Return the final hexadecimal string representation of the hash
        return hexString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        try {
            // Compute the SHA-256 hash of the input string
            String sha256Hash = getSHA256(input);
            
            // Print the original input string and the corresponding hash value
            System.out.println("Input: " + input);
            System.out.println("SHA-256 Hash: " + sha256Hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the Scanner object
        }
    }
}