package Java_Core_Treuglov_Black_Belt.Lesson_String;

public class For_String_Lesson {
    String e_mail;

    public For_String_Lesson(String s) {
        this.e_mail = s;
    }

    public static void main(String[] args) {

        For_String_Lesson s1 = new For_String_Lesson("rg915i@yandex.ru; anahatasaha@gmail.ru;");
        //String t = s1.e_mail.toUpperCase();
        //System.out.println(t);
        s1.lish_nah();
        System.out.println();
        s1.with_while();

    }

    public void lish_nah() {
        String st = this.e_mail;
        String ulow_string_for_test = this.e_mail.toLowerCase();
        String result = "Empty";
        int first = 0;
        int second = 0;
        char test;
        char low_test;

        for (int i = 0; i < st.length(); i++) {

            test = st.charAt(i);
            low_test = ulow_string_for_test.charAt(i);

            if (test != low_test) {
                System.out.println("Обнаружена заглавная буква!");
                System.out.println("Скорректируйте адрес почты!");
                break;
            }
            if (test == '@') first = i + 1;
            if (test == '.') {
                second = i;
                result = st.substring(first, second);
                System.out.println(result);
            }

        }
        if ((first == 0) || (second == 0)) {
            System.out.println("Адресс введен некоректно");
        }
    }

    public void with_while() {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < this.e_mail.length() - 1) {
            a = this.e_mail.indexOf('@', c);
            b = this.e_mail.indexOf('.', c);
            c = this.e_mail.indexOf(';', c + 1);
            String out = this.e_mail.substring(a + 1, b);
            System.out.println(out);

        }

    }
}
