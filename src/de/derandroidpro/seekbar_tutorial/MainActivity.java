package de.derandroidpro.seekbar_tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	public SeekBar sb1;
	public TextView tv1;
	
	int sbvalue;
	int sbmax = 150;
	int sbstart = 45;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sb1 = (SeekBar) findViewById(R.id.seekBar1);
		tv1 = (TextView) findViewById(R.id.textView1);
		
		sb1.setMax(sbmax);
		sb1.setProgress(sbstart);
		tv1.setText(Integer.toString(sbstart));
		sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				
				sbvalue = sb1.getProgress();
				tv1.setText(Integer.toString(sbvalue));
				
				
			}
		});
	}


}
