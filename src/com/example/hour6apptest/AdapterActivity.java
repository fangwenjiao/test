package com.example.hour6apptest;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class AdapterActivity extends Activity {
    String[] values={"one","two","three","one hundred","one thousand"};
    Spinner mSpinner;
	AutoCompleteTextView mAutoCompleteTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapters);

        mSpinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,values);
        mSpinner.setAdapter(spinnerAdapter);
        String selected=(String)mSpinner.getSelectedItem();
       
        
        mAutoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> textAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,values);
        mAutoCompleteTextView.setAdapter(textAdapter);
        Editable selected_1=mAutoCompleteTextView.getText();
        
        TextView textView=(TextView)findViewById(R.id.textView1);
        textView.setText(selected_1);
        
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), (String)mSpinner.getSelectedItem()+" "+mAutoCompleteTextView.getText(), Toast.LENGTH_LONG).show();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}