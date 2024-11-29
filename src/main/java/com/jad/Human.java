package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private final String name;
    private List<Organ> organs = new ArrayList<>();
    private List<Clothe> clothes = new ArrayList<>();
    private List<Organ> transplants = new ArrayList<>();

    public Human(final String name) {
        this.name = name;
        this.organs.add(new Heart());
    }

    public String getName() {
        return this.name;
    }

    public void wear(final Clothe clothe) {
        this.clothes.add(clothe);
    }

    public void transplant(final Organ organ) {
        this.collectOrgan(organ.getName());
        this.transplants.add(organ);
    }

    public Organ collectOrgan(final String name) {
        for (Organ organ : this.organs) {
            if (organ.getName().equals(name)) {
                this.organs.remove(organ);
                return organ;
            }
        }
        return null;
    }
}
