package com.ssu385.blizzardconsumer.core.util;


import com.google.gson.Gson;
import com.ssu385.blizzardconsumer.core.model.BossList;

public class BossListParser {
    public static BossList getBossListFromJson(String jsonResponse) {
        Gson gson = new Gson();
        BossList bossList = gson.fromJson(jsonResponse, BossList.class);

        return bossList;
    }
}
