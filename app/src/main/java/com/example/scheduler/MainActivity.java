package com.example.scheduler;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.scheduler.ui.MonthFragment;
import com.example.scheduler.ui.dayFragment.DayFragment;
import com.example.scheduler.ui.weekFragment.WeekFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        RecyclerView recyclerView = findViewById(R.id.DayActivitiesList);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BottomNavigationView mainNavigationView = findViewById(R.id.nav_view);
        mainNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.navigation_day:
                                Toast.makeText(MainActivity.this, "Day", Toast.LENGTH_SHORT);
                                fragmentTransaction.replace(R.id.nav_host_fragment, new DayFragment());
                                fragmentTransaction.commit();
                                break;
                            case R.id.navigation_month:
                                Toast.makeText(MainActivity.this, "Month", Toast.LENGTH_SHORT);
                                fragmentTransaction.replace(R.id.nav_host_fragment, new MonthFragment());
                                fragmentTransaction.commit();
                                break;
                            case R.id.navigation_week:
                                fragmentTransaction.replace(R.id.nav_host_fragment, new WeekFragment());
                                fragmentTransaction.commit();
                                break;
                        }

                        return true;
                    }
                }
        );

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_day, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        Fragment navHostFrag = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}