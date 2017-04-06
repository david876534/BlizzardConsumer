package com.ssu385.blizzardconsumer.boss.viewcontroller.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ssu385.blizzardconsumer.R;
import com.ssu385.blizzardconsumer.boss.viewcontroller.fragment.BossListFragment;

/*
    This activity is primarily in use as a container for the BossListFragment and the
    BossDetailFragment.  Note that it necessarily implements the Fragment.OnFragmentInteractionListener
    interface that is internal to the BossListFragment.

*/
public class BossActivity extends AppCompatActivity implements BossListFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);

        // Instantiating instance of BossListFragment.  We're not currently using the BossDetailFragment
        // so it isn't being created in the Activity yet.
        BossListFragment bossListFragment = new BossListFragment();

        // This is a good step whenever using a Fragment that may be receviving data passed in from another
        // source.  Recall that the Intent class is used for messaging between different view controllers
        // in the Android Framework
        bossListFragment.setArguments(getIntent().getExtras());

        // In order to interact with Fragments, the SupportFragmentManager must be employed.  Activities
        // manage Fragment presentation through the use of transactions.  In the transaction below,
        // the calling Activityis adding a fragment to the view to be presented
        getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, bossListFragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        // for use if we need the Fragment to communicate back to the Activity
    }
}
