import decorator.BasicMachine;
import decorator.Machine;
import decorator.MachineWithFeeder;
import decorator.MachineWithSuperEngine;
import prototype.builder.Item;

import java.util.List;

public class MachineOperatorOFF implements MachineState {


    private Machine[] myMachine = MachineRepo.mlist;
    public MachineOperatorOFF() {
    }

    public Machine startMachine(int number, int advOfmachine) {
        if(this.myMachine[number] instanceof Machine){
            return this.myMachine[number];
        }
            if(advOfmachine == 3){
                this.myMachine[number] = new MachineWithFeeder(new MachineWithSuperEngine(new BasicMachine()));
            }

            if(advOfmachine == 2){
                this.myMachine[number] = new MachineWithSuperEngine(new BasicMachine());
            }

            if(advOfmachine == 1) {
                this.myMachine[number] = new BasicMachine();
            }
        return this.myMachine[number];
    }

    @Override
    public void stopMachine(Machine machine) {
        System.out.println("Maszyna jest wylaczona");
    }


    public Item createItem(Machine machine){
        System.out.println("Maszyna jest wylaczona");
        return null;
    }

}
