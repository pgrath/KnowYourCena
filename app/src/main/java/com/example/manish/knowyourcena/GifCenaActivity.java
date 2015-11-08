package com.example.manish.knowyourcena;

import android.widget.VideoView;


        import android.content.res.AssetFileDescriptor;
        import android.media.MediaPlayer;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.SurfaceHolder;
        import android.widget.VideoView;

        import java.io.IOException;
        import java.util.ResourceBundle.Control;
        import android.app.Activity;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import android.view.SurfaceView;
        import android.widget.MediaController;
        import android.widget.VideoView;

/**
 * Created by Manish on 11/8/2015.
 */

public class GifCenaActivity extends AppCompatActivity {
    final MediaPlayer mp = new MediaPlayer();
    VideoView video_player_view;
    DisplayMetrics dm;
    SurfaceView sur_View;
    MediaController media_Controller;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gif_cena, menu);
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_cena);
        //VideoView videoView = (VideoView)findViewById(R.id.your_video_view);
        //MediaController mediaController = new MediaController(this);
        //mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);

        //videoView.setVideoPath("John Cena goes Super Saiyan.mp4");

        //videoView.start();


        // video_player_view = (VideoView) findViewById(R.id.your_video_view);
        // media_Controller = new MediaController(this); dm = new DisplayMetrics();
        // this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        // int height = dm.heightPixels;
        // int width = dm.widthPixels;
        // video_player_view.setMinimumWidth(width);
        //video_player_view.setMinimumHeight(height);
        //video_player_view.setMediaController(media_Controller);
        //video_player_view.setVideoPath("giphy.gif");
        //video_player_view.start(); } }
        //try{
        //  AssetFileDescriptor afd;
        //afd = getAssets().openFd("");
        //mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        //mp.prepare();
        //mp.start();
        //} catch (IllegalStateException e) {
        //    e.printStackTrace();
        //} catch (IOException e) {
        //   e.printStackTrace();
        //}}
        final VideoView videoView =
                (VideoView) findViewById(R.id.your_video_view);

        videoView.setVideoPath(
                "https://harp.njit.edu/~ml394/John1.mp4");

        videoView.start();
    }
}