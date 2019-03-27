import decorator.Machine;
import prototype.builder.Item;

public interface MachineState {
    public Machine startMachine(int number, int advOfMachine);
    public void stopMachine(Machine machine);
    public Item createItem(Machine machine);
}
