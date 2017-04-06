package com.ssu385.blizzardconsumer.boss.interactor;


import com.ssu385.blizzardconsumer.core.model.Boss;

/*
    Mock data imoplementation to drive the presenter and the view until API data is available
 */
public class BossListInteractorMock implements BossInteractor {
    @Override
    public void getBossData(String id, BossDataCallback callback) {

        // Creating instances of the Boss object using the builder
        Boss boss1 = new Boss.Builder()
                .name("Brohemoth the Magnificent")
                .id(0)
                .description("magnificent")
                .build();
        Boss boss2 = new Boss.Builder().name("Broseph the Wise").build();
        Boss boss3 = new Boss.Builder().name("Brometheus the Firebringer").build();

        callback.onBossDataCallback(boss1, boss2, boss3);
    }
}
