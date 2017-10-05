package cluelin.bamboospear;

import android.util.Log;

/**
 * Created by cluel on 2017-10-05.
 */

public class ReinforcingShield extends Thread {


    Camp targetCamp;
    int targetLocation;

    public ReinforcingShield(Camp targetCamp, int location){
        this.targetCamp = targetCamp;
        this.targetLocation = location;
    }


    public void run(){

        targetCamp.getWoodShield(targetLocation).reinforceShield();

    }
}
