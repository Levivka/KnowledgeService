package com.example.charlists.Services;

import com.example.charlists.Model.Character.Dto.SpellDto;
import com.example.charlists.Model.Character.Spells;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpellsService {
    List<Spells> getAllSpells();
    Spells getSpellById(String id);
    List<Spells> getSpellsByLevel(int level);
    Spells searchSpellsByName(String name);
    Spells createSpell(SpellDto spellDto);
}
