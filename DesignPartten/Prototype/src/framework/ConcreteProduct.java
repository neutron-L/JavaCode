package framework;

public abstract class ConcreteProduct implements Product{
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return p;
    }
}
