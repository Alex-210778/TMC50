package by.tms.homework7.solutions;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public final class FileAnalizeUtil {

    private FileAnalizeUtil() {
        throw new UnsupportedOperationException();
    }

    public static void writeTextInFile(File file, String text) {
        if (Objects.nonNull(text)) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Вы не ввели текст");
        }
    }

    public static void writeInFileNumberOfRepeatedLettersInText(File textFile, File countLettersFile) {
        if (Objects.nonNull(textFile) && textFile.isFile()) {
            String text = getStringFromTextFile(textFile).toLowerCase().replaceAll("[^а-я]", "");
            char[] alphabet = getAlphabet();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(countLettersFile))) {
                for (int i = 0; i < alphabet.length; i++) {
                    int tempLength = text.length();
                    String ch = String.valueOf(alphabet[i]);
                    text = text.replaceAll(ch, "");
                    int countLetter = tempLength - text.length();
                    if (countLetter != 0) {
                        writer.write(ch + " - " + countLetter + '\n');
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeNumbersInFile(File file) {
        int[] numbers = new int[(int) ((Math.random() * 100) + 1)];
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 100);
                writer.write(numbers[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeSortedNumbersInFile(File numbersFile, File sortedNumbersFile) {
        if(Objects.nonNull(numbersFile) && numbersFile.isFile()) {
            int[] sortedNumbers = getArrayOfSortedNumbers(numbersFile);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(sortedNumbersFile))) {
                for (int i = 0; i < sortedNumbers.length; i++) {
                    writer.write(sortedNumbers[i] + " ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getStringFromTextFile(File file) {
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

    private static char[] getAlphabet() {
        int numberLettersInAlphabet = 33;
        char[] alphabet = new char[numberLettersInAlphabet + 1];
        char letter = 'а';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = letter;
            letter++;
        }
        return alphabet;
    }

    private static int[] getArrayOfNumbers(File file) {
        if (Objects.nonNull(file) && file.isFile()) {
            String[] arrayStrings = FileAnalizeUtil.getStringFromTextFile(file).split(" ");
            int[] numbers = new int[arrayStrings.length];
            for (int i = 0; i < arrayStrings.length; i++) {
                numbers[i] = Integer.parseInt(arrayStrings[i]);
            }
            return numbers;
        } else {
            return new int[0];
        }
    }

    private static int[] getArrayOfSortedNumbers(File file) {
        int[] sortedArrayOfNumbers = getArrayOfNumbers(file);
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < sortedArrayOfNumbers.length - 1; i++) {
                if (sortedArrayOfNumbers[i] > sortedArrayOfNumbers[i + 1]) {
                    temp = sortedArrayOfNumbers[i];
                    sortedArrayOfNumbers[i] = sortedArrayOfNumbers[i + 1];
                    sortedArrayOfNumbers[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return sortedArrayOfNumbers;
    }
}
