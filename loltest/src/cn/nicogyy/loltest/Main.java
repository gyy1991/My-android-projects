package cn.nicogyy.loltest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {
	int request_Code=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		CreatMenu(menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return MenuChoice(item);
	}
	private void CreatMenu(Menu menu)
	{
		MenuItem mnu1=menu.add(0, 0, 0, "创建活动");
		{
			mnu1.setIcon(R.drawable.ic_launcher);
			mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM|MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		}
	}
	private boolean MenuChoice(MenuItem item)
	{
		switch (item.getItemId()) {
		case 0:
			startActivityForResult(new Intent(this,CreateLOL.class),request_Code);
			return true;
		}
		return false;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		TextView textView=(TextView)findViewById(R.id.textView1);// TODO Auto-generated method stub
		if(requestCode==request_Code){
			if(resultCode==RESULT_OK){
//				Toast.makeText(this, data1.getData().toString(), Toast.LENGTH_SHORT).show();
				textView.setText(data.getData().toString());
			}
			
		}
	}
	

}
