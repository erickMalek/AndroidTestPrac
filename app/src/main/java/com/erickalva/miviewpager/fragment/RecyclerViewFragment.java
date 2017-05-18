package com.erickalva.miviewpager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erickalva.miviewpager.R;
import com.erickalva.miviewpager.adaptador.ContactoAdaptador;
import com.erickalva.miviewpager.pojo.Contacto;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {
   private RecyclerView rvContactos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_recycler_view, container, false);
        rvContactos=(RecyclerView)v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);
        inicializarContactos();
        inicializarAdaptador();
        // Inflate the layout for this fragment
        return v;
    }

   private ArrayList<Contacto> contactos;
    public void inicializarContactos(){
        contactos=new ArrayList<>();

        contactos.add(new Contacto(R.drawable.user_female_96,"Guadalupe Alva","33334444","guadalupe@gmail.com"));
        contactos.add(new Contacto(R.drawable.user_male_96,"Erick Alva","33334444","erick@gmail.com"));
        contactos.add(new Contacto(R.drawable.user_female_skin_type_4_96,"Rosita Cortez","33334444","rosita@gmail.com"));
        contactos.add(new Contacto(R.drawable.user_male_skin_type_5_96,"David Alva","33334444","david@gmail"));
    }

    private ContactoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador=new ContactoAdaptador(contactos,getActivity());
        rvContactos.setAdapter(adaptador);


    }

}
