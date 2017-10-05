package cluelin.bamboospear;

import android.util.Log;

/**
 * Created by clue on 2017-09-01.
 */

public class CrossBow {

    static final int MAX_REINFORCEMENT = 5;
    int reinforcement = 0;

    int location;

    public CrossBow(int location){

        this.location = location;

    }

    public void shootingBow(Camp targetCamp){

        //자원소모.

        //지연시간을 주는게 필요. 그리고 해당 시점에서 방패가 있는지 확인.


        try {
            Thread.sleep(3000);
        }catch (InterruptedException interruptedException){

            Log.d("TagD", "Sleep fail");

        }



        //적에게 방패가 있는지 체크.
        if(targetCamp.hasShield(location)){
            //no damage;
            Log.d("TagD", "no damage");
        }else{

            //적에게 데미지.
            Log.d("TagD", "get Damage");
            //get damage;
        }

    }




}
