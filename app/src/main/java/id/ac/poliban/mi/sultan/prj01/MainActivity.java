package id.ac.poliban.mi.sultan.prj01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextNama;
    TextView Hasil;
    TextView tvSalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = findViewById(R.id.TxtNama);
        Hasil = findViewById(R.id.Lbl_Nama);
        tvSalam = findViewById(R.id.tvSalam);

    }

    @SuppressLint("SetTextI18n")
    public void TampilNama(View view){
        Hasil.setText("Nama Anda : "+TextNama.getText());
        tvSalam.setText(String.format("Hi %s", TextNama.getText().toString()));
    }
}


