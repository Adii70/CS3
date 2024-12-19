package SantaStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String args[]) {
        ArrayList<child> childList= new ArrayList<child>();
        child bob = new child(3, "bob", "121 main street");
        child jeff = new child(4, "jeff", "222 street");
        child vincent = new child(75, "vincent", "5625 Sigma drive");
        child gulin = new child(172, "gulin", "cedar park high school");
        child Dustin = new child(1, "dustin", "mars");
        child Adnan = new child(0, "Adnan ", "56 alpha lane ");
        child nick = new child(7, "nick ", "toliet");
        child Rajarshi = new child(99, "Rajarshi", "22222 oh street");
        child dog = new child(10, "dog", "99 ranch");
        child rawr = new child(22, "rawr", "bark blvd");
        toys stuff = new toys();
        naughtyAndNice thing = new naughtyAndNice();
        route theRoute = new route();
        Scanner key = new Scanner(System.in);
        childList.add(bob);
        childList.add(jeff);
        childList.add(vincent);
        childList.add(gulin);
        childList.add(Dustin);
        childList.add(Adnan);
        childList.add(nick);
        childList.add(Rajarshi);
        childList.add(dog );
        childList.add(rawr);

        for (int x = 0; x < childList.size(); x++){
            stuff.putChild(childList.get(x));
        }
        for (int x = 0; x < childList.size(); x++){
            theRoute.addChild(childList.get(x));
        }
        for (int x = 0; x < childList.size(); x++){
            thing.putNice(childList.get(x), "base");
            thing.putNaughty(childList.get(x), "base");
        }



        int choice = 0;

            while (choice != 8) {
                System.out.println("1: print list of children");
                System.out.println("2: put nice action");
                System.out.println("3: put naughty action");
                System.out.println("4: update naughty or nice");
                System.out.println("5: santa route ");
                System.out.println("8: exit");

                choice = key.nextInt();

                if (choice == 1) {
                    System.out.println("List of Children" + "/n" + bob + jeff + vincent + gulin + Dustin + Adnan + nick + Rajarshi + dog + rawr);
                }

                if (choice == 2){
                    System.out.println("Enter the child number : ");
                    child temp = childList.get(key.nextInt());
                    System.out.println("Enter the nice action");
                    String action = key.next();
                    thing.putNice(temp,action);
                }
                if (choice == 3){
                    System.out.println("Enter the child number : ");
                    child temp = childList.get(key.nextInt());
                    System.out.println("Enter the naughty action");
                    String action = key.next();
                    thing.putNaughty(temp,action);
                }
                if (choice == 4){
                    System.out.println("Which child do you want to update?");
                    child temp = childList.get(key.nextInt());
                    thing.determineNiceLvl(temp);
                    stuff.determine(temp);
                }
                if (choice == 5){
                    for (int x = 0; x < childList.size(); x++){
                        stuff.showAll(childList.get(x));
                    }
                }
            }
        }

    }

