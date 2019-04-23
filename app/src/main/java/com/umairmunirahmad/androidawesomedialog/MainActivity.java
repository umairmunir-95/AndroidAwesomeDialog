package com.umairmunirahmad.androidawesomedialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.umairmunirahmad.androidawesomedialoglibrary.AwesomeDialog;
import com.umairmunirahmad.androidawesomedialoglibrary.DialogManager;

public class MainActivity extends AppCompatActivity {

    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCheck=findViewById(R.id.btn_check);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogManager.showAwesomeDialog(
                        MainActivity.this,
                        new AwesomeDialog.AwesomeDialogBuilder(
                        1,"Hello body").
                        setHeaderColor(10).
                        build()
                );
            }
        });
    }
}
