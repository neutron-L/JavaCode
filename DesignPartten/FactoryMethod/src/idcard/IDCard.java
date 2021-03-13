package idcard;

import framework.*;

public class IDCard extends Product{
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println("make " + owner + "(" + serial +")" +  "`s ID card");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
     System.out.println("use " + owner + "`s ID card");
    }

    public String getOwner() { return owner; }

    public int getSerial() {
        return serial;
    }
}
