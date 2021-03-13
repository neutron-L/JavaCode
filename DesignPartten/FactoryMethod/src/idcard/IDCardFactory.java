package idcard;

import com.sun.xml.internal.bind.v2.model.core.ID;
import framework.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    protected List<String> owners = new ArrayList<String>();
    protected Map<Integer, String> record = new HashMap<>();
    private int serial = 1;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard)product;
        record.put(idCard.getSerial(), idCard.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
