package com.ssu385.blizzardconsumer.boss.interactor;


import com.ssu385.blizzardconsumer.core.model.Boss;

/*
    The interactor is responsible for making the necessary async API calls on behalf of the Presenter.
    Using an interface allows for the creation of different'flavors' of concrete implementation based
    in different dependencies.  For example, if a remote API is unavailable, a Mock data interactor
    could be implemented to provide a means fot eh Presenter and it's dependent View to be developed.
    Once an API dependency has been resolved, an actual implementation of the interactor could
    be instantiated for use.
 */
public interface BossInteractor {
    // An interactor interface should only contain one method specific to the use case that it is
    // created to represent (in this case, the interactor is fetching a list of Boss objects)
    void getBossData(String id, BossDataCallback callback);

    /*
        An internal interface to be used for listener implementaions between the Presenter and the
        Interactor
     */
    interface BossDataCallback {
        void onBossDataCallback(Boss... bosses);
    }
}
