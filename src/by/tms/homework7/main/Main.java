package by.tms.homework7.main;

import by.tms.homework7.solutions.FileAnalizeUtil;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File textFile = new File("resources" + File.separator + "poem.txt");
        File countLettersInFile = new File("resources" + File.separator + "countLetters.txt");
        File numbersFile = new File("resources" + File.separator + "numbers.txt");
        File sortedNumbersFile = new File("resources" + File.separator + "sortedNumbers.txt");
        String text = "Подруга дней моих суровых,\nГолубка дряхлая моя!\nОдна в глуши лесов сосновых\nДавно, давно ты ждешь меня.\n" +
                "Ты под окном своей светлицы\nГорюешь, будто на часах,\nИ медлят поминутно спицы\nВ твоих наморщенных руках.\n" +
                "Глядишь в забытые вороты\nНа черный отдаленный путь:\nТоска, предчувствия, заботы\nТеснят твою всечасно грудь.\nТо чудится тебе…";
        FileAnalizeUtil.writeTextInFile(textFile, text);
        FileAnalizeUtil.writeInFileNumberOfRepeatedLettersInText(textFile, countLettersInFile);
        FileAnalizeUtil.writeNumbersInFile(numbersFile);
        FileAnalizeUtil.writeSortedNumbersInFile(numbersFile, sortedNumbersFile);
    }
}
