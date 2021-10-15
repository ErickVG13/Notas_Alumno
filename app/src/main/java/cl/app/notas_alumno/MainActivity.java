package cl.app.notas_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText TPName, TPCarrera;
    private EditText TNota1, TNota2, TNota3;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TPName=(EditText) findViewById(R.id.TPName);
        TPCarrera=(EditText)  findViewById(R.id.TPCarrera);
        TNota1=(EditText)  findViewById(R.id.TNota1);
        TNota2=(EditText)  findViewById(R.id.TNota2);
        TNota3=(EditText)  findViewById(R.id.TNota3);
        btnCalcular=(Button)  findViewById(R.id.btnCalcular);




    }
}