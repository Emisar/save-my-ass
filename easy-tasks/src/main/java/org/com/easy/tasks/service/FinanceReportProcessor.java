package org.com.easy.tasks.service;

import org.com.easy.tasks.entity.FinanceReport;
import org.com.easy.tasks.entity.Payment;

import java.util.ArrayList;
import java.util.List;

public class FinanceReportProcessor {

    private FinanceReportProcessor() {}

    public static FinanceReport getAllPaymentByFirstCharInName(FinanceReport report, char firstChar) {
        FinanceReport result = new FinanceReport(report);
        List<Payment> paymentList = result.getPaymentList();
        List<Payment> filterResultList = new ArrayList<>();
        for (Payment payment : paymentList) {
            String secondName = payment.getFullName().split(" ")[1];
            if (secondName.charAt(0) == firstChar) {
                filterResultList.add(payment);
            }
        }
        result.setPaymentList(filterResultList);
        return result;
    }

    public static FinanceReport getAllByValue(FinanceReport report, int value) {
        FinanceReport result = new FinanceReport(report);
        List<Payment> paymentList = result.getPaymentList();
        List<Payment> filterResultList = new ArrayList<>();
        for (Payment payment : paymentList) {
            int paymentValue = payment.getValue();
            if (paymentValue < value) {
                filterResultList.add(payment);
            }
        }
        result.setPaymentList(filterResultList);
        return result;
    }
}
