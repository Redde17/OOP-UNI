public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "ciao", "pippo"};

        for (String word : words) {
            String result = "Stringa corta";
            int wrdLt = word.length();

            if(word.length() >= 2)
                result = word.substring(wrdLt / 2, wrdLt) + word.substring(0, wrdLt / 2);

            System.out.println(result);
        }
    }
}