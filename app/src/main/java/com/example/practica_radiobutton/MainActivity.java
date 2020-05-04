package com.example.practica_radiobutton;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1, et_valor2;
    private RadioButton rb_suma, rb_resta, rb_mult, rb_div;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = (EditText)findViewById(R.id.txt_valor1);
        et_valor2 = (EditText)findViewById(R.id.txt_valor2);
        rb_suma = (RadioButton)findViewById(R.id.rb_suma);
        rb_resta =(RadioButton)findViewById(R.id.rb_resta);
        rb_mult =(RadioButton)findViewById(R.id.rb_producto);
        rb_div =(RadioButton)findViewById(R.id.rb_division);
        tv_resultado =(TextView)findViewById(R.id.tv_resultado);

    }

    //Método para el botón

    public void Calcular(View view) {
        String valor1_String =et_valor1.getText().toString();
        String valor2_String =et_valor2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        //Verificando si la opción es suma
        if(rb_suma.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv_resultado.setText(resultado);

            //Verificando si la opción es resta
        }else if (rb_resta.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv_resultado.setText(resultado);

            //Verificando si la opción es multiplicación
        }else if (rb_mult.isChecked() == true){
            int mult = valor1_int * valor2_int;
            String resultado = String.valueOf(mult);
            tv_resultado.setText(resultado);

            //Verificando si la opción es división
        }else if(rb_div.isChecked() == true){

            //Validando si el valor 2 es cero
            if(valor2_int != 0){
                int division = valor1_int / valor2_int;
                String resultado = String.valueOf(division);
                tv_resultado.setText(resultado);
            } else{
                Toast.makeText( this,"El segundo valor debe ser diferente de cero", LENGTH_LONG).show();

            }


         }



    } // fin de llave del método calcular
}   // fin del main