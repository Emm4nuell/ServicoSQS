package com.br.sistemasqs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SqsController implements IApiController{

//    private final SqsService s;

    @Override
    public ResponseEntity<String> post() {
//        s.send("Recebendo um SNS para o SQS");
        return ResponseEntity.status(HttpStatus.OK).body("Publicado com sucesso!");
    }
}
