package com.example.charlists.Services.Impl;


import com.example.charlists.Model.Character.Equipment.EquipmentKnowledge;
import com.example.charlists.Repository.EquipmentKnowledgeRepository;
import com.example.charlists.Services.EquipmentKnowledgeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor()
public class EquipmentKnowledgeServiceImpl implements EquipmentKnowledgeService {
    private final EquipmentKnowledgeRepository repository;

    public EquipmentKnowledge create(EquipmentKnowledge equipment, String userId) {
        equipment.setCreatedBy(userId);
        equipment.setCreatedAt(LocalDateTime.parse("2025-06-11T10:58:39"));
        equipment.setLastUpdated(LocalDateTime.parse("2025-06-11T10:58:39"));
        return repository.save(equipment);
    }

    public List<EquipmentKnowledge> findAll() {
        return repository.findAll();
    }

    public List<EquipmentKnowledge> findByCategory(String category) {
        return repository.findByCategory(category);
    }

    public EquipmentKnowledge findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));
    }

    public EquipmentKnowledge update(String id, EquipmentKnowledge updatedEquipment) {
        EquipmentKnowledge equipment = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));

        equipment.setName(updatedEquipment.getName());
        equipment.setStat(updatedEquipment.getStat());
        equipment.setStatType(updatedEquipment.getStatType());
        equipment.setWeight(updatedEquipment.getWeight());
        equipment.setDescription(updatedEquipment.getDescription());
        equipment.setCost(updatedEquipment.getCost());
        equipment.setRarity(updatedEquipment.getRarity());
        equipment.setCategory(updatedEquipment.getCategory());
        equipment.setLastUpdated(LocalDateTime.parse("2025-06-11T10:58:39"));

        return repository.save(equipment);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Equipment not found");
        }
        repository.deleteById(id);
    }
}