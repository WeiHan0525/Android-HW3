package com.example.weihan.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetNameActivity extends AppCompatActivity {

    private Button btnBack;
    private EditText textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_name);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnBack = (Button) findViewById(R.id.btn_back);
        textName = (EditText) findViewById(R.id.textName);

        btnBack.setOnClickListener(back);
    }

    private View.OnClickListener back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = textName.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("name", name);

            setResult(RESULT_OK, intent);
            finish();
        }
    };

}
