package com.example.charlists.Repository;


import com.example.charlists.Model.Character.Equipment.EquipmentKnowledge;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipmentKnowledgeRepository extends MongoRepository<EquipmentKnowledge, String> {
    @Query("{ 'category': ?0 }")
    List<EquipmentKnowledge> findByCategory(String category);

    @Query("{ 'name': ?0, 'category': ?1 }")
    Optional<EquipmentKnowledge> findByNameAndCategory(String name, String category);
}
