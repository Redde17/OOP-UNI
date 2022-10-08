public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};
        String newWord = "";

        for (String word : words) {
            if(!word.isEmpty())
                newWord = word.substring(0,1).toUpperCase() + word.substring(1, word.length());
            System.out.println(newWord);
        }
    }
}