import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

public class RSA {
    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    public RSA(int bitLength) {
        SecureRandom secureRandom = new SecureRandom();
        BigInteger p = new BigInteger(bitLength / 2, 100, secureRandom); // Generate a random prime number p
        BigInteger q = new BigInteger(bitLength / 2, 100, secureRandom); // Generate a random prime number q
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); // Compute Euler's totient function phi(n)

        modulus = p.multiply(q); // Compute modulus (n = p * q)
        publicKey = new BigInteger("65537"); // commonly used value for the public key
        privateKey = publicKey.modInverse(phi); // Compute the private key (d) using the public key (e) and phi(n)
    }

    public BigInteger encrypt(BigInteger message) {
        return message.modPow(publicKey, modulus); // Apply modular exponentiation for encryption (c = m^e mod n)
    }

    public BigInteger decrypt(BigInteger encryptedMessage) {
        return encryptedMessage.modPow(privateKey, modulus); // Apply modular exponentiation for decryption (m = c^d mod n)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bit length for RSA key generation: "); // usually taken as 1024
        int bitLength = scanner.nextInt();
        RSA rsa = new RSA(bitLength); // Create an instance of RSA with the specified bit length

        System.out.print("Enter the number you want to encrypt: ");
        BigInteger message = scanner.nextBigInteger(); // Read the number to encrypt from the user
        System.out.println("Original message: " + message);

        BigInteger encryptedMessage = rsa.encrypt(message); // Encrypt the message using RSA
        System.out.println("Encrypted message: " + encryptedMessage);

        BigInteger decryptedMessage = rsa.decrypt(encryptedMessage); // Decrypt the encrypted message using RSA
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}