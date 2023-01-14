package reverseString;

import java.util.ArrayList;

public class ReverseString {
    public String reverseString(String word){
        ArrayList<String> wordLetterByLetter = new ArrayList<>();
        for (int i = word.length() -1; i > -1; i--) {
            wordLetterByLetter.add(Character.toString(word.charAt(i)));
        }
        String result = wordLetterByLetter.toString();
        result.replace(",", "").replace(" ", "");
        result.replace(" ", "");

        return result.toLowerCase()
                .replace(",", "")
                .replace(" ", "")
                .replace("]", "")
                .replace("[", "");

    }
}
