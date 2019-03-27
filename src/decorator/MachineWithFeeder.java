package decorator;

import decorator.Machine;
import decorator.MachineDecorator;
import prototype.builder.Item;

public class MachineWithFeeder extends MachineDecorator {
    public MachineWithFeeder(Machine m) {
        super(m);
    }

    public void start() {
        super.start();
        this.startFeeder();

    }

    public void startFeeder(){
        System.out.println("Start Feeder");
    }

    public Item createItem(){
        Item i = super.createItem();
        i.setSpecialCompanyId(123);
        return i;
    }

    @Override
    public void stop() {
        System.out.println("Maszyna zatrzymana!");
    }
}
