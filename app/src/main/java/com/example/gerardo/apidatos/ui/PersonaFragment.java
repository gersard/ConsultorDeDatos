package com.example.gerardo.apidatos.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gerardo.apidatos.R;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonaFragment extends Fragment {


    @Bind(R.id.txt_nombre)
    TextView txtNombre;
    @Bind(R.id.txt_pais)
    TextView txtPais;
    @Bind(R.id.txt_rut)
    TextView txtRut;
    @Bind(R.id.txt_edad)
    TextView txtEdad;
    @Bind(R.id.txt_sexo)
    TextView txtSexo;
    @Bind(R.id.txt_fecha_nacimiento)
    TextView txtFechaNacimiento;
    @Bind(R.id.txt_region)
    TextView txtRegion;
    @Bind(R.id.txt_provincia)
    TextView txtProvincia;
    @Bind(R.id.txt_comuna)
    TextView txtComuna;
    @Bind(R.id.txt_circunscripcion)
    TextView txtCircunscripcion;
    @Bind(R.id.txt_direccion)
    TextView txtDireccion;
    @Bind(R.id.cv_persona)
    CardView cardViewPersona;

    public PersonaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_persona, container, false);


        ButterKnife.bind(this, root);
//        cardViewPersona.setVisibility(View.GONE);

        MainActivity m = new MainActivity();
        m.setOnClickListenerBuscar(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA","FUNCIONO");
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }



}
