package scramble;

public class Scramble {

    private String scrambleString(String str) { // for scrambling the words

        char[] word;
        boolean hasPunctuationMark = false;

        if (str.matches("[0-9]*[;,.!?]*")) { //checking if the word consist of numbers
            return str;
        } else if (str.matches("[a-zA-Z]*[;,.!?]")) {      // ha a sztring végén írásjel van
            word = str.substring(0, str.length() - 1).toCharArray();
            hasPunctuationMark = true;
        } else {
            word = str.toCharArray();
        }

        for (int j = 1; j <= word.length / 2 - 1; ++j) {
            char c = word[j];
            word[j] = word[word.length - j - 1];
            word[word.length - j - 1] = c;
        }
        return (hasPunctuationMark ? String.valueOf(word) + str.substring(str.length() - 1) : String.valueOf(word));
    }

    public String Scrambling(String str) { // scrambling the sentence

        if (str.length() == 1) {//checking if the string consist of just one character
            return str;  
        }
        
        String[] words = str.split("\\s");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length - 1; ++i) {
            sb.append(scrambleString(words[i])).append(" ");
        }
        sb.append(scrambleString(words[words.length - 1]));
        return sb.toString();
    }
}
