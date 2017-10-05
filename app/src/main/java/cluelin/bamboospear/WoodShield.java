package cluelin.bamboospear;

import android.util.Log;

/**
 * Created by clue on 2017-09-01.
 */


public class WoodShield {

    static final int MAX_REINFORCEMENT = 1;
    int reinforcement = 0;
    int location;
    int camp;

    public WoodShield(int location){
//        this.camp = camp;
        this.location = location;
    }

    public int getReinforcement() {

        synchronized (this){
            return reinforcement;
        }

    }


    public void reinforceShield() {

        if (this.reinforcement < MAX_REINFORCEMENT) {

            synchronized (this) {
                this.reinforcement++;
            }

            try {
                Thread.sleep(1000);
            }catch (InterruptedException interruptedException){

                Log.d("TagD", "Sleep fail");

            }

            synchronized (this) {
                this.reinforcement--;
            }

        }


    }

}
