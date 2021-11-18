package by.tms.homework8.textutils;

import java.io.*;
import java.util.*;

public final class TextEditorUtils {

    private TextEditorUtils() {
        throw new UnsupportedOperationException();
    }

    public static Map<String, Integer> getMapOfNumberDifferentWordsInText(String text) {
        text = text.replaceAll("[?!.,:;\\d]", "");
        Map<String, Integer> mapOfNumbersWords = new HashMap<>();
        for (String word : text.split("\\s+")) {
            if (!mapOfNumbersWords.containsKey(word)) {
                mapOfNumbersWords.put(word, 1);
            } else {
                mapOfNumbersWords.put(word, mapOfNumbersWords.get(word) + 1);
            }
        }
        return mapOfNumbersWords;
    }

    public static String getStringFromTextFile(File file) {
        if (Objects.nonNull(file) && file.isFile()) {
            StringBuilder textFromFile = new StringBuilder("");
            try (BufferedReader reader = new BufferedReader(new FileReader(file));
                 Scanner scanner = new Scanner(reader)) {
                while (scanner.hasNext()) {
                    textFromFile.append(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return textFromFile.toString();
        } else {
            return "";
        }
    }

    public static List<String> markLength4(List<String> stringList) {
        int elementLenght = 4;
        String addSymbols = "****";
        for (int i = stringList.size() - 1; i >= 0 ; i--) {
            if (stringList.get(i).length() == elementLenght) {
                stringList.add(i, addSymbols);

            }
        }
        return stringList;
    }
}
