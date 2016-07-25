package com.example.sam.ch05_ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ch05_ex3 extends AppCompatActivity {
    private EditText edit;
    private Spinner spin;
    private TextView textshow;
    private String edu[]={"博士","碩士","大學","高中"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch05_ex3);

        edit=(EditText)findViewById(R.id.editText);
        textshow=(TextView)findViewById(R.id.textView3);
        spin=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> adapterEdu=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,edu);
        adapterEdu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapterEdu);
        spin.setOnItemSelectedListener(spinerListener);
    }

    private Spinner.OnItemSelectedListener spinerListener=new Spinner.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View v,int position,long id){
            String st=parent.getSelectedItem().toString();
            textshow.setText(edit.getText()+"  學歷為:  "+st);
        }
        @Override
        public void onNothingSelected(AdapterView<?> parent){
            //
        }
    };
}
