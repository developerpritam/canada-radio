// package com.canadaradioapp;

// import android.widget.Toast;
// import android.util.Log;

// import com.facebook.react.bridge.NativeModule;
// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;
// import com.facebook.react.bridge.ReactMethod;
// import java.util.Map;
// import java.util.HashMap;

// public class HelloWorldModule extends ReactContextBaseJavaModule {
// private static ReactApplicationContext reactContext;

//    HelloWorldModule(ReactApplicationContext context) {
//        super(context);
//        reactContext = context; 
//        // ^^^ this is custom
//    }

//     // add to CalendarModule.java
//     @Override
//     public String getName() {
//     return "HelloWorldModule";
//     }

//     @ReactMethod
//     public void ShowMessage(String message, int duration) {
//         Log.d("HELLO_WORLD_MODULE", message);
//         Toast.makeText(getReactApplicationContext(), message, duration).show();
        
//     }


// }
