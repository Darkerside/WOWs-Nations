package com.ra121514.wowsnations;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NationRecyclerAdapter extends RecyclerView.Adapter<NationRecyclerAdapter.ViewHolder> {

    public List<Nation> nation_list;
    private OnItemClickListener itemClickListener;

    public NationRecyclerAdapter(List<Nation> list, OnItemClickListener itemClickListener){
        this.nation_list = list;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public NationRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nation_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NationRecyclerAdapter.ViewHolder holder, int position) {
        final Nation item = nation_list.get(position);

        String name = nation_list.get(position).getName();
        String image = nation_list.get(position).getImage();
        String information = nation_list.get(position).getInformation();

        holder.name.setText(name);
        holder.information.setText(information);

        // image
        int drawableIdentifier = holder.mView.getContext().getResources().getIdentifier(image, "drawable", MainActivity.class.getPackage().getName());

        Glide.with(holder.mView.getContext())
                .load(drawableIdentifier)
                .into(holder.image);

        // handle click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(item);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nation_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView name;
        private TextView information;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView;
            name = mView.findViewById(R.id.text_name);
            information = mView.findViewById(R.id.text_gameplay_dd);
            image = mView.findViewById(R.id.img_nation);
        }
    }


    public interface OnItemClickListener {
        void onClick(Nation item);
    }
}
