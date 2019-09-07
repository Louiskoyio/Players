package models;

import java.util.ArrayList;

public class Hero {


    // name, age, special power and weakness
    private int id;
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private int squadId;
    private static ArrayList<Hero> instances = new ArrayList<>();


    public Hero( String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.squadId = 0;
        instances.add(this);
        this.id = instances.size();

    }


    public int getSquadId() { return squadId; }

    public static ArrayList<Hero> getAll() { return instances; }

    public int getId() { return id; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public String getSpecialPower() { return specialPower; }

    public String getWeakness() { return weakness; }

    public static void clearAllHeroes(){
        instances.clear();
    }
}
