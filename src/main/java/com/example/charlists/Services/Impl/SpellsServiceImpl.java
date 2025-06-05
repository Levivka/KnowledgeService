package com.example.charlists.Services.Impl;

import com.example.charlists.Model.Character.Charlists;
import com.example.charlists.Model.Character.Dto.CharlistMainInfo;
import com.example.charlists.Model.Character.Dto.SpellDto;
import com.example.charlists.Model.Character.Spells;
import com.example.charlists.Model.User;
import com.example.charlists.Repository.SpellRepository;
import com.example.charlists.Services.CharlistService;
import com.example.charlists.Services.SpellsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpellsServiceImpl implements SpellsService {
    private final SpellRepository spellRepository;

    public List<Spells> getAllSpells() {
        return spellRepository.findAll();
    }

    public Spells getSpellById(String id) {
        return spellRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Spell not found with id: " + id));
    }

    public List<Spells> getSpellsByLevel(int level) {
        return spellRepository.findByLevel(level);
    }

    public Spells searchSpellsByName(String name) {
        return spellRepository.findByNameContainingIgnoreCase(name);
    }

    public Spells createSpell(SpellDto spellDto) {
        Spells spell = new Spells();
        mapDtoToSpell(spellDto, spell);
        return spellRepository.save(spell);
    }

    private void mapDtoToSpell(SpellDto dto, Spells spell) {
        spell.setName(dto.getName());
        spell.setLevel(dto.getLevel());
        spell.setCastingTime(dto.getCastingTime());
        spell.setComponents(dto.getComponents());
        spell.setDuration(dto.getDuration());
        spell.setDesc(dto.getDesc());
        spell.setRange(dto.getRange());
        spell.setRitual(dto.isRitual());
        spell.setConcentration(dto.isConcentration());
        spell.setDamage(dto.getDamage());
        spell.setSavingThrows(dto.getSavingThrows());
    }
}

