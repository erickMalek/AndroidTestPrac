package com.erickalva.miviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    ImageView imgFotoDetalle;
    TextView nombreDetalle,telefonoDetalle,mailDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros=getIntent().getExtras();
        Integer imagen=parametros.getInt(getResources().getString(R.string.iFoto));
        String  nombre=parametros.getString(getResources().getString(R.string.iNombre));
        String  telefono=parametros.getString(getResources().getString(R.string.iTelefono));
        String email=parametros.getString(getResources().getString(R.string.iEmail));

        imgFotoDetalle=(ImageView)findViewById(R.id.ImgFotoDetalle);
        nombreDetalle=(TextView)findViewById(R.id.tvNombreDetalle);
        telefonoDetalle=(TextView)findViewById(R.id.tvTelefonoDetalle);
        mailDetalle=(TextView)findViewById(R.id.tvMailDetalle);

        imgFotoDetalle.setImageResource(imagen);
        nombreDetalle.setText(nombre);
        telefonoDetalle.setText(telefono);
        mailDetalle.setText(email);

    }
}
