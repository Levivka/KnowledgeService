package com.example.charlists.Repository;

import com.example.charlists.Model.Character.Spells;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SpellRepository extends MongoRepository<Spells, String> {
    List<Spells> findByLevel(int level);
    Spells findByNameContainingIgnoreCase(String name);
}
