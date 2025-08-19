
public class ContinuePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue; // skip when i == j
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
