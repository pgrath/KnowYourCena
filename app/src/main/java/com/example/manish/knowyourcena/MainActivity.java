package com.example.manish.knowyourcena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "aLUHCo0fLVn2eMmqKtEeCTTqa";
    private static final String TWITTER_SECRET = "lPCNCQnaHM0g7To1P7qNVdRakXxQ8TvUl4gIsedQPkVsnnMURP";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig), new TweetUi());
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goClick(View view){
        startActivity(new Intent(this,CenaTwitter.class));

    }


    public void onOption1(MenuItem menu){
        startActivity(new Intent(this, CenafyActivity.class));
    }

    public void onOption2(MenuItem menu){
        startActivity(new Intent(this, GifCenaActivity.class));
    }
    public void onOption3(MenuItem menu)
    {
        //startActivity(new Intent(this,DisplayAll.class));
    }



}
