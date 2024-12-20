package SantaStuff;
// Name: Adnan Chowdhury
public class child implements Comparable <child>{

    private int age;
    private String name;
    private String address;
    private int niceLvl;

    public child (){

    }
    public child (int a, String s, String ad){
        age = a;
        name = s;
        address = ad;
        niceLvl = 0;
    }
    public void setNiceLvl(int choice){
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
    public int getNiceLvl(){
        return niceLvl;
    }
    public String toString(){

        return "Name : " + getName() + ", Age : " + getAge() + ", Nice level : " + niceLvl + ", Address : " + getAddress() ;
    }

    @Override
    public int compareTo(child o) {
        if (getNiceLvl() < o.getNiceLvl()){
            return 1;
        }
        if (getNiceLvl() > o.getNiceLvl()){
            return -1;
        }
        return 0;
    }
    }

