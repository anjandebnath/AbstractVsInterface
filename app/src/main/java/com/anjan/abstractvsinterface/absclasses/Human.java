package com.anjan.abstractvsinterface.absclasses;

import com.anjan.abstractvsinterface.interfaces.ICallback;
import com.anjan.abstractvsinterface.interfaces.ICharacter;

/**
 * Created by Anjan Debnath on 8/3/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public abstract class Human implements ICharacter{
    private String name;
    private double health = 100.0;
    private long experience = 0;
    private int attackPower = 1;
    private Pet pet;
    ICallback callback;

    public Human(String name, ICallback callback) {
        this.name = name;
        this.callback = callback;
        gainExperience(1);
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.printf("%s: I have a new pet. Hi %s!\n",
                name, pet.getName());
        callback.humanCallback(name+ " I have a new pet. Hi "+pet.getName()+"\n");
    }

    public abstract void attack(ICharacter opponent);
    public abstract void defend();
    public abstract void jump();
    public abstract int heal();

    public String getName() {
        return name;
    }

    public double getHealth(){
        return health;
    }

    public long getExperience(){
        return experience;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public Pet getPet() {return pet;}

    public long gainExperience(long experience){
        this.experience += experience;
        return experience;
    }

    public double heal(double additionalHealth) {
        health += additionalHealth;
        return health;
    }

    public double decreaseHealth(int opponentAttackPower) {
        health -= opponentAttackPower;
        System.out.println(name + ": I've been hit. My health now = " + health);
        callback.humanCallback(name + ": I've been hit. My health now = " + health);
        return health;
    }

    public boolean hasPet() {
        return pet != null;
    }
}
