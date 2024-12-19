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
    public int getNumberOfNice(child c) {
        int count = 0;
        if (!niceMap.get(c).isEmpty()) {
            count = niceMap.get(c).size();
        }

        return count;
    }
    public int getNumberOfNaughty(child c){
        int count = 0;
        if (!naughtyMap.get(c).isEmpty()){
            count = naughtyMap.get(c).size();
        }
        return count;
    }
    public void determineNiceLvl(child c){
        if (getNumberOfNice(c)> getNumberOfNaughty(c)){
            c.setNiceLvl(getNumberOfNice(c) - getNumberOfNaughty(c));
        }
        if (getNumberOfNaughty(c) > getNumberOfNice(c)){
            c.setNiceLvl(getNumberOfNice(c) - getNumberOfNaughty(c));
        }
        if (getNumberOfNice(c) == getNumberOfNaughty(c)){
            c.setNiceLvl(getNumberOfNice(c) - getNumberOfNaughty(c));
        }
    }
    public String print(child c){
        String niceOutput = "";
        for (int x = 0; x < niceMap.get(c).size(); x++){
            niceOutput += niceMap.get(c).get(x) + " ";
        }
        String naughtyOutput = "";
        for (int x = 0; x < naughtyMap.get(c).size(); x++){
            naughtyOutput += naughtyMap.get(c).get(x) + " ";
        }
        return "Nice List: " + "\n" + c + niceOutput + "\n" + "Naughty List: " + "\n" + c + naughtyOutput;
    }
}
