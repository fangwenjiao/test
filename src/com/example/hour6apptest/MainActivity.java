package com.example.hour6apptest;





import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showFromButton=(Button)findViewById(R.id.button1);
        showFromButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,FormControlActivity.class);
				startActivity(intent);
			}
		});
        
        Button showAdapterButton =  (Button)findViewById(R.id.button2);
        showAdapterButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent(MainActivity.this, AdapterActivity.class);
            	startActivity(intent);           	
            }
        });
        
        Button showProgressButton =  (Button)findViewById(R.id.button3);
        showProgressButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent(MainActivity.this, ProgressActivity.class);
            	startActivity(intent);           	
            }
        });
        
        Button showImageViewButton =  (Button)findViewById(R.id.button4);
        showImageViewButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent(MainActivity.this, ImageActivity.class);
            	startActivity(intent);           	
            }
        });
        
        
        
        
        
        
        
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
