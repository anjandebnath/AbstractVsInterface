package com.anjan.abstractvsinterface.conclasses;

import com.anjan.abstractvsinterface.absclasses.Human;
import com.anjan.abstractvsinterface.absclasses.Pet;
import com.anjan.abstractvsinterface.interfaces.ICallback;
import com.anjan.abstractvsinterface.interfaces.ICharacter;

import static com.anjan.abstractvsinterface.MainActivity.TAG;

/**
 * Created by Anjan Debnath on 8/3/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class Dog extends Pet implements ICharacter {

    ICallback icallback;

    public Dog(String name, Human owner, ICallback icallback) {
        super(name, owner, icallback);
        this.icallback = icallback;
        bark();
    }


    public void bark() {
        System.out.println(getName() + ": Wolf Wolf!");
        icallback.petCallback(getName() + ": Wolf Wolf!");
    }

    @Override
    public void attack(ICharacter opponent) {
        String callBack = getName() + ": Biting " + opponent.getName();
        System.out.println(callBack);
        opponent.decreaseHealth(getAttackPower());

        icallback.petCallback(callBack);
    }

    @Override
    public double decreaseHealth(int opponentAttackPower) {
        return 0;
    }

    @Override
    public void defend() {

    }

    @Override
    public void jump() {

    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    protected void cry() {
        bark();
    }
}
