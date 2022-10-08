public class Main {
    public static void main(String[] args) {
        String[] words = {"pippo", "pluto", "alice", "bob"};

        for (String word : words) {
            String middleChar;
            int halfWordLt = word.length() / 2;
            middleChar = word.substring(halfWordLt, halfWordLt + 1);
            System.out.println(middleChar);
        }
    }
}