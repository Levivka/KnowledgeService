package com.example.charlists.Controllers;

import com.example.charlists.Model.User;
import com.example.charlists.Services.CharlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/charlist")
public class CharlistController {
    private final CharlistService charlistService;

    @GetMapping()
    private ResponseEntity<?> GetAllCharlistsByUser(@RequestBody String email) {
        return charlistService.getCharlistByUserEmail(email);
    }
}
