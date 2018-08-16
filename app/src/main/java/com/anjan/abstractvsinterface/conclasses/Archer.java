package com.anjan.abstractvsinterface.conclasses;

import com.anjan.abstractvsinterface.absclasses.Human;
import com.anjan.abstractvsinterface.interfaces.ICallback;
import com.anjan.abstractvsinterface.interfaces.ICharacter;

import static com.anjan.abstractvsinterface.MainActivity.TAG;

/**
 * Created by Anjan Debnath on 8/3/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class Archer extends Human implements ICharacter{

    private int numArrows = 0;
    ICallback icallback;


    public Archer(String name, ICallback icallback) {
        super(name, icallback);
        this.icallback = icallback;
        findArrows();
    }



    public void findArrows() {
        int numArrowsFound = randomGenerator.nextInt(10) + 1;
        String status = getName() + ": Found " + numArrowsFound + " arrows ...";
        System.out.println();
        numArrows += numArrowsFound;
        icallback.humanCallback(status);
    }


    @Override
    public void attack(ICharacter opponent) {
        String callBack = getName() + ": Attacking " + opponent.getName()
                + " with my arrows!";
        System.out.println(callBack);
        opponent.decreaseHealth(getAttackPower());
        icallback.humanCallback(callBack);
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


}
