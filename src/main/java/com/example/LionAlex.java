package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex() throws Exception {
        super("Самец",new Feline());
    }

    public List<String> getFriends() throws Exception {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
