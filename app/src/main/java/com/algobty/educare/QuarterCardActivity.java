package com.algobty.educare;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.algobty.educare.recyclerviews.SpacingItemDecorator;
import com.algobty.educare.recyclerviews.quartercard.QuarterCardAdapter;
import com.algobty.educare.recyclerviews.quartercard.QuarterCardModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class QuarterCardActivity extends AppCompatActivity {

    RecyclerView quarterCardRecyclerView;
    QuarterCardAdapter quarterCardAdapter;
    public static int gradeClicked;
    TextView gradeChosen;

    public int getGradeClicked() {
        return gradeClicked;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarter_card);

        //gets the grade clicked
        Intent intent = getIntent();
        gradeClicked = intent.getIntExtra("gradeClicked", 7);
        intent.removeExtra("gradeClicked");

        //displays the grade chosen
        gradeChosen = findViewById(R.id.grade_chosen);
        gradeChosen.setText("Grade " + gradeClicked);

        //setup recycler view
        quarterCardRecyclerView = findViewById(R.id.quarter_card_recycler_view);
        quarterCardAdapter = new QuarterCardAdapter(this, getQuarterCardModels());
        quarterCardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        quarterCardRecyclerView.setAdapter(quarterCardAdapter);
        SpacingItemDecorator itemDecorator = new SpacingItemDecorator(10);
        quarterCardRecyclerView.addItemDecoration(itemDecorator);

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

    @Override
    public void onBackPressed() {
        finish();
    }

    private ArrayList<QuarterCardModel> getQuarterCardModels() {
        ArrayList<QuarterCardModel> quarterCardModels = new ArrayList<>();
        quarterCardModels.add(createQuarterCardModel(1));
        quarterCardModels.add(createQuarterCardModel(2));
        quarterCardModels.add(createQuarterCardModel(3));
        quarterCardModels.add(createQuarterCardModel(4));
        return quarterCardModels;
    }

    private QuarterCardModel createQuarterCardModel(int quarterNumber) {
        QuarterCardModel quarterCardModel = new QuarterCardModel();
        quarterCardModel.setQuarterNumber(quarterNumber);
        return quarterCardModel;
    }
}