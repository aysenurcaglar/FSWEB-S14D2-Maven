package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("myBedroom",
                new Wall("north"),
                new Wall("south"),
                new Wall("east"),
                new Wall("west"),
                new Ceiling(300, PaintColor.WHITE),
                new Carpet(100, 100, PaintColor.RED),
                new Bed("minimalist", 4, 80, 3, 4),
                new Lamp(LampType.LAVA, true, 10),
                new Wardrobe(120, 200, 75.2));

        Bed bed = bedroom.getBed();
        Wall wall1 = bedroom.getWall1();
        Ceiling ceiling = bedroom.getCeiling();
        Carpet carpet = bedroom.getCarpet();
        Lamp lamp = bedroom.getLamp();
        Wardrobe wardrobe = bedroom.getWardrobe();

        bed.make();
        wall1.create();
        ceiling.create();
        carpet.lying();
        lamp.turnOn();
        wardrobe.add();

        System.out.println("_______________");
        System.out.println(bedroom.toString());


    }
}