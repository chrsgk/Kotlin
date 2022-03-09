package com.example.myfirstapplicationkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var texto: TextView? = null
    var textoEditar: EditText? = null
    var boton: Button? = null
    var botonToast: Button? = null
    var changeActivity: Button? = null
    var edad = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton: Button = findViewById(R.id.boton) as Button
        val botonToast: Button = findViewById(R.id.toast) as Button
        val changeActivity: Button = findViewById(R.id.buttonChange) as Button
        val llamar: Button = findViewById(R.id.llamar)
        val sms: Button = findViewById(R.id.sms)



        boton.setOnClickListener(this);
        botonToast.setOnClickListener(this);
        changeActivity.setOnClickListener(this);
    }

    override fun onClick(v: View) {
        val texto: TextView =  findViewById(R.id.text) as TextView
        val textoEditar:EditText= findViewById(R.id.editar) as EditText

        when  (v.id){
            R.id.boton->{
                var textFromUser:String = textoEditar.text.toString()
                texto.setText(textFromUser)
            }
            R.id.toast->{
                Toast.makeText(this, "I'm a Toast from Kotlin", Toast.LENGTH_LONG).show()

            }
            R.id.buttonChange -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.llamar->{
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:" +34615916610)
                startActivity(dialIntent)
            }
            R.id.sms ->{
                val msg = Uri.parse("smsto:+34615916610")
                val firstSMS = Intent(Intent.ACTION_SENDTO, msg)
                firstSMS.putExtra("subject", "SOS")
                firstSMS.putExtra("sms_body", "Help please")
                startActivity(firstSMS)
            }
        }


        /* EXAMPLE USING SWITCH
        switch (v.getId()){
            case R.id.boton:
                //Actions to execute if the user clicks on the button called "boton".
                String textFromUser = textoEditar.getText().toString();
                texto.setText(textFromUser);
                break;
            case R.id.toast:
                //Actions to execute if the user clicks on my button called "toast
                Toast.makeText(MainActivity.this, "I'm a TOAST", Toast.LENGTH_LONG).show();
                break;
        }*/

    }
}