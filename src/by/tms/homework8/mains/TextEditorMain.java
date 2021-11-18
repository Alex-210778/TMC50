package by.tms.homework8.mains;

import by.tms.homework8.textutils.TextEditorUtils;

import java.io.File;
import java.util.*;

public class TextEditorMain {

    public static void main(String[] args) {
        File textFile = new File("resources" + File.separator + "englishText.txt");
        String text = TextEditorUtils.getStringFromTextFile(textFile);
        System.out.println(TextEditorUtils.getMapOfNumberDifferentWordsInText(text));
        String string = "Hello JAVA, I like java, but I don't like java??? skript???.    hello hello, ,         hello. " +
                "I study java in the 2021 year.";
        System.out.println(TextEditorUtils.getMapOfNumberDifferentWordsInText(string));

        List<String> stringList = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(stringList);
        System.out.println(TextEditorUtils.markLength4(stringList));
    }
}
