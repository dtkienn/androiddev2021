package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForecastFragment newFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, newFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("1", "This is when started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("1", "This is when resume?");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("1", "This is when paused?");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("1", "This is when stopped?");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("1", "This is when destroyed?");
    }
}