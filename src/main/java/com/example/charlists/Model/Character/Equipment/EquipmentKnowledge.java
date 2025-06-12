package com.example.charlists.Model.Character.Equipment;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
public class EquipmentKnowledge {
    @Id
    private String id;
    private String name;
    private String stat;
    private String statType;
    private Double weight;
    private String description;
    private Integer cost;
    private String rarity;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;
    private String createdBy;
}

