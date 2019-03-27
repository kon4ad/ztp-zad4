package decorator;

import decorator.Machine;
import prototype.builder.Item;

abstract class MachineDecorator implements Machine {

    private Machine m1;

    public MachineDecorator(Machine m){
        this.m1 = m;
    }

    @Override
    public void start() {
        m1.start();
    }

    @Override
    public Item createItem(){
        return m1.createItem();
    }
}
