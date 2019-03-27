package prototype.builder;

public class ItemBuilder {

    public static long ITEMID = 1;
    private Prototype<Item> protItem;
    private Item buildItem;

    public ItemBuilder() {
        this.protItem = new ItemPrototype();
        this.buildItem  = new Item();
    }

    public ItemBuilder basicInitItem() {
        this.buildItem = this.protItem.getPrototype();
        return this;
    }

    public ItemBuilder setItemName(String name){
        this.buildItem.setName(name);
        return this;
    }

    public ItemBuilder setItemDescription(String description){
        this.buildItem.setDesc(description);
        return this;
    }

    public ItemBuilder setFactoryName(String name){
        this.buildItem.setFactoryName(name);
        return this;
    }

    public ItemBuilder setCompanyName(String name){
        this.buildItem.setCompanyName(name);
        return this;
    }

    public ItemBuilder setSpecialId(int id){
        this.buildItem.setSpecialCompanyId(id);
        return this;
    }

    public Item build(){
        this.buildItem.setId(ItemBuilder.ITEMID++);
        return this.buildItem;
    }



}
