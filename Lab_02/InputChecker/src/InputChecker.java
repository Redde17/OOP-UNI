import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {

        String[] okList = {"s", "si", "ok", "certo", "perché no?"};
        String[] endList = {"n", "no"};
        //input.toLowerCase())
        for (String word: okList)
            if(input.equalsIgnoreCase(word))
                return "OK";

        for (String word: endList)
            if(input.equalsIgnoreCase(word))
                return "Fine";

        return "Dato non corretto";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}