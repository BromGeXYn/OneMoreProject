public class FormatStringService {
    public static void printFirst8Numbers(String text){
        String result = text.substring(0, 4) + text.substring(9, 13);
        System.out.println(result);
    }
    public static void switchLettersToAsterisk(String text){
        String result = text.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(result);
    }
    public static void printLetters(String text){
        String result = (text.substring(5, 8) + "/" + text.substring(14, 17) + "/" +
                text.substring(19, 20) + "/" + text.substring(21)).toLowerCase();
        System.out.println(result);
    }
    public static void printLettersSB(String text){
        StringBuilder builder = new StringBuilder("Letters:");
        StringBuilder builder2 = new StringBuilder(text);
        builder.append((builder2.substring(5, 8) + "/" + builder2.substring(14, 17) + "/" +
                builder2.substring(19, 20) + "/" + builder2.substring(21)).toUpperCase());
        System.out.println(builder.toString());
    }
    public static void isContains(String text, String subString){
        String lowerCase = text.toLowerCase();
        String lowerCase1 = subString.toLowerCase();
        boolean isContain = lowerCase.contains(lowerCase1);
        System.out.println(isContain);
    }
    public static void isBeginsWith(String text, String subString){
        String lowerCase = text.toLowerCase();
        String lowerCase1 = subString.toLowerCase();
        boolean isBegins = (lowerCase.startsWith(lowerCase1));
        System.out.println(isBegins);
    }
    public static void isEndsWith(String text, String subString) {
        String lowerCase = text.toLowerCase();
        String lowerCase1 = subString.toLowerCase();
        boolean isEnds = (lowerCase.endsWith(lowerCase1));
        System.out.println(isEnds);
    }
}
