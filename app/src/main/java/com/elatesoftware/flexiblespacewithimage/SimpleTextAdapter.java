package com.elatesoftware.flexiblespacewithimage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Андрей Евтухов on 04.04.2017.
 */

public class SimpleTextAdapter  extends RecyclerView.Adapter<SimpleTextAdapter.ViewHolder>{

    private String[] mNames;

    public SimpleTextAdapter(String[] mNames) {
        this.mNames = mNames;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mName.setText(mNames[position]);
    }

    @Override
    public int getItemCount() {
        return mNames.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_text) TextView mName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
