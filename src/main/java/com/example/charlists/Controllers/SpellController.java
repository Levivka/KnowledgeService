package com.example.charlists.Controllers;

import com.example.charlists.Model.Character.Dto.SpellDto;
import com.example.charlists.Model.Character.Spells;
import com.example.charlists.Services.SpellsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spells")
@RequiredArgsConstructor
public class SpellController {
    @Qualifier("spellsService")
    private final SpellsService spellService;

    @GetMapping
    public ResponseEntity<?> getAllSpells() {
        return ResponseEntity.ok(spellService.getAllSpells());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpellById(@PathVariable String id) {
        return ResponseEntity.ok(spellService.getSpellById(id));
    }

    @GetMapping("/level/{level}")
    public ResponseEntity<?> getSpellsByLevel(@PathVariable int level) {
        return ResponseEntity.ok(spellService.getSpellsByLevel(level));
    }

    @GetMapping("/search")
    public ResponseEntity<Spells> searchSpellsByName(@RequestParam String name) {
        return ResponseEntity.ok(spellService.searchSpellsByName(name));
    }

    @PostMapping
    public ResponseEntity<Spells> createSpell(@RequestBody SpellDto spellDto) {
        return ResponseEntity.ok(spellService.createSpell(spellDto));
    }
}
