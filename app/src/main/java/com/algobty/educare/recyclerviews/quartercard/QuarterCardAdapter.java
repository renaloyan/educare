package com.algobty.educare.recyclerviews.quartercard;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.algobty.educare.QuarterCardActivity;
import com.algobty.educare.R;
import com.algobty.educare.SubjectCardActivity;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuarterCardAdapter extends RecyclerView.Adapter<QuarterCardAdapter.QuarterCardViewHolder> {

    Context context;
    ArrayList<QuarterCardModel> quarterCardModels;
    static Map<Integer, Drawable> background = new HashMap<>();

    public QuarterCardAdapter(Context context, ArrayList<QuarterCardModel> quarterCardModels) {
        this.context = context;
        this.quarterCardModels = quarterCardModels;
    }

    @NonNull
    @NotNull
    @Override
    public QuarterCardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        background.put(1, ResourcesCompat.getDrawable(context.getResources(), R.drawable.mapeh_card_background, null));
        background.put(2, ResourcesCompat.getDrawable(context.getResources(), R.drawable.ict_card_background, null));
        background.put(3, ResourcesCompat.getDrawable(context.getResources(), R.drawable.english_card_background, null));
        background.put(4, ResourcesCompat.getDrawable(context.getResources(), R.drawable.ap_card_background, null));

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_card, null);
        return new QuarterCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull QuarterCardViewHolder holder, int position) {
        int quarterNumber = quarterCardModels.get(position).getQuarterNumber();
        String numberPostfix;
        switch (quarterNumber) {
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
                throw new IllegalStateException("Unexpected value: " + quarterNumber);
        }
        holder.quarterCardLayout.setBackground(background.get(quarterNumber));
        holder.quarterNumber.setText(quarterNumber + numberPostfix + " Quarter");
    }

    @Override
    public int getItemCount() {
        return quarterCardModels.size();
    }

    class QuarterCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView quarterCardView;
        ConstraintLayout quarterCardLayout;
        TextView quarterNumber;

        public QuarterCardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            this.quarterCardView = itemView.findViewById(R.id.card_view);
            this.quarterCardLayout = itemView.findViewById(R.id.card_layout);
            this.quarterNumber = itemView.findViewById(R.id.display_text);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, SubjectCardActivity.class);
                    intent.putExtra("quarterClicked", 1);
                    break;
                case 1:
                    intent = new Intent(context, SubjectCardActivity.class);
                    intent.putExtra("quarterClicked", 2);
                    break;
                case 2:
                    intent = new Intent(context, SubjectCardActivity.class);
                    intent.putExtra("quarterClicked", 3);
                    break;
                case 3:
                    intent = new Intent(context, SubjectCardActivity.class);
                    intent.putExtra("quarterClicked", 4);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + getAdapterPosition());
            }
            QuarterCardActivity quarterCardActivity = new QuarterCardActivity();
            intent.putExtra("gradeClicked", quarterCardActivity.getGradeClicked());
            context.startActivity(intent);
        }
    }
}
