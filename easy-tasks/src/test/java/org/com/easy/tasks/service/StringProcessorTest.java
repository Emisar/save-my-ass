package org.com.easy.tasks.service;

import org.com.easy.tasks.exception.IncorrectInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    void repeat() {
        String inputString = "Test";
        int inputInt = 3;
        String expected = "TestTestTest";
        String actual = stringProcessor.repeat(inputString, inputInt);
        assertEquals(expected, actual);
    }

    @Test
    void count() throws IncorrectInputException {
        String inputString = "Автоматизированный авторобот";
        String inputSubstring = "ро";
        int expected = 2;
        int actual = stringProcessor.count(inputString, inputSubstring);
        assertEquals(expected, actual);
    }

    @Test
    void replaceByNumber() {
        String inputString = "Я хочу 1 рожок мороженого, 2 беляша и 3 кулебяки";
        String expected = "Я хочу один рожок мороженого, два беляша и три кулебяки";
        String actual = stringProcessor.replaceByNumber(inputString);
        assertEquals(expected, actual);
    }

    @Test
    void deleteEachSecond() {
        StringBuilder sb = new StringBuilder("Компьютер шумит");
        String expected = "Кмьтршмт";
        String actual = stringProcessor.deleteEachSecond(sb).toString();
        assertEquals(expected, actual);
    }
}