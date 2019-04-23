package com.umairmunirahmad.androidawesomedialoglibrary;

import com.umairmunirahmad.androidawesomedialoglibrary.AwesomeDialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DialogManager {

    public static void showAwesomeDialog(final Context context, final AwesomeDialog awesomeDialog)
    {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {

//                ToastManager.showToast(context,"Body Text : "+awesomeDialog.getBodyText());
//                ToastManager.showToast(context,"Header Color : "+awesomeDialog.getHeaderColor());
//                ToastManager.showToast(context,"Header Icon : "+awesomeDialog.getHeaderIcon());



                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.custom_alert_dialog, null);
                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setView(promptsView);
                final AlertDialog alertDialog = alertDialogBuilder.create();
                LinearLayout llHeader=promptsView.findViewById(R.id.ll_header);
                ImageView ivHeader = promptsView.findViewById(R.id.iv_close);
                TextView tvHeader = promptsView.findViewById(R.id.tv_header_title);
                TextView tvBody = promptsView.findViewById(R.id.tv_body);
                Button btnNo = promptsView.findViewById(R.id.btn_no);
                Button btnYes = promptsView.findViewById(R.id.btn_yes);
                btnNo.setVisibility(View.GONE);
                btnYes.setVisibility(View.GONE);
                tvHeader.setVisibility(View.GONE);
                ivHeader.setVisibility(View.VISIBLE);
                tvBody.setVisibility(View.VISIBLE);

                ivHeader.setImageResource(awesomeDialog.getHeaderIcon());
                tvBody.setText(awesomeDialog.getBodyText());


                llHeader.setBackgroundColor(awesomeDialog.getHeaderColor()==0?ColorManager.fetchPrimaryColor(context):awesomeDialog.getHeaderColor());
                alertDialogBuilder.setCancelable(awesomeDialog.isCancelable()==false?false:awesomeDialog.cancelable);

                alertDialog.show();
            }
        });
    }
}
