package com.algobty.educare;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.algobty.educare.recyclerviews.SpacingItemDecorator;
import com.algobty.educare.recyclerviews.gradecard.GradeCardAdapter;
import com.algobty.educare.recyclerviews.gradecard.GradeCardModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView gradeCardRecyclerView;
    GradeCardAdapter gradeCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize grade card
        gradeCardRecyclerView = findViewById(R.id.grade_card_recycler_view);
        gradeCardAdapter = new GradeCardAdapter(this, getGradeCardModels());
        gradeCardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        gradeCardRecyclerView.setAdapter(gradeCardAdapter);
        SpacingItemDecorator itemDecorator = new SpacingItemDecorator(10);
        gradeCardRecyclerView.addItemDecoration(itemDecorator);

        //bottom nav
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dashboard:
                        return true;
                    case R.id.current_task:
                        startActivity(new Intent(getApplicationContext(), CurrentTask.class));
                        overridePendingTransition(1, 1);
                        finish();
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(1, 1);
                        finish();
                        return true;
                }
                return false;
            }
        });
    }

    //double backpressed
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    //set items on grade card recycler view
    private ArrayList<GradeCardModel> getGradeCardModels() {
        ArrayList<GradeCardModel> gradeCardModels = new ArrayList<>();
        gradeCardModels.add(createGradeCardModel(7));
        gradeCardModels.add(createGradeCardModel(8));
        gradeCardModels.add(createGradeCardModel(9));
        gradeCardModels.add(createGradeCardModel(10));
        gradeCardModels.add(createGradeCardModel(11));
        gradeCardModels.add(createGradeCardModel(12));
        return gradeCardModels;
    }

    private GradeCardModel createGradeCardModel(int gradeLevel) {
        GradeCardModel gradeCardModel = new GradeCardModel();
        gradeCardModel.setGradeLevel(gradeLevel);
        return gradeCardModel;
    }
}

