package cluelin.bamboospear;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    Camp northCamp, southCamp;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        northCamp = new Camp(CampSide.NORTH_SIDE);
        southCamp = new Camp(CampSide.SOUTH_SIDE);

//        Toast.makeText(this, "토스트", Toast.LENGTH_SHORT).show();

    }


    public void onClickSheild(View v) {


        ReinforcingShield reinforcingShield = null;

        switch (v.getId()) {

            case R.id.northShield1:
                reinforcingShield = new ReinforcingShield(northCamp, 0);
                break;
            case R.id.northShield2:
                reinforcingShield = new ReinforcingShield(northCamp, 1);
                break;
            case R.id.northShield3:
                reinforcingShield = new ReinforcingShield(northCamp, 2);
                break;
            case R.id.northShield4:
                reinforcingShield = new ReinforcingShield(northCamp, 3);
                break;
            case R.id.northShield5:
                reinforcingShield = new ReinforcingShield(northCamp, 4);
                break;



            case R.id.southShield1:
                reinforcingShield = new ReinforcingShield(southCamp, 0);
                break;
            case R.id.southShield2:
                reinforcingShield = new ReinforcingShield(southCamp, 1);
                break;
            case R.id.southShield3:
                reinforcingShield = new ReinforcingShield(southCamp, 2);
                break;
            case R.id.southShield4:
                reinforcingShield = new ReinforcingShield(southCamp, 3);
                break;
            case R.id.southShield5:
                reinforcingShield = new ReinforcingShield(southCamp, 4);
                break;


        }

        reinforcingShield.start();


    }

    public void onClickCrossBow(View v) {

        ShootingThread shootingThread = null;

        switch (v.getId()) {

            case R.id.northCrossBow1:
                shootingThread = new ShootingThread(southCamp, 0);
                break;
            case R.id.northCrossBow2:
                shootingThread = new ShootingThread(southCamp, 1);
                break;
            case R.id.northCrossBow3:
                shootingThread = new ShootingThread(southCamp, 2);
                break;
            case R.id.northCrossBow4:
                shootingThread = new ShootingThread(southCamp, 3);
                break;
            case R.id.northCrossBow5:
                shootingThread = new ShootingThread(southCamp, 4);
                break;


            case R.id.southCrossBow1:
                shootingThread = new ShootingThread(northCamp, 0);
                break;
            case R.id.southCrossBow2:
                shootingThread = new ShootingThread(northCamp, 1);
                break;
            case R.id.southCrossBow3:
                shootingThread = new ShootingThread(northCamp, 2);
                break;
            case R.id.southCrossBow4:
                shootingThread = new ShootingThread(northCamp, 3);
                break;
            case R.id.southCrossBow5:
                shootingThread = new ShootingThread(northCamp, 4);
                break;

        }

        shootingThread.start();

        Log.d("TagD", "Button click end");

    }

}
