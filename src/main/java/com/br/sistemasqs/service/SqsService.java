package com.br.sistemasqs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SqsService {

    @Value("${aws.queue-url}")
    private String queueUrl;

    @SqsListener(value = "${aws.queue-url}" ,deletionPolicy = SqsMessageDeletionPolicy.NO_REDRIVE)
    public void receiveMessage(@Payload String message) {
        System.err.println("Mensagem recebida: " + message);
    }
}
