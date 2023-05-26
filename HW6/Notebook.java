package HW6;

public class Notebook {

    public String name;
    public int ram;
    public int memory;
    public String os;
    public String color;

    public Notebook(String name, int ram, int memory, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s(%d GB / %d GB / %s / %s)\n", name, ram, memory, os, color);
    }
}