package com.ssu385.blizzardconsumer.items.viewcontroller.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.core.model.Boss;

import butterknife.BindView;
import butterknife.ButterKnife;


public class BossListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.boss_card)
    CardView cv;
    @BindView(R.id.boss_item_name)
    TextView name;
    @BindView(R.id.available_heroic_indicator)
    ImageView heroic;
    @BindView(R.id.available_normal_indicator)
    ImageView normal;
    @BindView(R.id.boss_health)
    TextView health;
    @BindView(R.id.boss_zone_id)
    TextView zone;
    @BindView(R.id.boss_level)
    TextView level;
    @BindView(R.id.boss_id)
    TextView id;
    @BindView(R.id.boss_description)
    TextView description;


    public BossListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    public void bindBoss(Boss boss) {
        name.setText(boss.getName());
        if (boss.isAvailableInHeroicMode())
            heroic.setVisibility(View.VISIBLE);
        if (boss.isAvailableInNormalMode())
            normal.setVisibility(View.VISIBLE);
        level.setText(Integer.toString(boss.getLevel()));
        health.setText(Integer.toString(boss.getHealth()));
        zone.setText(Integer.toString(boss.getLevel()));
        id.setText(Integer.toString(boss.getId()));
        description.setText(boss.getDescription());

    }
    public void clicked(){
        description.setVisibility(View.VISIBLE);
    }
    public void notClicked(){
        description.setVisibility(View.GONE);
    }

}
