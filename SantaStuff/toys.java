package SantaStuff;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

public class toys {
    Hashtable<child, Stack<String>> toys;


    public toys() {
        toys = new Hashtable<child, Stack<String>>();
    }

    public void putChild(child c) {
        if (!toys.containsKey(c)) {
            toys.put(c, new Stack<String>());
        }
    }

    public void determine(child c) {
        if (c.getNiceLvl() > 0) {
            if (toys.get(c).isEmpty() || !toys.get(c).peek().equals("Coal")) {
                toys.get(c).push("Toy");
            }
            if (toys.get(c).peek().equals("Coal")) {
                toys.get(c).pop();
            }
        }
        if (c.getNiceLvl() <= 0) {
            if (toys.get(c).isEmpty() || toys.get(c).peek().equals("Coal")) {
                toys.get(c).push("Coal");
            }
            if (toys.get(c).peek().equals("Toy")) {
                toys.get(c).pop();
            }
        }


    }

    public String showAll(child c) {
        String theToys = "";
        while (!toys.get(c).isEmpty()){
            theToys += toys.get(c).pop() + " " ;
        }
        return c.getName() + " : " + theToys;

    }
}

