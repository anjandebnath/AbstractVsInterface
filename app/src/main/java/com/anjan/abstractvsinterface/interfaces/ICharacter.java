package com.anjan.abstractvsinterface.interfaces;

import java.util.Random;

/**
 * Created by Anjan Debnath on 8/3/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public interface ICharacter {

    Random randomGenerator = new Random();

    String getName();
    double getHealth();
    long getExperience();
    int getAttackPower();
    void setAttackPower(int attackPower);

    void defend();
    void jump();
    int heal();
    void attack(ICharacter opponent);
    double decreaseHealth(int opponentAttackPower);
    long gainExperience(long experience);
}
