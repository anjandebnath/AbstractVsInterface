package com.anjan.abstractvsinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anjan.abstractvsinterface.absclasses.Human;
import com.anjan.abstractvsinterface.absclasses.Pet;
import com.anjan.abstractvsinterface.conclasses.Archer;
import com.anjan.abstractvsinterface.conclasses.Dog;
import com.anjan.abstractvsinterface.interfaces.ICallback;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements ICallback{

    public static final String TAG = "R :: ";


    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = findViewById(R.id.textV);

        showText.setText("\nInitialize Game\n");
        Archer niceArcher = new Archer("Tom", this);
        Human modernArcher = new Archer("Stacy", this);

        Dog modernDog = new Dog("German Shepherd", modernArcher, this);
        Pet petDog = new Dog("Akita", niceArcher, this);

        showText.append("\nStart Game\n");

        modernArcher.attack(niceArcher);
        niceArcher.getPet().attack(modernArcher);
        modernArcher.attack(niceArcher.getPet());
        modernDog.attack(petDog.getOwner());
        petDog.attack(modernArcher.getPet());




    }


    @Override
    public void petCallback(String status) {
        showText.append(status+"\n");
    }

    @Override
    public void humanCallback(String status) {
        showText.append(status+"\n");
    }
}
