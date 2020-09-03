package com.algobty.educare.recyclerviews.subjectcard;

import android.content.Context;
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
import com.algobty.educare.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectCardAdapter extends RecyclerView.Adapter<SubjectCardAdapter.SubjectCardViewHolder> {

    Context context;
    ArrayList<SubjectCardModel> subjectCardModels;
    Map<String, Drawable> background = new HashMap<>();
    List<Integer> images;

    public SubjectCardAdapter(Context context, ArrayList<SubjectCardModel> subjectCardModels, List<Integer> images) {
        this.context = context;
        this.subjectCardModels = subjectCardModels;
        this.images = images;
    }

    @NonNull
    @NotNull
    @Override
    public SubjectCardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        background.put("ap", ResourcesCompat.getDrawable(context.getResources(), R.drawable.ap_card_background, null));
        background.put("english", ResourcesCompat.getDrawable(context.getResources(), R.drawable.english_card_background, null));
        background.put("esp", ResourcesCompat.getDrawable(context.getResources(), R.drawable.esp_card_background, null));
        background.put("filipino", ResourcesCompat.getDrawable(context.getResources(), R.drawable.filipino_card_background, null));
        background.put("ict", ResourcesCompat.getDrawable(context.getResources(), R.drawable.ict_card_background, null));
        background.put("mapeh", ResourcesCompat.getDrawable(context.getResources(), R.drawable.mapeh_card_background, null));
        background.put("math", ResourcesCompat.getDrawable(context.getResources(), R.drawable.math_card_background, null));
        background.put("research", ResourcesCompat.getDrawable(context.getResources(), R.drawable.research_card_background, null));
        background.put("science", ResourcesCompat.getDrawable(context.getResources(), R.drawable.science_card_background, null));

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_card, null);
        return new SubjectCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SubjectCardViewHolder holder, int position) {
        holder.subjectLayout.setBackground(background.get(subjectCardModels.get(position).getSubject().toLowerCase()));
        holder.subject.setText(subjectCardModels.get(position).getSubject());
        holder.gridIcon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return subjectCardModels.size();
    }

    class SubjectCardViewHolder extends RecyclerView.ViewHolder {

        CardView subjectCardView;
        ConstraintLayout subjectLayout;
        TextView subject;
        ImageView gridIcon;

        public SubjectCardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            this.subjectCardView = itemView.findViewById(R.id.sub_view);
            this.subjectLayout = itemView.findViewById(R.id.sub_layout);
            this.subject = itemView.findViewById(R.id.sub_text);
            this.gridIcon = itemView.findViewById(R.id.sub_image);
        }
    }
}
