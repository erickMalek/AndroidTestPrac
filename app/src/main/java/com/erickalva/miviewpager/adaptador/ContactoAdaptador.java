package com.erickalva.miviewpager.adaptador;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.erickalva.miviewpager.DetalleContacto;
import com.erickalva.miviewpager.R;
import com.erickalva.miviewpager.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by Erick Alva on 01/03/2017.
 */

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoAdaptadorViewHolder>{
    ArrayList<Contacto>contactos;
    Activity activity;

    public ContactoAdaptador(ArrayList<Contacto>contactos,Activity activity){
        this.contactos=contactos;
        this.activity=activity;

    }
    @Override
    public ContactoAdaptadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_cardview,parent,false);
        //devolvemos un objeto inflando del cardview
        return new ContactoAdaptadorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactoAdaptadorViewHolder holder, int position) {

        final Contacto contacto=contactos.get(position);
        holder.imgContacto.setImageResource(contacto.getImgFoto());
        holder.tvNombreCv.setText(contacto.getNombre());
        holder.tvTelefonoCv.setText(contacto.getTelefono());
        holder.tvMailCv.setText(contacto.getMail());
        holder.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Le diste like a "+contacto.getNombre(),Toast.LENGTH_LONG).show();
                Intent i = new Intent(activity,DetalleContacto.class);
                i.putExtra(activity.getResources().getString(R.string.iFoto),contacto.getImgFoto());
                i.putExtra(activity.getResources().getString(R.string.iNombre),contacto.getNombre());
                i.putExtra(activity.getResources().getString(R.string.iTelefono),contacto.getTelefono());
                i.putExtra(activity.getResources().getString(R.string.iEmail),contacto.getMail());
                activity.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class ContactoAdaptadorViewHolder extends RecyclerView.ViewHolder{

        private ImageView   imgContacto,like;
        private TextView    tvNombreCv,tvTelefonoCv,tvMailCv;
        public ContactoAdaptadorViewHolder(View itemView) {
            super(itemView);

            imgContacto =(ImageView)itemView.findViewById(R.id.imgFoto);
            tvNombreCv=(TextView)itemView.findViewById(R.id.tvNombreCv);
            tvTelefonoCv=(TextView)itemView.findViewById(R.id.tvtelefonoCv);
            tvMailCv=(TextView)itemView.findViewById(R.id.tvMailCv);
            like=(ImageView)itemView.findViewById(R.id.like);

        }
    }
}
