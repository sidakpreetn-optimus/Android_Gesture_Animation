package com.example.motiondemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button button1, button2, button3, button4, button5, button6, button7,
			button8, button9, button10;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Animation objects from xml
		final Animation anim1 = AnimationUtils.loadAnimation(this,
				R.anim.anim_1);
		final Animation anim2 = AnimationUtils.loadAnimation(this,
				R.anim.anim_2);
		final Animation anim3 = AnimationUtils.loadAnimation(this,
				R.anim.anim_3);
		final Animation anim4 = AnimationUtils.loadAnimation(this,
				R.anim.anim_4);
		final Animation anim5 = AnimationUtils.loadAnimation(this,
				R.anim.anim_5);
		final Animation anim6 = AnimationUtils.loadAnimation(this,
				R.anim.anim_6);
		final Animation anim7 = AnimationUtils.loadAnimation(this,
				R.anim.anim_7);
		final Animation anim8 = AnimationUtils.loadAnimation(this,
				R.anim.anim_8);
		final Animation anim9 = AnimationUtils.loadAnimation(this,
				R.anim.anim_9);
		final Animation anim10 = AnimationUtils.loadAnimation(this,
				R.anim.anim_10);

		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);

		//setting all buttons to an animation on click
		button1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button1.startAnimation(anim1);
			}
		});

		button2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button2.startAnimation(anim2);
			}
		});

		button3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button3.startAnimation(anim3);
			}
		});

		button4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button4.startAnimation(anim4);
			}
		});

		button5.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button5.startAnimation(anim5);
			}
		});

		button6.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button6.startAnimation(anim6);
			}
		});

		button7.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button7.startAnimation(anim7);
			}
		});

		button8.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button8.startAnimation(anim8);
			}
		});

		button9.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button9.startAnimation(anim9);
			}
		});

		button10.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				button10.startAnimation(anim10);
			}
		});

	}

	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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
