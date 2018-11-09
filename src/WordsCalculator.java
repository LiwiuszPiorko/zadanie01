public class WordsCalculator {
    public static String[] count(String text) {

        String text1 = text.trim();

        while (text1.contains("  ")) {
            text1 = text1.replace("  ", " ");
        }
        System.out.println("tekst po zmianach" + text1);
        int wordsNumber = text1.length() - (text1.replace(" ", "")).length() + 1;
        int charNumber = text1.length();
        int charNumberWhithout = (text1.replace(" ", "")).length();
        boolean ifPal = ifPalindrom(text);

        String[] tabela = {String.valueOf(wordsNumber), String.valueOf(charNumber), String.valueOf(charNumberWhithout), String.valueOf(ifPal)};
        return tabela;
    }
    private static boolean ifPalindrom(String tekst) {
        int check = 0;
        for (int i = 0; i < tekst.length() - 1; i++) {
            if (!tekst.substring(i, i + 1).equals(tekst.substring(tekst.length() - i - 1, tekst.length() - i))) {
                return false;
            }
        }
        return true;
    }
}
