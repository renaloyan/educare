package com.algobty.educare.recyclerviews.subjectcard;

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
import com.algobty.educare.Quiz;
import com.algobty.educare.R;
import com.algobty.educare.SubjectCardActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectCardAdapter extends RecyclerView.Adapter<SubjectCardAdapter.SubjectCardViewHolder> {

    Activity mActivity;
    Context context;
    ArrayList<SubjectCardModel> subjectCardModels;
    List<Integer> images;
    InterstitialAd interstitialAd;

    public SubjectCardAdapter(Context context, ArrayList<SubjectCardModel> subjectCardModels, List<Integer> images, Activity mActivity) {
        this.context = context;
        this.subjectCardModels = subjectCardModels;
        this.images = images;
        this.mActivity = mActivity;
    }

    @NonNull
    @NotNull
    @Override
    public SubjectCardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_card, null);
        return new SubjectCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SubjectCardViewHolder holder, int position) {
        holder.subject.setText(subjectCardModels.get(position).getSubject());
        holder.gridIcon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return subjectCardModels.size();
    }

    class SubjectCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView subjectCardView;
        TextView subject;
        ImageView gridIcon;

        public SubjectCardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            this.subjectCardView = itemView.findViewById(R.id.sub_view);
            this.subject = itemView.findViewById(R.id.sub_text);
            this.gridIcon = itemView.findViewById(R.id.sub_image);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;

            //interstitialAd
            interstitialAd = new InterstitialAd(context);
            interstitialAd.setAdUnitId("ca-app-pub-7228366808257832/5967594705");
            interstitialAd.loadAd(new AdRequest.Builder().build());
            if (interstitialAd.isLoaded()){
                interstitialAd.show();
            }

            interstitialAd.setAdListener(new AdListener(){
                @Override
                public void onAdClosed(){
                    interstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });

            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 1); //ap
                    break;
                case 1:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 2); //science
                    break;
                case 2:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 3); //esp
                    break;
                case 3:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 4); //mapeh
                    break;
                case 4:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 5); //math
                    break;
                case 5:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 6); //ict
                    break;
                case 6:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 7); //filipino
                    break;
                case 7:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 8); //research
                    break;
                case 8:
                    intent = new Intent(context, Quiz.class);
                    intent.putExtra("subjectClicked", 9); //english
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + getAdapterPosition());
            }
            SubjectCardActivity subjectCardActivity = new SubjectCardActivity();
            intent.putExtra("gradeClicked", subjectCardActivity.getGradeClicked());
            intent.putExtra("quarterClicked", subjectCardActivity.getQuarterClicked());
            context.startActivity(intent);
            mActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            mActivity.finish();

        }
    }
}
