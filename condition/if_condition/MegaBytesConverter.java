
public class MegaBytesConverter {

    public static void printBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
            return;
        }

        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }

    public static void main(String[] args) {
        printBytes(10_000);  // Output: 10000 KB = 9 MB and 784 KB
        printBytes(-10_000); // Output: Invalid value
    }

}
