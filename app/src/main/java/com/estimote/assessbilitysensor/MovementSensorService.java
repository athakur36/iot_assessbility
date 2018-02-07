package com.estimote.assessbilitysensor;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MovementSensorService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }
}
