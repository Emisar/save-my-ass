package org.com.easy.tasks.service;

import org.com.easy.tasks.entity.FinanceReport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportProcessorTest {

    private FinanceReport financeReport;

    @BeforeEach
    void setUp() {
        financeReport = new FinanceReport();
    }

    @Test
    void getAllPaymentByFirstCharInName() {
        FinanceReport actual = FinanceReportProcessor.getAllPaymentByFirstCharInName(financeReport, 'a');
        assertFalse(false);
    }

    @Test
    void getAllByValue() {
        FinanceReport actual = FinanceReportProcessor.getAllByValue(financeReport, 1000);
        assertFalse(false);
    }
}