import decorator.Machine;
import prototype.builder.Item;

public class MachineOperatorON implements MachineState {

    @Override
    public Machine startMachine(int number, int advOfMachine) {
        System.out.println("Maszyna jest juz wlaczona");
        return null;
    }

    @Override
    public void stopMachine(Machine machine) {
        machine.stop();
    }

    @Override
    public Item createItem(Machine machine) {
        return machine.createItem();
    }
}
