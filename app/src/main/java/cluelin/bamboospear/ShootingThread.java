package cluelin.bamboospear;

import android.util.Log;

/**
 * Created by cluel on 2017-10-05.
 */

public class ShootingThread extends Thread {

    Camp targetCamp;
    int targetLocation;

    public ShootingThread(Camp targetCamp, int location){
        this.targetCamp = targetCamp;
        this.targetLocation = location;
    }

    public void run(){

        try {
            Thread.sleep(3000);
        }catch (InterruptedException interruptedException){

            Log.d("TagD", "Sleep fail");

        }



        //적에게 방패가 있는지 체크.
        if(targetCamp.hasShield(targetLocation)){
            //no damage;
            Log.d("TagD", "no damage");
        }else{

            //적에게 데미지.
            Log.d("TagD", "get Damage");
            //get damage;

            targetCamp.getDamage();
        }

    }
}
