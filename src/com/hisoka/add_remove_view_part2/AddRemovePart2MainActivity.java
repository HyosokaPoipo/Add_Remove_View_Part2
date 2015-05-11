package com.hisoka.add_remove_view_part2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddRemovePart2MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_remove_part2_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_remove_part2_main, menu);
		return true;
	}

}
