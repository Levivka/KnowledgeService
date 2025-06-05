package com.example.charlists.Services;

import com.example.charlists.Model.Character.Charlists;
import com.example.charlists.Model.Character.Dto.CharlistMainInfo;
import com.example.charlists.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CharlistService {
    ResponseEntity<?> getCharlistByUserEmail(String email);
    ResponseEntity<?> createCharlist(Charlists charlist, User user);
}
