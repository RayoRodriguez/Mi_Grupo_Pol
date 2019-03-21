package com.example.mi_grupo_pol;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        texto = (TextView) findViewById (R.id.txtUsuarioLogin);
        texto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"Ing. Rayo Abraham Rodriguez Almanza", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }


}
