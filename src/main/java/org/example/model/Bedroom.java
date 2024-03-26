package org.example.model;

public class Bedroom extends Room {
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Carpet carpet, Bed bed, Lamp lamp, Wardrobe wardrobe) {
        super(name, wall1, wall2, wall3, wall4, ceiling, carpet);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", \nwall1=" + wall1 +
                ", \nwall2=" + wall2 +
                ", \nwall3=" + wall3 +
                ", \nwall4=" + wall4 +
                ", \nceiling=" + ceiling +
                ", \ncarpet=" + carpet +
                ", \nbed=" + bed +
                ", \nlamp=" + lamp +
                ", \nwardrobe=" + wardrobe +
                '}';
    }
}
