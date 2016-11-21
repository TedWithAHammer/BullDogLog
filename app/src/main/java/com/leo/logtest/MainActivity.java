package com.leo.logtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.leo.bulldoglog.BLog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etLogContent;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflateWidget();
    }

    private void inflateWidget() {
        etLogContent = (EditText) findViewById(R.id.etLogContent);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSend) {
            BLog.i(TextUtils.isEmpty(etLogContent.getText()) ? "null" : etLogContent.getText().toString());
        }
    }
}
