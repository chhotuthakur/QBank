package com.nileshsdahiya.qbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    //initializig variable
    ScrollView scrollView;
    Button button;
    EditText edq,eda,edb,edc,edd,edr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//calling layout elements with variables
        scrollView = (ScrollView)findViewById(R.id.parent_scroll);
        button =(Button) findViewById(R.id.btn_submit);
        edq =(EditText) findViewById(R.id.edq);
        eda =(EditText) findViewById(R.id.eda);
        edb =(EditText) findViewById(R.id.edb);
        edc =(EditText) findViewById(R.id.edc);
        edd =(EditText) findViewById(R.id.edd);
        edr =(EditText) findViewById(R.id.edr);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
    }
}