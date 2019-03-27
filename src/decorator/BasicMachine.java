package decorator;

import prototype.builder.Item;
import prototype.builder.ItemBuilder;

public class BasicMachine implements Machine {

    private int machineId;
    private String name;

    public BasicMachine() {
        this.machineId = 10;
        this.name = "BASIC_MACHINE";
    }

    @Override
    public void start() {
        System.out.println(this.name + " started");
    }

    @Override
    public Item createItem() {
        return new ItemBuilder().basicInitItem().setItemName("abc").setItemDescription("fdsfds").setSpecialId(machineId).build();
    }

    @Override
    public void stop() {
        System.out.println("Maszyna zatrzymana");
    }
}
