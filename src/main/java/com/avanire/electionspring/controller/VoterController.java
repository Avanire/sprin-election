package com.avanire.electionspring.controller;


import com.avanire.electionspring.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoterController {

    @RequestMapping("/registration")
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            return ResponseEntity.ok().body("Попали куда нужно");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }
}
