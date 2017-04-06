package com.ssu385.blizzardconsumer.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BossList{

    //The serializedname method will expose the arraylist to gson and eliminate any guessing
    //from the library

    //TIP: Another way to do this would be to have BossList extend (inherit from) ArrayList<Boss>

    @SerializedName("bosses")
    private ArrayList<Boss> bosses;

    //Simply exposes the private data to any outside callers (In BossListAdapter specifically)
    public Boss getBoss(int pos) {
        return bosses.get(pos);
    }
    //Allows BossListInteractorMock to still insert fake data into this Model object
    public void insert(Boss boss){
        bosses.add(boss);
    }
    //Length will be needed for the getItemCount method in BossListAdapter which is vital for the
    //RecyclerView Adapter to work.
    public int length() {
        return bosses.size();
    }
}
