package com.anjan.abstractvsinterface.absclasses;

import com.anjan.abstractvsinterface.interfaces.ICallback;
import com.anjan.abstractvsinterface.interfaces.ICharacter;

/**
 * Created by Anjan Debnath on 8/3/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public abstract class Pet implements ICharacter{
    protected String name;
    protected double health = 100.0;
    protected long experience = 0;
    private int attackPower = 1;
    protected Human owner;
    ICallback callback;

    public Pet(String name, Human owner, ICallback callback) {
        this.callback = callback;
        this.name = name;
        this.owner = owner;
        this.owner.setPet(this);
        gainExperience(1);
    }

    public abstract void attack(ICharacter character);
    public abstract void defend();
    public abstract void jump();
    public abstract int heal();

    public Human getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public double getHealth(){
        return health;
    }

    public long getExperience(){
        return experience;
    }

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
        cry();
        System.out.println(getName() + ": Health now = " + getHealth());
        callback.petCallback(getName() + ": Health now = " + getHealth());
        return health;
    }

    protected abstract void cry();

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
