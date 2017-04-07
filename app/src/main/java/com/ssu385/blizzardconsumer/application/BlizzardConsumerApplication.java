package com.ssu385.blizzardconsumer.application;

import android.content.res.Resources;
import android.app.Application;

import com.ssu385.blizzardconsumer.R;

/**
 * Created by Snore Train on 4/5/2017.
 */

public class BlizzardConsumerApplication extends Application {

    private static BlizzardConsumerApplication applicationInstance;
    private String locale;
    private String apiKey;
    private String bossRouteExtension;
    private String petsRouteExtension;
    private String zoneRouteExtension;
    private String mountRouteExtension;
    private String baseApiUrl;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationInstance = this;
        init();
    }
    public static BlizzardConsumerApplication getApplicationInstance(){
        return applicationInstance;
    }
    public void init(){
        Resources res = getResources();
        locale = res.getString(R.string.locale);
        apiKey = res.getString(R.string.api_key);
        bossRouteExtension = res.getString(R.string.boss_route_extension);
        petsRouteExtension = res.getString(R.string.pets_route_extension);
        zoneRouteExtension = res.getString(R.string.zone_route_extension);
        mountRouteExtension = res.getString(R.string.mount_route_extension);

        baseApiUrl = res.getString(R.string.base_api_url);
    }

    public String getLocale() {
        return locale;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getBossRouteExtension() {
        return bossRouteExtension;
    }

    public String getBaseApiUrl() {
        return baseApiUrl;
    }

    public String getPetsRouteExtension() {
        return petsRouteExtension;
    }

    public String getZoneRouteExtension() {
        return zoneRouteExtension;
    }

    public String getMountRouteExtension() {
        return mountRouteExtension;
    }
}
