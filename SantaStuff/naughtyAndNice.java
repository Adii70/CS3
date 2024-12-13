package SantaStuff;

import java.util.ArrayList;
import java.util.HashMap;

public class naughtyAndNice {
    HashMap<child,ArrayList<String>> niceMap = new HashMap<child,ArrayList<String>>();
    HashMap <child,ArrayList<String>> naughtyMap = new HashMap<child,ArrayList<String>>();

    public void putNice(child c, String s){
        if (!niceMap.containsKey(c)){
           niceMap.put(c,new ArrayList<String>());
           niceMap.get(c).add(s);
        }
        else {
            niceMap.get(c).add(s);

        }
    }
    public void putNaughty(child c, String s){
        if (!naughtyMap.containsKey(c)){
            naughtyMap.put(c,new ArrayList<String>());
            naughtyMap.get(c).add(s);
        }
        else {
            naughtyMap.get(c).add(s);

        }
    }
    public int getNumberOfNice(child c){
        int count = niceMap.get(c).size();
        return count;
    }
    public int getNumberOfNaughty(child c){
        int count = naughtyMap.get(c).size();
        return count;
    }
}
