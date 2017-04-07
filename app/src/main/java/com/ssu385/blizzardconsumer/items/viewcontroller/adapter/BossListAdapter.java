package com.ssu385.blizzardconsumer.items.viewcontroller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.items.viewcontroller.viewholder.BossListViewHolder;
import com.ssu385.blizzardconsumer.core.model.Boss;
import com.ssu385.blizzardconsumer.core.model.BossList;

public class BossListAdapter extends RecyclerView.Adapter<BossListViewHolder> {
    private BossList bosses;
    private int expandedPosition;
    private ViewGroup viewGroup;

    public BossListAdapter(BossList bosses) {
        expandedPosition = -1;
        this.bosses = bosses;
    }

    @Override
    public BossListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        viewGroup = parent;
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.boss_list_item, parent, false);

        BossListViewHolder holder = new BossListViewHolder(inflatedView);
        return holder;
    }

    @Override
    public void onBindViewHolder(final BossListViewHolder holder, final int position) {
        Boss boss = bosses.getBoss(position);
        holder.bindBoss(boss);
        final boolean isExpanded = (position == expandedPosition);
        if (isExpanded){
            holder.clicked();
        } else {
            holder.notClicked();
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandedPosition >= 0){
                    notifyItemChanged(expandedPosition);
                }
                expandedPosition = isExpanded ? -1:position;
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bosses.length();
    }
}
