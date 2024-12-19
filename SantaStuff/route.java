package SantaStuff;

import java.util.PriorityQueue;

public class route {
    private PriorityQueue<child> theQueue;
    toys stuff = new toys();

    public route(){
        theQueue = new PriorityQueue<child>();
    }
    public void addChild(child c){
        theQueue.add(c);
    }
    public String toString(){
        String output = "";
            output += theQueue.poll() +"\n";

        return  output;
    }
}
