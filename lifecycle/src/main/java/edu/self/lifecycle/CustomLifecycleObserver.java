package edu.self.lifecycle;


import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class CustomLifecycleObserver implements LifecycleObserver {

    private static String TAG = "CustomLifecycleObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.d(TAG, "onCreate: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.d(TAG, "onDestroy: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAnyEvent() {
        Log.d(TAG, "onAnyEvent: ");
    }
}
