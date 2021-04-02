package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Void> test() {
        log.info("test!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
