package decorator;

import prototype.builder.Item;

public interface Machine {
    void start();
    Item createItem();
    void stop();
}
