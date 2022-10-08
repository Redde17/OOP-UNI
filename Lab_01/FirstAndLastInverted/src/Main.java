public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            String result = "Stringa corta";
            int wrdLt = word.length();

            if(wrdLt >= 2)
                result = word.charAt(wrdLt - 1) + word.substring(1, wrdLt - 1) + word.charAt(0);

            System.out.println(result);
        }
    }
}