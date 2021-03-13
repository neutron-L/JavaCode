package game;

import java.util.*;

public class Gamer {
    private int money;
    private List fruits = new ArrayList<>();
    private Random random = new Random();


    private static final String[] fruitsname = {
            "apple", "grape", "banana", "orange"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("money increasing...");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("money decreasing...");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("get fruit(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("nothing has happened");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (Object fruit : fruits) {
            String f = (String) fruit;
            if (f.startsWith("tasty ")) {
                m.addFruit(f);
            }
        }

        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "tasty ";
        }

        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

}
