package com.example.aria_nazaralizadeh.meditation;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Elnur Hajiyev on 3/7/2018.
 */

public class CustomIntent {
    public static String[] types = {
            "",
            "",
            
    };

    public static void customType(Context context, String animtype){
        Activity act = (Activity)context;
        act.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
