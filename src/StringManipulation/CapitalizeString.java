package StringManipulation;

public class CapitalizeString {
    public static void main(String[] args) {
        String originalString = "this is my java code";
        String capitalizedString = capitalizeFirstLetterOfEachWord(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Capitalized String: " + capitalizedString);
    }

    private static String capitalizeFirstLetterOfEachWord(String input) {
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                result += firstChar + word.substring(1) + " ";
            }
        }

        return result.trim();  // Remove trailing space
    }
}