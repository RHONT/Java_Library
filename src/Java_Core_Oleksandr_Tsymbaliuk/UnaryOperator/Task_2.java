package Java_Core_Oleksandr_Tsymbaliuk.UnaryOperator;

import java.util.function.UnaryOperator;

/**
 * Создайте реализацию UnaryOperator<String> где результатом будет строка в которой
 * исключены все символы кроме цифровых. Т.е. если входящим параметром является
 * строка вида «Hello 123 world» результатом будет строка «123».
 */
public class Task_2 {
    public static void main(String[] args) {
        String str = "11gg11";

        UnaryOperator<String> onlyDigit = (a) -> {

            StringBuilder result = new StringBuilder();
            for (char c : a.toCharArray()) {
                result.append(Character.isDigit(c) ? c : "");
            }
            return String.valueOf(result);
        };
        System.out.println(onlyDigit.apply("Hello 123 world"));
        System.out.println(onlyDigit.apply(str));
        //   123

    }
}
