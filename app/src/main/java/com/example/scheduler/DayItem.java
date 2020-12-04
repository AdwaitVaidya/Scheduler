package com.example.scheduler;

import android.graphics.Color;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DayItem {
    LocalDateTime itemDateTime;
    String titleText;
    List<String> objectivesText = new ArrayList<>();
    Color color;

    public DayItem(LocalDateTime itemDateTime, String text, Color color) {
        this.itemDateTime = itemDateTime;
        this.titleText = text;
        this.color = color;
    }

    public void addObjective(String string){
        objectivesText.add(string);
    }

    public void addPriority(Color color){
        this.color = color;
    }

}
