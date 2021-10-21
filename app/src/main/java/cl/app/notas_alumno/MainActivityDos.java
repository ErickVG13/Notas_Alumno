package cl.app.notas_alumno;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityDos extends AppCompatActivity  {

        private TextView TxName;
        private TextView TxNotaF;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main_dos);

                TxName = (TextView)  findViewById(R.id.TxName);
                TxNotaF = (TextView)  findViewById(R.id.TxNotaF);

                Intent intent = new Intent(this,MainActivity.class );

                Context context=getApplicationContext();
                Bundle intent
                Bundle intentE =this.getIntent().getExtras();
                if (intentE!=null){

                        TPName=intentE.getString("");
                        Toast.makeText(contect, "Su nombre es"+TPName, Toast.LENGTH_SHORT).show();
                } 

        }
}
