package cluelin.bamboospear;

import android.util.Log;

/**
 * Created by clue on 2017-09-01.
 */

public class Camp {

    final int DAMAGE = 50;

    WoodShield[] woodShields = new WoodShield[5];
    CrossBow[] crossBows = new CrossBow[5];

    int campSide;
    int resource = 1000;
    int HP = 500;


    public Camp(int side){

        this.campSide = side;

        for(int i = 0 ; i < woodShields.length ; i++){

            //assign location to each Shield.
            woodShields[i] = new WoodShield(i+1);

        }

        for(int i = 0 ; i < crossBows.length ; i++){

            //assign location to each Bow
            crossBows[i] = new CrossBow(i);

        }

    }

    public WoodShield getWoodShield(int location) {
        return woodShields[location];
    }

    public CrossBow getCrossBows(int location) {
        return crossBows[location];
    }

    //if Camp has Shield at location then return true; else return false;
    public boolean hasShield(int loaction){

        if(getWoodShield(loaction).getReinforcement() >= 1){
            //강화도가 1 이상이면 있음.
            return true;
        }

        return false;
    }

    public void getDamage(){

        synchronized (this){
            this.HP -= DAMAGE;

        }

        Log.d("TagD", "HP : " + this.HP);

    }
}
