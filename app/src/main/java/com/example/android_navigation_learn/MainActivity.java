package com.example.android_navigation_learn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

//    private BottomNavigationView bottomNavigationView;
//    private BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        Button button = findViewById(R.id.first_navigation);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_firstNavgiation_to_secondNavigation);
//            }
//        });

        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        navigationView.setItemIconTintList(null);
        navigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }

//    @Override
//    public void onFragmentInteraction(Uri uri){
//        //you can leave it empty
//    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.account:
                fragment = new HomeFragment();
                break;
            case R.id.fortune:
                fragment = new FortuneFragment();
                break;
            case R.id.benefit:
                fragment = new BenefitFragment();
                break;
        }
        return loadFragment(fragment);
    }

//    @Override
//    public void onNavFragmentInteraction(String string) {
//        // Do stuff
//    }
}
