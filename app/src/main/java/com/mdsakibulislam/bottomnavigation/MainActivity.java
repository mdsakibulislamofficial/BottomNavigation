package com.mdsakibulislam.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navagation_id);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continer_id,new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment selectedFragment = null;


                switch (menuItem.getItemId())
                {

                    case R.id.nav_home_id:
                        selectedFragment = new HomeFragment();
                        break;

                    case R.id.nav_favorite_id:
                        selectedFragment = new FavoriteFragment();
                        break;

                    case R.id.nav_serch_id:
                        selectedFragment = new SearchFragment();
                        break;
                }


                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continer_id,selectedFragment).commit();







                return true;
            }
        });


    }
}
