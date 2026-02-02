package Lab5;

public class TextInstruments {
    private String text;  // поле текста

    public TextInstruments() {
        this.text = "";
    }

    public TextInstruments(String text) {
        this.text = text;
    }

    // методы

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    // Разделяет текст на слова
    public String[] separateWords() {
        // проверка
        if (text == null || text.isEmpty()) {
            return new String[0];
        }
        //String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        return this.text.split("[\\s\\p{Punct}]+");
    }

    public String[] separateWords(String inputText) {
        // проверка
        if (inputText == null || inputText.isEmpty()) {
            return new String[0];
        }
        //String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        return inputText.split("[\\s\\p{Punct}]+");
    }

    // Задание 1: метод для поиска самого длинного слова в тексте.
    //  Ищет самое длинное слово
    public String findLongerWord(String inputText) {
        if(inputText.isEmpty()){
            return "";
        }
        String[] words = this.separateWords();
        // проверка
        if (words.length == 0) {
            return "";
        }

        String maxLengthWord = words[0];
        int maxLength = maxLengthWord.length();

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }

    // Задание 2. Проверка является ли слово палиндромом
    public static boolean palindromeChek(String word) {
        // проверка
        if (word == null || word.isEmpty()) {
            return false;
        }
        word = word.strip(); // убираем пробелы

        StringBuilder sb = new StringBuilder(word);
        String reverseWord = sb.reverse().toString();
        return (word.equalsIgnoreCase(reverseWord));
    }

    // Задание 3. метод, заменяющий в тексте все вхождения слова <word> на <censored>
    // без учета регистра
    public String censored(String inputText, String word, String censored) {
        // проверка
        if (inputText == null || inputText.isEmpty() ||
                word == null || word.isEmpty() || censored == null) {
            return "";
        }

        // к нижнему регистру
        String wordLower = word.toLowerCase();

        StringBuilder sb = new StringBuilder(inputText);
        String tmpTxt = sb.toString().toLowerCase();

        int lenWord = word.length();
        int searchIdx = 0;

        // Находим все вхождения для word
        while (true) {
            // начиная с текущей позиции
            searchIdx = tmpTxt.indexOf(wordLower, searchIdx);

            // если не найдено выходим
            if (searchIdx == -1) {
                break;
            }
            // Заменяем в ОРИГИНАЛЬНОМ объекте
            sb.replace(searchIdx, searchIdx + lenWord, censored);

            // после замены обновляем копию
            tmpTxt = sb.toString().toLowerCase();

            // сдвиг позиции
            searchIdx += censored.length();

            // проверка выхода за границу строки
            if (searchIdx >= tmpTxt.length()) {
                break;
            }
        }

        return sb.toString();
    }

    // Задание 4. Подсчет количества вхождений одной подстроки в другую.
    public int countStrOfSubstr(String text, String substr) {
        // проверка
        if (text == null || text.isEmpty() ||
                substr == null || substr.isEmpty()) {
            return 0;
        }
        // в нижний регистр
        substr = substr.toLowerCase();
        text = text.toLowerCase();

        // счетчики
        int count = 0;
        int searchIdx = 0;

        while (searchIdx < text.length()) {
            // начиная с текущей позиции
            searchIdx = text.indexOf(substr, searchIdx);

            // если не найдено выходим
            if (searchIdx == -1) {
                break;
            }
            count++;
            // сдвиг позиции
            searchIdx += substr.length();
        }
        return count;
    }

    // Задание 5. Метод, который инвертирует слова в строке.
    public String invertString(String inputText) {
        // проверка
        if (inputText == null || inputText.isEmpty()) {
            return "";
        }
        String[] words = this.separateWords(inputText); // разделяем на слова

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            //инверсия каждого слова
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());

            // пробелы
            if (i < words.length - 1) { // кроме последнего
                result.append(" ");
            }
        }

        return result.toString();
    }

    // печать на консоль текста из поля

    public void print() {
        if (text == null || text.isEmpty()) {
            System.out.println(" ");
        } else {
            System.out.println(this.text);
        }
    }

    // печать на консоль произвольной строки
    public void print(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println(text);
        }
    }

}
