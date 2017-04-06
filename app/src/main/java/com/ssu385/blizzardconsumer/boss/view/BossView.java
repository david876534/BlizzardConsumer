package com.ssu385.blizzardconsumer.boss.view;


import com.ssu385.blizzardconsumer.core.model.Boss;
/*
    This interface provides an abstracted dependency allowing the Presenter and view controller
    (Fragment or Activity) to form loose coupling for bi-directional communication.
 */
public interface BossView {
    // This method is intended to be used as a means of returning data to whatever class
    // has concretely implemented the view interface.
    void displayBossViewData(Boss... bosses);
}
