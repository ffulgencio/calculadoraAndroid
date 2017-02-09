package com.example.francis.calculadoraandroid;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView txtResultado;
    Button btn1,btn2,btn3,btn4,btn5,btn6, btn7, btn8, btn9, btn0, btnLimpiar;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnIgual;
    public boolean punto=false;
    public String Texto ="";
    public double n1,n2;
    public Boolean operacionElegida = false;
    public String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnIgual =(Button) findViewById(R.id.btnIgual);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnLimpiar.setOnClickListener(this);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        //btn1.setOnClickListener(this);



    }

    public void Operar(String s){
        n1 = Double.valueOf(Texto);
        Texto ="";
        operacionElegida = true;
        operacion = s;
        txtResultado.setText("0");
    }

    @Override
    public void onClick(View v) {

        Button b = (Button) v;

        switch (v.getId()){

            case R.id.button :
                Texto = (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button2 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button3 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button4 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button5 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button6 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button7 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button8 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button9 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.button0 :
                Texto += (String) b.getText();
                txtResultado.setText(Texto);
                break;
            case R.id.btnLimpiar :
                Texto = "";
                txtResultado.setText("0");
                break;

            case R.id.btnIgual :
                n2 = Double.valueOf(Texto);
                Texto="";
                if (operacion.equals("+")) {

                    txtResultado.setText(String.valueOf(n1 + n2));
                    Toast.makeText(getApplicationContext(), "funciona", Toast.LENGTH_SHORT).show();
                }
                if (operacion.equals("-")) {
                    txtResultado.setText(String.valueOf(n1 - n2));
                }



                break;

            default:

                n1 = Double.valueOf(Texto);
                Texto="";
                txtResultado.setText("0");
                operacion =(String) b.getText();
                Toast.makeText(getApplicationContext(), operacion, Toast.LENGTH_SHORT).show();
                break;
        }



    }
}
