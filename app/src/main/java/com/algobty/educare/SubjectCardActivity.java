package com.algobty.educare;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.algobty.educare.recyclerviews.SpacingItemDecorator;
import com.algobty.educare.recyclerviews.subjectcard.SubjectCardAdapter;
import com.algobty.educare.recyclerviews.subjectcard.SubjectCardModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class SubjectCardActivity extends AppCompatActivity {

    RecyclerView subjectRecyclerView;
    SubjectCardAdapter subjectCardAdapter;
    TextView gradeChosen;
    TextView quarterChosen;
    int gradeClicked;
    int quarterClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_card);

        //gets the chosen grade and quarter
        Intent intent = getIntent();
        gradeClicked = intent.getIntExtra("gradeClicked", 7);
        quarterClicked = intent.getIntExtra("quarterClicked", 1);

        List<Integer> images;

        images = new ArrayList<>();

        images.add(R.drawable.ap);
        images.add(R.drawable.science);
        images.add(R.drawable.esp);
        images.add(R.drawable.mapeh);
        images.add(R.drawable.math);
        images.add(R.drawable.ict);
        images.add(R.drawable.filipino);
        images.add(R.drawable.research);
        images.add(R.drawable.english);

        //displays the chosen grade and quarter
        gradeChosen = findViewById(R.id.grade_chosen);
        quarterChosen = findViewById(R.id.quarter_chosen);
        String numberPostfix;
        switch (quarterClicked) {
            case 1:
                numberPostfix = "st";
                break;
            case 2:
                numberPostfix = "nd";
                break;
            case 3:
                numberPostfix = "rd";
                break;
            case 4:
                numberPostfix = "th";
                break;
            default:
                numberPostfix = "st";
        }
        gradeChosen.setText("Grade " + gradeClicked);
        quarterChosen.setText(quarterClicked + numberPostfix + " Quarter");

        //setup recycler view
        subjectRecyclerView = findViewById(R.id.subject_card_recycler_view);
        subjectCardAdapter = new SubjectCardAdapter(this, getSubjectCardModels(), images);
        subjectRecyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        subjectRecyclerView.setAdapter(subjectCardAdapter);
        SpacingItemDecorator spacingItemDecorator = new SpacingItemDecorator(10);
        subjectRecyclerView.addItemDecoration(spacingItemDecorator);

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), QuarterCardActivity.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }

    private ArrayList<SubjectCardModel> getSubjectCardModels() {
        ArrayList<SubjectCardModel> subjectCardModels = new ArrayList<>();
        subjectCardModels.add(createSubjectCardModel("ap"));
        subjectCardModels.add(createSubjectCardModel("science"));
        subjectCardModels.add(createSubjectCardModel("esp"));
        subjectCardModels.add(createSubjectCardModel("mapeh"));
        subjectCardModels.add(createSubjectCardModel("math"));
        subjectCardModels.add(createSubjectCardModel("ict"));
        subjectCardModels.add(createSubjectCardModel("filipino"));
        subjectCardModels.add(createSubjectCardModel("research"));
        subjectCardModels.add(createSubjectCardModel("english"));
        return subjectCardModels;
    }

    private SubjectCardModel createSubjectCardModel(String subject) {
        SubjectCardModel subjectCardModel = new SubjectCardModel();
        subjectCardModel.setSubject(subject);
        return subjectCardModel;
    }
}