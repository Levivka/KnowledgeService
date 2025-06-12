package com.example.charlists.Services;


import com.example.charlists.Model.Character.Equipment.EquipmentKnowledge;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipmentKnowledgeService {
    EquipmentKnowledge create(EquipmentKnowledge equipment, String userId);
    List<EquipmentKnowledge> findAll();
    List<EquipmentKnowledge> findByCategory(String category);
    EquipmentKnowledge findById(String id);
    EquipmentKnowledge update(String id, EquipmentKnowledge updatedEquipment);
    void delete(String id);
}
