package com.example.hour6apptest;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;


public class ProgressActivity extends Activity {
    ProgressBar mProgressBar;
	ProgressBar mHorizontalProgressBar;
	SeekBar mSeekBar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        mProgressBar=(ProgressBar)findViewById(R.id.progressBar1);
        mProgressBar.setVisibility(View.INVISIBLE);
        mHorizontalProgressBar=(ProgressBar)findViewById(R.id.progressBar2);
        mSeekBar=(SeekBar)findViewById(R.id.seekBar1);
        mSeekBar.setMax(100);
        
        ShowProgressTask showTask=new ShowProgressTask();
        showTask.execute();
    }
    
    
    
    
    
    private class ShowProgressTask extends AsyncTask<Void, Integer, Integer>{
    	
    	@Override
    	protected void onPreExecute(){
    		mProgressBar.setVisibility(View.VISIBLE);
    	}
    	@Override
    	protected Integer doInBackground(Void...params){
    		for(int i=0;i<=100;i++){
    			try{
    				Thread.sleep(100);
    				publishProgress(i);
    			}catch(InterruptedException e){
    				return -1;
    			}
    		}
    		return 100;
    	}
    	@Override
    	protected void onProgressUpdate(Integer...progess){
    		int progress = progess[0];
    		mHorizontalProgressBar.setProgress(progress);
    		mSeekBar.setProgress(progress);

    	}
    	
    	@Override
    	protected void onPostExecute(Integer result){
    		mProgressBar.setVisibility(View.INVISIBLE);
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


}