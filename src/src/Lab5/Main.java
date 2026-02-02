package Lab5;

public class Main {
    public static void main(String[] args){
        // 1
        TextInstruments ti = new TextInstruments();
        String text1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

        String longerWord = ti.findLongerWord(text1);
        System.out.println("Longer word is: " + longerWord);

        // 2
        String[] someWords = new String[] {"civic", "Level    ", "freestyler        "};
        for(String word : someWords)
        {
            System.out.println(TextInstruments.palindromeChek(word));
        }

        // 3
        String text3 = "Кто сказал БЯКА, эта Бяка всем бяка!";
        String result = ti.censored(text3, "бяка", "[вырезано цензурой]");
        ti.print(result);

        // 4
        String text4 = "Анна купила Ананас и анаконду,и теперь гуляет с ней в ананасном лесу, с другими АНАКОНДАМИ";
        int numOfSubstr = ti.countStrOfSubstr(text4, "ан");
        System.out.println("Number of substrings: "+ numOfSubstr);

        // 5
        String text5 = "The given string is: This is a test string";
        String reverseString = ti.invertString(text5);
        System.out.println("The given string is: " + text5);
        System.out.println("The string reversed word by word is: " + reverseString);
    }
}