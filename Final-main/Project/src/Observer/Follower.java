package Observer;

import java.util.List;

public class Follower implements IObserver {
    private String name;
    private String surname;


    public Follower(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void handle(List<String> promotions) {
        System.out.println("Dear " + name + " " + surname + "!");
        System.out.println("We have special promotions for this month:");
        for (String promotion : promotions) {
            System.out.println("- " + promotion);
        }
    }
}

