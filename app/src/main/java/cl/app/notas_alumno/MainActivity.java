package cl.app.notas_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText TPName, TPCarrera;
    private EditText TNota1, TNota2, TNota3;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TPName=(EditText) findViewById(R.id.TPName);
        TPCarrera=(EditText)  findViewById(R.id.TPCarrera);
        TNota1=(EditText)  findViewById(R.id.TNota1);
        TNota2=(EditText)  findViewById(R.id.TNota2);
        TNota3=(EditText)  findViewById(R.id.TNota3);
        btCalcular=(Button)  findViewById(R.id.btCalcular);

        Context contect=getApplicationContext();

        Intent intentuno =new Intent(this, MainActivityN2.class);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentuno.putExtra("Nombre", TPName.getText().toString());
                intentuno.putExtra("Nota 1", TNota1.getText().toString());
                intentuno.putExtra("Nota 2", TNota2.getText().toString());
                intentuno.putExtra("Nota 3", TNota3.getText().toString());
                startActivity(intentuno)

            }
        })


    }
}