package com.example.git.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.git.R;
import com.example.git.bean.FuBean;

import java.util.ArrayList;

import javax.crypto.spec.IvParameterSpec;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RlvOneAdapter extends RecyclerView.Adapter<RlvOneAdapter.ViewHolder> {
    private final FragmentActivity activity;
    private final ArrayList<FuBean.ResultsBean> list;


    public RlvOneAdapter(FragmentActivity activity, ArrayList<FuBean.ResultsBean> list) {

        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.item_one, null);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(activity).load(list.get(i).getUrl()).into(viewHolder.ivShow);
        viewHolder.tvDesc.setText(list.get(i).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_show)
        ImageView ivShow;
        @BindView(R.id.tv_desc)
        TextView tvDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
