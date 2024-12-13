package SantaStuff;

public class testing {
    public static void main(String args[]){
        child bob = new child(3,"bob","121 main street");
        naughtyAndNice x = new naughtyAndNice();
        System.out.println(bob);
        x.putNice(bob,"killed santa");
        x.putNice(bob,"yes");
        bob.determineNiceLvl();
        System.out.println(bob);
    }
}
