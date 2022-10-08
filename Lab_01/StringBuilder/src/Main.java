public class Main {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        StringBuilder newSentence = new StringBuilder();

        newSentence.append(sentence);

        for (int i = 0; i < newSentence.length(); i++) {
            if(newSentence.charAt(i) == 'e')
                newSentence.setCharAt(i, 'o');
            else if (newSentence.charAt(i) == 'o')
                newSentence.setCharAt(i, 'e');
        }

        System.out.println(newSentence);
    }
}