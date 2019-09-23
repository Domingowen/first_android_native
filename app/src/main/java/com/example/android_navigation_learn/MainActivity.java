package com.example.android_navigation_learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements FirstNavgiation.OnFragmentInteractionListener, SecondNavigation.OnFragmentInteractionListener {

//    private BottomNavigationView bottomNavigationView;
//    private BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = findViewById(R.id.first_navigation);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_firstNavgiation_to_secondNavigation);
//            }
//        });

//        bottomNavigationView.setItemIconTintList(null);
//        bottomNavigationView.setItemIconTintList(null);
        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
//        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
//        bottomNavigationView.setItemIconTintList(null);
    }

    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

//    @Override
//    public void onNavFragmentInteraction(String string) {
//        // Do stuff
//    }
}
