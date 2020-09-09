package com.tabgreen;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import androidx.drawerlayout.widget.DrawerLayout;


/**
 * Created by Ishwar on 10-06-2019.
 */

public class SessionManager {

    private static final String PREF_NAME = "TabGreen";
    private static final String BEST = "isBest";
    private static String TAG = SessionManager.class.getSimpleName();

    Context _context;
    int PRIVATE_MODE = 0;
    SharedPreferences pref;
    SharedPreferences.Editor editor;


    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }



///////////////////////////////////////// set All data //////////////////////////////////////////////////////////




    public boolean setBestScore(int key) {
        editor.putInt(BEST, key);
        if (editor.commit()) {
            return true;
        }
        return false;
    }




    ///////////////////////////////////////get All Data /////////////////////////////////////////////////////////


    public Integer getBestScore() {
        return pref.getInt(BEST, 0);
    }

    /*--------------------------- Delete Record ---------------------------------------*/


    public boolean clearPreference() {
        editor.clear();
        editor.commit();
        Log.e(TAG, "Remove all data!");
        return true;
    }


}
