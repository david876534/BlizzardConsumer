package com.ssu385.blizzardconsumer.boss.viewcontroller.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.core.model.Boss;


public class BossListViewHolder extends RecyclerView.ViewHolder {
    TextView name;


    public BossListViewHolder(View itemView) {
        super(itemView);

        name = (TextView)itemView.findViewById(R.id.boss_item_name);
    }

    public void bindBoss(Boss boss) {
        name.setText(boss.getName());
    }

}
