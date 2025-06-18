package org.heao.demo.accounting_report_service.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld () {
        return ResponseEntity.ok("Hello World");
    }
}
