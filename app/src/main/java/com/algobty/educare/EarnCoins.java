package com.algobty.educare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class EarnCoins extends AppCompatActivity implements RewardedVideoAdListener {

    private RewardedVideoAd rewardedVideoAd;
    private int totalCoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_coins);

        TextView coinsView = findViewById(R.id.coins_view);
        Button showAdsBtn = findViewById(R.id.show_rewarded_ads_btn);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        rewardedVideoAd.setRewardedVideoAdListener(this);
        loadAds();

        showAdsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rewardedVideoAd.isLoaded()){
                    rewardedVideoAd.show();
                }
                else {
                    Toast.makeText(EarnCoins.this, "Please wait Ads is loading...", Toast.LENGTH_SHORT).show();
                }

            }
        });

        if(!isConnected()){

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.ic_internet_connection)
                    .setTitle("No Internet Connection")
                    .setMessage("Please Check your Internet Connection")
                    .setCancelable(false)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    }).show();

        }

        SharedPreferences myPrefsCoins = getSharedPreferences("sharedPrefCoins", MODE_PRIVATE);
        totalCoins = myPrefsCoins.getInt("COINS", 0);

        coinsView.setText(String.valueOf(totalCoins));

    }

    private void loadAds() {

        rewardedVideoAd.loadAd("ca-app-pub-7228366808257832/1159380337", new AdRequest.Builder().build());

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Reward.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return  networkInfo != null && networkInfo.isConnected();

    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        loadAds();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

        int coins = totalCoins;
        coins += 150;

        SharedPreferences myPrefsCoins = getSharedPreferences("sharedPrefCoins", MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefsCoins.edit();
        editor.putInt("COINS", coins);
        editor.apply();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

    @Override
    protected void onResume() {
        rewardedVideoAd.resume(this);
        super.onResume();
    }

    @Override
    protected void onPause() {
        rewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        rewardedVideoAd.destroy(this);
        super.onDestroy();
    }

}