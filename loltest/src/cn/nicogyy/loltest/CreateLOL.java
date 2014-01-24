package cn.nicogyy.loltest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateLOL extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creatlol);
	}
	public void onClick(View view) {
		Intent data=new Intent();
		EditText txt_time=(EditText)findViewById(R.id.txt_time);
		data.setData(Uri.parse(txt_time.getText().toString()));
//		data.setData(Uri.parse("Hello"));
		setResult(RESULT_OK,data);
		finish();
	}

}
