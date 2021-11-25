package by.tms.homework11;

public class RegExMain {

    public static void main(String[] args) {
        String email1 = "kkokokool@lklkll.com";
        String email2 = "kkokokool@lklkll.by";
        String email3 = "kko'?kokool@lklkll.com";
        String email4 = "25kkokokool@lklkll.com";
        String email5 = "kkokokool@lklkll.org";
        System.out.println(RegExUtils.isValidEmailAddress(email1));
        System.out.println(RegExUtils.isValidEmailAddress(email2));
        System.out.println(RegExUtils.isValidEmailAddress(email3));
        System.out.println(RegExUtils.isValidEmailAddress(email4));
        System.out.println(RegExUtils.isValidEmailAddress(email5));
        System.out.println("-------------------------------");
        String str = "klko5447740x4577CDP:Kjknjnj0XAS0XxXX0XA45DA4l,lkko";
        System.out.println("Все шеснадцатиричные числа в строке ");
        System.out.println(str);
        RegExUtils.findHexNumbers(str);
    }
}
