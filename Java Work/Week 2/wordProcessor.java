public class wordProcessor implements Counter{

    @Override
    public int countWords(String sentence) {
        int i = 0;
        String[] CWords = sentence.split(" ");
        for (String s: CWords) {
            i++;
        }
        return i;
    }

    @Override
    public int countLetters(String sentence) {
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)))
                letters++;
        }
        return letters;
    }

    @Override
    public int getLength(String sentence) {
        return sentence.length();
    }
}
