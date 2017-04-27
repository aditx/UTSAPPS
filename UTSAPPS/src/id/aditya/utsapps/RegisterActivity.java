package id.aditya.utsapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class RegisterActivity extends Activity {
	
	private TextView txtNama, txtAlamat, txtKTP, txtEmail, txtHP, txtTempatLahir, txtSeminar, txtSex, txtSize, txtDate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		txtNama = (TextView) findViewById(R.id.txtNama);
		txtAlamat = (TextView) findViewById(R.id.txtAlamat);
		txtKTP = (TextView) findViewById(R.id.txtKTP);
		txtEmail = (TextView) findViewById(R.id.txtEmail);
		txtHP = (TextView) findViewById(R.id.txtNoTelp);
		txtSeminar = (TextView) findViewById(R.id.txtSeminar);
		txtSex = (TextView) findViewById(R.id.txtSex);
		txtSize = (TextView) findViewById(R.id.txtUkuranKaos);
		txtDate = (TextView) findViewById(R.id.txtTglLahir);
		txtTempatLahir = (TextView) findViewById(R.id.txtTmptLahir);
		
		txtNama.setText(getIntent().getExtras().getString("strNama"));
		txtAlamat.setText(getIntent().getExtras().getString("strAlamat"));
		txtKTP.setText(getIntent().getExtras().getString("strKTP"));
		txtEmail.setText(getIntent().getExtras().getString("strEmail"));
		txtHP.setText(getIntent().getExtras().getString("strHP"));
		txtSex.setText(getIntent().getExtras().getString("strSex"));
		txtSize.setText(getIntent().getExtras().getString("strSize"));
		txtDate.setText(getIntent().getExtras().getString("strDate"));
		txtTempatLahir.setText(getIntent().getExtras().getString("strTempatLahir"));
		txtSeminar.setText(getIntent().getExtras().getString("strSeminar"));
	}
}
