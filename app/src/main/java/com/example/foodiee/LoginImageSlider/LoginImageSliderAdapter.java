package com.example.foodiee.LoginImageSlider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodiee.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class LoginImageSliderAdapter extends SliderViewAdapter<LoginImageSliderAdapter.LS_VH> {

    private Context context;
    private int mCount;

    public LoginImageSliderAdapter(Context context, int mCount) {
        this.context = context;
        this.mCount = mCount;
    }

    @Override
    public LS_VH onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.login_image_silider_item, null);
        return new LS_VH(view);
    }

    @Override
    public void onBindViewHolder(LS_VH viewHolder, int position) {

        switch (position) {

            case 0:
                viewHolder.Slideimage.setImageResource(R.drawable.foodimg4);
                viewHolder.txt.setText("Order From Wide Range Of Food Items");
                break;
            case 1:
                viewHolder.Slideimage.setImageResource(R.drawable.foodimg2);
                viewHolder.txt.setText("Order From Wide Range Of Food Items");
                break;
            case 2:
                viewHolder.Slideimage.setImageResource(R.drawable.foodimg3);
                viewHolder.txt.setText("Order From Wide Range Of Food Items");
                break;

        }
    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return mCount;
    }

    public class LS_VH extends SliderViewAdapter.ViewHolder {

        ImageView Slideimage;
        TextView txt;

        public LS_VH(View itemView) {
            super(itemView);

            Slideimage = (ImageView) itemView.findViewById(R.id.Slideimage);
            txt = (TextView) itemView.findViewById(R.id.txt);

        }
    }
}
