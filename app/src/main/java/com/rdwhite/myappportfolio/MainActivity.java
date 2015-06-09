package com.rdwhite.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    public void launchStreamer(View view) {
        // Launch Streamer app();
        showToast("This button will launch the Spotify streamer app.");
    }

    public void launchFootballScores(View view) {
        // Launch Football Scores app
        showToast("This button will launch the Football Scores app.");
    }

    public void launchLibrary(View view) {
        // Launch Library app
        showToast("This button will launch the Library app.");;
    }

    public void launchBuildItBigger(View view) {
        // Launch build it bigger
        showToast("This button will launch Build It Bigger!");
    }

    public void launchXYZReader(View view) {
        // Launch XYZ Reader app
        showToast("This button will launch the XYZ Reader.");
    }

    public void launchCapstone(View view) {
        // Launch capstone project
        showToast("This button will launch my capstone project.");
    }

    private void showToast(String msg) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }
}
