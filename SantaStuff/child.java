package SantaStuff;

public class child {
    naughtyAndNice bob = new naughtyAndNice();
    private int age;
    private String name;
    private String address;
    private boolean niceLvl;

    public child (){

    }
    public child (int a, String s, String ad){
        age = a;
        name = s;
        address = ad;
        niceLvl = false;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void determineNiceLvl(){
        int niceCount = bob.getNumberOfNice(this);
        int naughtyCount = bob.getNumberOfNaughty(this);

        if (niceCount > naughtyCount){
            niceLvl = true;
        }
        if (naughtyCount > niceCount){
            niceLvl = false;
        }
        if (naughtyCount == niceCount){
            niceLvl = false;
        }

    }
    public String toString(){
        String choice;
        if (niceLvl == true){
            choice = "1";
        }
        else {
            choice = "0";
        }
        return "Name : " + getName() + ", Age : " + getAge() + ", Nice level : " + choice + ", Address : " + getAddress();
    }
}
