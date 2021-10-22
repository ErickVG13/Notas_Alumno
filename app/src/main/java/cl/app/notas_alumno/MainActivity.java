package cl.app.notas_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btCalcular;
    private EditText TPName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TPName =(EditText)  findViewById(R.id.TPName);
        btCalcular=(Button) findViewById(R.id.btCalcular);

        Intent intentuno =new Intent(this,MainActivityDos.class);




        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentuno.putExtra("nombre", TPName.getText().toString());
                startActivity(intentuno);

            }
        });


    }
}