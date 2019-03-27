import decorator.Machine;
import prototype.builder.Item;

public class MainOperator {
    private MachineState ms;
    private Machine machine;
    public MainOperator() {
        this.ms = new MachineOperatorOFF();
    }

    public void startAllAndProduce() {
        machine = this.ms.startMachine(1,3);
        machine.start();
        this.ms = new MachineOperatorON();
        Item item= machine.createItem();
        System.out.println(item);
    }

    public void stopAll() {
        this.machine.stop();
        this.ms = new MachineOperatorON();
    }
}
