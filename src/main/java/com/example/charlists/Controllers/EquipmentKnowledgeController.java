package com.example.charlists.Controllers;

import com.example.charlists.Model.Character.Equipment.EquipmentKnowledge;
import com.example.charlists.Services.EquipmentKnowledgeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
@Slf4j
public class EquipmentKnowledgeController {
    private final EquipmentKnowledgeService equipmentKnowledgeService;

    @Autowired
    public EquipmentKnowledgeController(EquipmentKnowledgeService equipmentKnowledgeService) {
        this.equipmentKnowledgeService = equipmentKnowledgeService;
    }

    @PostMapping
    public ResponseEntity<EquipmentKnowledge> create(
            @RequestBody EquipmentKnowledge equipment,
            @RequestHeader("User") String userId
    ) {
        return ResponseEntity.ok(equipmentKnowledgeService.create(equipment, userId));
    }

    @GetMapping
    public ResponseEntity<List<EquipmentKnowledge>> findAll() {
        return ResponseEntity.ok(equipmentKnowledgeService.findAll());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<EquipmentKnowledge>> findByCategory(
            @PathVariable String category
    ) {
        return ResponseEntity.ok(equipmentKnowledgeService.findByCategory(category));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipmentKnowledge> findById(@PathVariable String id) {
        return ResponseEntity.ok(equipmentKnowledgeService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipmentKnowledge> update(
            @PathVariable String id,
            @RequestBody EquipmentKnowledge equipment
    ) {
        return ResponseEntity.ok(equipmentKnowledgeService.update(id, equipment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        equipmentKnowledgeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}