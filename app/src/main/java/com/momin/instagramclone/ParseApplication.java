package com.momin.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1OETOfwnQI2hJTeVpOzOfmNdzJ8UhBXuN1kMlAdN")
                .clientKey("4PUDUYhw9JBY7HcEzU7NwlPISM27vRltpH0tj3vg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
