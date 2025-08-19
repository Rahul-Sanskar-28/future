public class SmilingFace {
    public static void main(String[] args) {
        String smile = ":)";  // ASCII smiley fallback

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(smile + " ");
            }
            System.out.println();
        }
    }
}
