package com.algobty.educare.recyclerviews.gradecard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.algobty.educare.QuarterCardActivity;
import com.algobty.educare.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCardAdapter extends RecyclerView.Adapter<GradeCardAdapter.GradeCardViewHolder> {

    Activity mActivity;
    Context context;
    ArrayList<GradeCardModel> gradeCardModels;
    static Map<Integer, Drawable> background = new HashMap<>();
    List<Integer> images;

    public GradeCardAdapter(Context context, ArrayList<GradeCardModel> gradeCardModels, List<Integer> images,Activity mActivity) {
        this.context = context;
        this.gradeCardModels = gradeCardModels;
        this.images = images;
        this.mActivity = mActivity;
    }

    @NonNull
    @NotNull
    @Override
    public GradeCardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        background.put(7, ResourcesCompat.getDrawable(context.getResources(), R.drawable.math_card_background, null));
        background.put(8, ResourcesCompat.getDrawable(context.getResources(), R.drawable.esp_card_background, null));
        background.put(9, ResourcesCompat.getDrawable(context.getResources(), R.drawable.science_card_background, null));
        background.put(10, ResourcesCompat.getDrawable(context.getResources(), R.drawable.filipino_card_background, null));
        background.put(11, ResourcesCompat.getDrawable(context.getResources(), R.drawable.research_card_background, null));
        background.put(12, ResourcesCompat.getDrawable(context.getResources(), R.drawable.ap_card_background, null));

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grade_card, null);
        return new GradeCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull GradeCardViewHolder holder, int position) {
        holder.gradeCardLayout.setBackground(background.get(gradeCardModels.get(position).getGradeLevel()));
        holder.gradeLevel.setText("Grade " + gradeCardModels.get(position).getGradeLevel());
        holder.gridIcon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() { return gradeCardModels.size(); }

    class GradeCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView gradeCardView;
        ConstraintLayout gradeCardLayout;
        TextView gradeLevel;
        ImageView gridIcon;

        public GradeCardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            this.gradeCardView = itemView.findViewById(R.id.grade_view);
            this.gradeCardLayout = itemView.findViewById(R.id.grade_layout);
            this.gradeLevel = itemView.findViewById(R.id.grade_text);
            this.gridIcon = itemView.findViewById(R.id.grade_image);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 7);
                    break;
                case 1:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 8);
                    break;
                case 2:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 9);
                    break;
                case 3:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 10);
                    break;
                case 4:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 11);
                    break;
                case 5:
                    intent = new Intent(context, QuarterCardActivity.class);
                    intent.putExtra("gradeClicked", 12);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + getAdapterPosition());
            }
            context.startActivity(intent);
            mActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            mActivity.finish();
        }
    }
}


