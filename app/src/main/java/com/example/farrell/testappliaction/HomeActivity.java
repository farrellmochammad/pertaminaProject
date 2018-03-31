package com.example.farrell.testappliaction;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(HomeActivity.this, "Action home click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_transactionlist:
                        Toast.makeText(HomeActivity.this,"Action transaction click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_nearme:
                        Toast.makeText(HomeActivity.this, "Action nearme click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_promo:
                        Toast.makeText(HomeActivity.this, "Action promo click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_profile:
                        Toast.makeText(HomeActivity.this, "Action profile click", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
