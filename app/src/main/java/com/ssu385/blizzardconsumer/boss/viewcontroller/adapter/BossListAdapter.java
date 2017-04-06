package com.ssu385.blizzardconsumer.boss.viewcontroller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.boss.viewcontroller.viewholder.BossListViewHolder;
import com.ssu385.blizzardconsumer.core.model.Boss;

public class BossListAdapter extends RecyclerView.Adapter<BossListViewHolder> {
    private Boss[] bosses;

    public BossListAdapter(Boss[] bosses) {
        this.bosses = bosses;
    }

    @Override
    public BossListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.boss_list_item, parent, false);

        BossListViewHolder holder = new BossListViewHolder(inflatedView);
        return holder;
    }

    @Override
    public void onBindViewHolder(BossListViewHolder holder, int position) {
        Boss boss = bosses[position];
        holder.bindBoss(boss);
    }

    @Override
    public int getItemCount() {
        return bosses.length;
    }
}
