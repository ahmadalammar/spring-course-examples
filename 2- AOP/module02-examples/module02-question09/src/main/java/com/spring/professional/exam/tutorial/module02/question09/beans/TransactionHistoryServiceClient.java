package com.spring.professional.exam.tutorial.module02.question09.beans;

import com.spring.professional.exam.tutorial.module02.question09.annotation.Sanitize;
import org.springframework.stereotype.Component;

@Component
public class TransactionHistoryServiceClient {
    public void saveTransactionData(String identifier,@Sanitize String cvv,  String message) {
        System.out.println(
                String.format(
                        "Sending data, transferId = [%s], raw_response= [ CVV=[%s] , message =%s ]",
                        identifier, cvv, message
                )
        );
    }
}
