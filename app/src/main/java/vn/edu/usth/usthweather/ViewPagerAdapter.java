package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 3;

    public ViewPagerAdapter(@NonNull FragmentManager fm){
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new WeatherAndForecastFragment();
            case 1: return new WeatherAndForecastFragment();
            case 2: return new WeatherAndForecastFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0){
            title = "Hanoi";
        }
        else if (position == 1){
            title = "Paris";
        }
        else if (position == 2){
            title = "Haiphong";
        }
        return title;
    }
}
