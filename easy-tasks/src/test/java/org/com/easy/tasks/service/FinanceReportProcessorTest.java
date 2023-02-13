package org.com.easy.tasks.service;

import org.com.easy.tasks.entity.Date;
import org.com.easy.tasks.entity.FinanceReport;
import org.com.easy.tasks.entity.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportProcessorTest {

    private FinanceReport financeReport;

    @BeforeEach
    void setUp() {
        Payment payment1 = new Payment("Ivanov Ivan Ivanovich", new Date(1, 1, 2001), 999);
        Payment payment2 = new Payment("Antonov Anton Antonovich", new Date(19, 7, 1997), 1_000_000);
        List<Payment> paymentList = List.of(payment1, payment2);
        financeReport = new FinanceReport("Polinova Polina Polinovna", new Date(5, 7, 1998), paymentList);

    }

    @Test
    void getAllPaymentByFirstCharInName() {
        char filterChar = 'A';
        List<Payment> expectedList = new ArrayList<>();
        for (Payment payment : financeReport.getPaymentList()) {
            if (payment.getFullName().split(" ")[1].charAt(0) == filterChar) {
                expectedList.add(payment);
            }
        }
        List<Payment> actualList = FinanceReportProcessor.getAllPaymentByFirstCharInName(financeReport, filterChar).getPaymentList();
        assertEquals(actualList.size(), expectedList.size());
    }

    @Test
    void getAllByValue() {
        int filterValue = 1000;
        List<Payment> expectedList = new ArrayList<>();
        for (Payment payment : financeReport.getPaymentList()) {
            if (payment.getValue() < filterValue) {
                expectedList.add(payment);
            }
        }
        List<Payment> actualList = FinanceReportProcessor.getAllByValue(financeReport, filterValue).getPaymentList();
        assertEquals(actualList.size(), expectedList.size());
    }
}