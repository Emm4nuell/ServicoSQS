package com.br.sistemasqs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sqs/")
public interface IApiController {

    @PostMapping("post")
    ResponseEntity<String> post();
}
