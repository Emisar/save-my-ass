package org.com.easy.tasks.service;

import org.com.easy.tasks.exception.IncorrectInputException;

public class StringProcessor {

    /**
     * 1. На входе строка s и целое число N.
     * Выход — строка, состоящая из N копий строки s,  записанных подряд.
     * При N = 0 результат — пустая строка.
     * При N < 0 выбрасывается  исключение.
     */
    public String repeat(String s, Integer n) {
        return s.repeat(n);
    }

    /**
     * 2. На входе две строки.
     * Результат — количество вхождений второй строки в первую.
     * Если вторая строка пустая или null, выбросить исключение.
     */
    public int count(String string, String substring) throws IncorrectInputException {
        if (substring == null || "".equals(substring))
            throw new IncorrectInputException("Substring is empty or null");
        return (string.length() - string.replace(substring, "").length()) / substring.length();
    }

    /**
     * 3. Постройте по строке новую строку, которая получена из исходной заменой каждого  символа '1' на подстроку "один”,
     * символа ‘2’ на подстроку “два” и символа ‘3’ на  подстроку “три”.
     */
    public String replaceByNumber(String string) {
        return string
                .replace("1", "один")
                .replace("2", "два")
                .replace("3", "три");
    }

    /**
     * 4. В строке типа StringBuilder удалите каждый второй по счету символ.
     * Должна быть  модифицирована входная строка, а не порождена новая.
     */
    public StringBuilder deleteEachSecond(StringBuilder stringBuilder) {
        int length = stringBuilder.length();
        int startIndex;
        if (length % 2 == 0) {
            startIndex = length - 1;
        } else {
            startIndex = length - 2;
        }
        for (int i = startIndex; i >= 1; i-=2) {
            stringBuilder.deleteCharAt(i);
        }
        return stringBuilder;
    }
}
