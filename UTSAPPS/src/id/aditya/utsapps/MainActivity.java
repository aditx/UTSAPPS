package id.aditya.utsapps;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText edtNama, edtAlamat, edtKTP, edtEmail, edtHP, edtTempatLahir;
	private Spinner spinSeminar, spinSex, spinSize;
	private Button btn_register, btn_DatePicker;
	private String strSeminar, strSex, strSize, strDate, strNama, strAlamat, strKTP, strEmail, strHP, strTempatLahir;
	
	Calendar calendar ;
    DatePickerDialog datePickerDialog ;
    int Year, Month, Day ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		calendar = Calendar.getInstance();

        Year = calendar.get(Calendar.YEAR) ;
        Month = calendar.get(Calendar.MONTH);
        Day = calendar.get(Calendar.DAY_OF_MONTH);
		
		edtNama = (EditText) findViewById(R.id.edtNama);
		edtAlamat = (EditText) findViewById(R.id.edtAlamat);
		edtKTP = (EditText) findViewById(R.id.edtKTP);
		edtEmail = (EditText) findViewById(R.id.edtEmail);
		edtHP = (EditText) findViewById(R.id.edtHP);
		edtTempatLahir = (EditText) findViewById(R.id.edtTempatLahir);
		
		spinSeminar = (Spinner) findViewById(R.id.spinSeminar);
		spinSeminar.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				strSeminar = parent.getItemAtPosition(position).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		spinSex = (Spinner) findViewById(R.id.spinSex);
		spinSex.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				strSex= parent.getItemAtPosition(position).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		spinSize = (Spinner) findViewById(R.id.spinSize);
		spinSize.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				strSize = parent.getItemAtPosition(position).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btn_DatePicker = (Button) findViewById(R.id.btn_DatePicker);
		btn_DatePicker.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        
		        datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
						// TODO Auto-generated method stub
//						if (view.isShown()) {
//					    }
						strDate = dayOfMonth + "-" + (monthOfYear+1) + "-" + year;
						
				        Toast.makeText(MainActivity.this, "Tanggal terpilih : " + strDate, Toast.LENGTH_SHORT).show();
					}
				}, Year, Month, Day);

                datePickerDialog.setTitle("Pilih Tanggal Lahir");

                datePickerDialog.show();
			}
		});
		
		btn_register = (Button) findViewById(R.id.btn_register);
		btn_register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				getData();
			}
		});
	}
	
	private void getData() {
		strNama = edtNama.getText().toString();
		strAlamat = edtAlamat.getText().toString();
		strKTP = edtKTP.getText().toString();
		strEmail = edtEmail.getText().toString();
		strHP = edtHP.getText().toString();
		strTempatLahir = edtTempatLahir.getText().toString();
		
		Intent i_intent = new Intent(MainActivity.this, RegisterActivity.class);
		i_intent.putExtra("strNama", strNama);
		i_intent.putExtra("strAlamat", strAlamat);
		i_intent.putExtra("strKTP", strKTP);
		i_intent.putExtra("strEmail", strEmail);
		i_intent.putExtra("strHP", strHP);
		i_intent.putExtra("strTempatLahir", strTempatLahir);
		i_intent.putExtra("strSeminar", strSeminar);
		i_intent.putExtra("strSex", strSex);
		i_intent.putExtra("strSize", strSize);
		i_intent.putExtra("strDate", strDate);
		startActivity(i_intent);
	}

	
}
