package com.ssu385.blizzardconsumer.boss.presenter;


import com.ssu385.blizzardconsumer.boss.interactor.BossInteractor;
import com.ssu385.blizzardconsumer.boss.view.BossView;
import com.ssu385.blizzardconsumer.core.model.Boss;


/*
    The BossPresenter is used to handle the business logic for the Boss user interface. In order
    to abstract the Presenter from an explicit dependency on a particular type of view controller
     (e.g. Fragment, Activity) this implementation instead makes it dependent on the BossView
     interface type.  There is also a dependency on the BossInteractor interface type.
 */
public class BossPresenter {

    // private instances of the view and interactor dependencies that will be assigned values during constructor
    // initialization
    private BossView view;
    private BossInteractor interactor;

    // Constructor initializes local instances of the BossView and BossInteractor. Note that these
    // parameters may be the interfaces themselves, or any concrete implementation of those interfaces
    public BossPresenter(BossView view, BossInteractor interactor) {
        this.interactor = interactor;
        this.view = view;
    }

    // This publicly exposed method will provide a calling class with a means of giving the Presenter
    // input so that it can do it's work.  This implementation shows how a two way relationship can
    // be created between the Presenter and the class that instantiates it (assumes that the calling
    // class implements the BossView interface and passes itself into the BossPresenter constructor
    // as the 'view' param).
    public void presentBossData(String id) {
        // Invoking the data retrieval use case on the BossInteractor, which requires the concrete
        // instantiation of the BossDataCallback listener
        interactor.getBossData(id, new BossInteractor.BossDataCallback() {
            // Overriding the BossDataCallback method, and in the method body invoking a function on
            // the View.
            @Override
            public void onBossDataCallback(Boss... bosses) {
                view.displayBossViewData(bosses);
            }
        });
    }

}
