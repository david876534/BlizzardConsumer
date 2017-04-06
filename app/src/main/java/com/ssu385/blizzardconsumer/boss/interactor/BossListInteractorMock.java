package com.ssu385.blizzardconsumer.boss.interactor;


import com.ssu385.blizzardconsumer.core.model.Boss;
import com.ssu385.blizzardconsumer.core.model.BossList;

/*
    Mock data imoplementation to drive the presenter and the view until API data is available
 */
public class BossListInteractorMock implements BossInteractor {
    @Override
    public void getBossData(String id, BossDataCallback callback) {

        // Creating instances of the Boss object using the builder
        BossList bosses = new BossList();
        bosses.insert(new Boss.Builder()
                .name("Brohemoth the Magnificent")
                .id(0)
                .description("magnificent")
                .build());
        bosses.insert(new Boss.Builder().name("Broseph the Wise").build());
        bosses.insert(new Boss.Builder().name("Brometheus the FireBringer").build());
        callback.onBossDataCallback(bosses);
    }
}
