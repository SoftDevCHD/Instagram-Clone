package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fOGeNrDWdnlicysEvXITCy2YqvqbMxSnnNj6X9Jg")
                .clientKey("vTSZ8vKvczQE7m1awyPI9qtwoS4WzN82V7kmF3zR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}