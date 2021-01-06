package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



        // ForecastFragment forecastFragment = new ForecastFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart" , "This is when started?" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume" , "This is when resumed?" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause" , "This is when paused?" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop" , "This is when stopped?" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy" , "This is when destroyed?" );
    }
}