package cl.app.notas_alumno;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityDos extends AppCompatActivity  {

        private Button btVolver;
        private String TPName="";
        private TextView TxName;
        private TextView TxNotaF;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main_dos);
                btVolver =(Button)  findViewById(R.id.btVolver);
                TxName=(TextView)  findViewById(R.id.TxName);
                Intent intent =new Intent(this, MainActivity.class);


                Context context=getApplicationContext();
                Bundle intentE= this.getIntent().getExtras();
                if (intentE!=null){

                        TPName = intentE.getString("nombre");
                        Toast.makeText(context, ""+TPName, Toast.LENGTH_SHORT).show();

                }

;                TxName.setText("" +TPName);
                int PromedioTotal = intent.getIntExtra("promedio", 0);
                TxNotaF = (TextView) findViewById(R.id.TxNotaF);

                String mensaje = "" + PromedioTotal;

                TxNotaF.setText (mensaje);

                btVolver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                startActivity(intent);
                        }
                });

        }
}
