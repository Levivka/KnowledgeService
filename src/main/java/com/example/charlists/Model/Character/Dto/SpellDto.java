package com.example.charlists.Model.Character.Dto;

import com.example.charlists.Model.Character.Damage;
import com.example.charlists.Model.Character.Modifiers.SavingThrows;
import lombok.Data;

import java.util.List;

@Data
public class SpellDto {
    private String name;
    private int level;
    private String castingTime;
    private List<String> components;
    private String duration;
    private List<String> desc;
    private String range;
    private boolean ritual;
    private boolean concentration;
    private Damage damage;
    private String savingThrows;
}
