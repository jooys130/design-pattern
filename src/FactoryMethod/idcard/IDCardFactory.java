package FactoryMethod.idcard;
import FactoryMethod.framework.*;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
    private List owners = new ArrayList();

    public IDCardFactory() {
    }

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return this.owners;
    }
}
