package pr3;

import java.util.Objects;
import java.util.Scanner;

public class Doctor {

    public static String problem(int n) {
        if (n == 1)
            return "голова";
        else if (n == 2)
            return "грудь";
        else if (n == 3)
            return "горло";
        else return "Ошибка";
    }

    public static String chestAche(String s1, String s2, String s3) {
        return "";
    }

    public static String throatAche(String s1, String s2, String s3, String s4, String s5) {
        return "";
    }

    public static String headAche(String s1, String s2, String s3, String s4) {
        Scanner in = new Scanner(System.in);
        System.out.println("Температура выше 37.8?(да/нет)");
        if (s1.equals(""))
            s1 = in.nextLine();
        if (Objects.equals(s1, "да"))
            return "Сходите к терапевту";
        else if (Objects.equals(s1, "нет")) {
            System.out.println("Были ли травмы головы недавно?(да/нет)");
            if (s2.equals(""))
                s2 = in.nextLine();
            if (Objects.equals(s2, "да"))
                return "Сходите в травмпункт";
            else if (Objects.equals(s2, "нет")) {
                System.out.println("Головокружение есть?(да/нет)");
                if (s3.equals(""))
                    s3 = in.nextLine();
                if (Objects.equals(s3, "да"))
                    return "Сходите на МРТ";
                else if (Objects.equals(s3, "нет")) {
                    System.out.println("Давление повышено?(да/нет)");
                    if (s4.equals(""))
                        s4 = in.nextLine();
                    if (Objects.equals(s4, "да"))
                        return "Выпейте коньячку";
                    else if (s4.equals("нет"))
                        return "Симулянт";
                }
            }
        }
        return "Ошибка";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Что у вас болит(1.голова, 2.грудь или 3.горло)?");
        int n = in.nextInt();
        String problem = problem(n);
        switch (problem) {
            case "голова" -> System.out.println(headAche("", "", "", ""));
            case "грудь" -> System.out.println(chestAche("", "", ""));
            case "горло" -> System.out.println(throatAche("", "", "", "", ""));
        }
    }
}
