package com.umairmunirahmad.androidawesomedialoglibrary;

import com.umairmunirahmad.androidawesomedialoglibrary.AwesomeDialog;

import android.app.Activity;
import android.content.Context;

public class DialogManager {

    public static void showAwesomeDialog(final Context context, final AwesomeDialog awesomeDialog)
    {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {

                ToastManager.showToast(context,"Body Text : "+awesomeDialog.getBodyText());
                ToastManager.showToast(context,"Header Color : "+awesomeDialog.getHeaderColor());
                ToastManager.showToast(context,"Header Icon : "+awesomeDialog.getHeaderIcon());
            }
        });
    }
}
