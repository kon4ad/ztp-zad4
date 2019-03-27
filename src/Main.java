import decorator.BasicMachine;
import decorator.MachineWithFeeder;
import decorator.MachineWithSuperEngine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //prototype.builder.Item i = new prototype.builder.ItemBuilder().basicInitItem().setItemName("Czesc").setItemDescription("sdf").build();
        //prototype.builder.Item i2 = new prototype.builder.ItemBuilder().basicInitItem().setItemName("Czesc").setItemDescription("sdf").build();
        //System.out.println(i + " " + i2);

        //new MachineWithFeeder(new MachineWithSuperEngine(new BasicMachine())).start();
        MainOperator mo = new MainOperator();
        mo.startAllAndProduce();

        mo.stopAll();
    }
}
