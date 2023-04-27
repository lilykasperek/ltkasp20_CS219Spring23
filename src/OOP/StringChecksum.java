package OOP;

public class StringChecksum implements Checksum<String> {
    @Override
    public int checksum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum = sum + n.charAt(i);
        }
        return sum;
    }
}
