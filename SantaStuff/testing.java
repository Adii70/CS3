package SantaStuff;

public class testing {
    public static void main(String args[]){
        child bob = new child(3,"bob","121 main street");
        child jeff = new child(4,"jeff", "222 street");
        toys stuff = new toys();
        naughtyAndNice x = new naughtyAndNice();

        System.out.println(bob);
        System.out.println(jeff);

        x.putNice(bob,"killed santa");
        x.putNice(bob,"yes");
        x.putNaughty(bob,"no");
        x.putNice(jeff,"did good on a test");
        x.putNaughty(jeff,"failed a test");
        x.putNaughty(jeff, "talked bad to parents");
        stuff.putChild(bob);
        stuff.putChild(jeff);

        x.determineNiceLvl(bob);
        x.determineNiceLvl(jeff);
        stuff.determine(bob);
        stuff.determine(jeff);
        

        stuff.showAll(bob);
        stuff.showAll(jeff);
        System.out.println(bob);
        System.out.println(jeff);
    }
}
