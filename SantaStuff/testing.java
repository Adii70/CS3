package SantaStuff;

import java.util.Scanner;

public class testing {
    public static void main(String args[]){
        child bob = new child(3,"bob","121 main street");
        child jeff = new child(4,"jeff", "222 street");
        child vincent = new child(75, "vincent", "323223232");
        toys stuff = new toys();
        naughtyAndNice x = new naughtyAndNice();
        route theRoute = new route();


        System.out.println(bob);
        System.out.println(jeff);
        System.out.println(vincent);

        x.putNice(bob,"killed santa");
        x.putNice(bob,"yes");
        x.putNaughty(bob,"no");
        x.putNice(jeff,"did good on a test");
        x.putNaughty(jeff,"failed a test");
        x.putNaughty(jeff, "talked bad to parents");
        x.putNice(vincent,"killed santa");
        x.putNice(vincent,"yes");
        x.putNice(vincent,"gg");
        x.putNaughty(vincent,"no");
        stuff.putChild(bob);
        stuff.putChild(jeff);
        stuff.putChild(vincent);
        theRoute.addChild(bob);
        theRoute.addChild(jeff);
        theRoute.addChild(vincent);

        x.determineNiceLvl(bob);
        x.determineNiceLvl(jeff);
        x.determineNiceLvl(vincent);
        stuff.determine(bob);
        stuff.determine(jeff);
        stuff.determine(vincent);

        stuff.showAll(bob);
        stuff.showAll(jeff);
        stuff.showAll(vincent);
        System.out.println(bob);
        System.out.println(jeff);
        System.out.println(vincent);
        System.out.println(theRoute);
        System.out.println(theRoute);
        System.out.println(theRoute);
    }
}
