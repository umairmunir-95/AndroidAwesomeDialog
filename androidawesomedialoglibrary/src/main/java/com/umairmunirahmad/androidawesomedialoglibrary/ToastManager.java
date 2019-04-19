package com.umairmunirahmad.androidawesomedialoglibrary;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ToastManager {

    public static void showToast(final Context context, final String message, boolean runOnUiThread)
    {
        if (runOnUiThread)
        {
            ((Activity) context).runOnUiThread(new Runnable()
            {
                @Override
                public void run()
                {
                    Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                }
            });
        }
        else
            {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }
}
