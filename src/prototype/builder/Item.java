package prototype.builder;

import java.math.BigDecimal;

public class Item {
    private long id;
    private String name;
    private String desc;
    private String factoryName;
    private String companyName;
    private int specialCompanyId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSpecialCompanyId() {
        return specialCompanyId;
    }

    public void setSpecialCompanyId(int specialCompanyId) {
        this.specialCompanyId = specialCompanyId;
    }

    @Override
    public String toString() {
        return "prototype.builder.Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", specialCompanyId=" + specialCompanyId +
                '}';
    }
}
