package com.example.hour6apptest;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FormControlActivity extends Activity {
	Drawable mIcon;
    Drawable mSkateboardIcon;
    Button swapButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_control);

        mIcon=getResources().getDrawable(R.drawable.ic_launcher);
        mSkateboardIcon=getResources().getDrawable(R.drawable.robot_skateboarding);
        swapButton=(Button)findViewById(R.id.button2);
        swapButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(swapButton.getText().equals("Button")){
					swapButton.setText("SkateBoard");
					swapButton.setCompoundDrawablesWithIntrinsicBounds(mSkateboardIcon, null, null, null);

				}else{
					swapButton.setText("Button");
					swapButton.setCompoundDrawablesWithIntrinsicBounds(mIcon, null, null, null);
					
				}
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