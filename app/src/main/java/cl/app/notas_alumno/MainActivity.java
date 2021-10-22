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
    private EditText TNota1;
    private EditText TNota2;
    private EditText TNota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TPName =(EditText)  findViewById(R.id.TPName);
        btCalcular=(Button) findViewById(R.id.btCalcular);

        TNota1 =(EditText)  findViewById(R.id.TNota1);
        TNota2 =(EditText)  findViewById(R.id.TNota2);
        TNota3 =(EditText)  findViewById(R.id.TNota3);


        Intent intentuno =new Intent(this,MainActivityDos.class);




        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentuno.putExtra("nombre", TPName.getText().toString());

                String numero1String = TNota1.getText().toString();
                String numero2String = TNota2.getText().toString();
                String numero3String = TNota3.getText().toString();

                if (numero1String.equals("") || numero2String.equals("") || numero3String.equals("")) {
                    return;
                }

                int nota1 = Integer.parseInt(numero1String);
                int nota2 = Integer.parseInt(numero2String);
                int nota3 = Integer.parseInt(numero3String);

                int promedio = nota1 + nota2 + nota3 / 3;

                intentuno.putExtra("promedio", promedio);

                startActivity(intentuno);

            }
        });


    }
}