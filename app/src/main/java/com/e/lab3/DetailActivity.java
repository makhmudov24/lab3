package com.e.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView detail;
    private static final int DEFAULT_POSITION = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detail = (TextView) findViewById(R.id.tv_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra("ARG_ITEM_ID", DEFAULT_POSITION);

        System.out.println(position);
        detail.setText(DummyContent.ITEMS.get(position).details);
    }
}
