package prototype.builder;

import prototype.builder.Item;
import prototype.builder.Prototype;

public class ItemPrototype implements Prototype<Item> {

    private String factoryName;
    private String companyName;
    private int specialId;

    public ItemPrototype() {
        this.factoryName = "Syconis";
        this.companyName = "IDO Enterprise Sp z.o.o";
        this.specialId = 23423451;
    }

    @Override
    public Item getPrototype() {
        Item i = new Item();
        i.setCompanyName(this.companyName);
        i.setFactoryName(this.factoryName);
        i.setSpecialCompanyId(this.specialId);
        return i;
    }
}
