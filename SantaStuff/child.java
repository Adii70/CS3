package SantaStuff;

public class child {

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
    public void setNiceLvl(boolean choice){
        niceLvl = choice;
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
    public boolean getNiceLvl(){
        return niceLvl;
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
