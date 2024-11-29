package com.jad;

public class Main {
    public static void main(String[] args) {
        Human jad = new Human("Jad");
        jad.wear(new Shirt());

        Human coco = new Human("Coco");
        coco.transplant(jad.collectOrgan("Coeur"));
    }
}