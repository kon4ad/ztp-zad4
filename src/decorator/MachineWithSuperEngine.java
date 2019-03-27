package decorator;

import decorator.Machine;
import decorator.MachineDecorator;
import prototype.builder.Item;

public class MachineWithSuperEngine extends MachineDecorator {
    public MachineWithSuperEngine(Machine m) {
        super(m);
    }

    public void start() {
        super.start();
        this.startEngines();
    }

    public void startEngines(){
        System.out.println("Engines started");
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
