package com.example.diegoorozco.bocolotes;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BocolotesFragment extends Fragment {



    public BocolotesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View inputfragment=inflater.inflate(R.layout.fragment_bocolotes,container,false);

        Button Crepe1=(Button)inputfragment.findViewById(R.id.bCrepe1);
        Button Crepe2=(Button)inputfragment.findViewById(R.id.bCrepe2);
        Button Crepe3=(Button)inputfragment.findViewById(R.id.bCrepe3);
        Button Crepe4=(Button)inputfragment.findViewById(R.id.bCrepe4);

        Button Pedido=(Button)inputfragment.findViewById(R.id.Bpedido);

        final RadioButton R1=(RadioButton) inputfragment.findViewById(R.id.r1);
        R1.setChecked(true);
        final RadioButton R2=(RadioButton) inputfragment.findViewById(R.id.r2);
        final RadioButton R3=(RadioButton) inputfragment.findViewById(R.id.r3);
        final RadioButton R4=(RadioButton) inputfragment.findViewById(R.id.r4);
        final RadioButton R5=(RadioButton) inputfragment.findViewById(R.id.r5);
        final RadioButton R6=(RadioButton) inputfragment.findViewById(R.id.r6);
        final RadioButton R7=(RadioButton) inputfragment.findViewById(R.id.r7);

        final SharedPreferences ajustes= getActivity().getSharedPreferences("CANTIDADES", 0);
        final SharedPreferences.Editor editor= ajustes.edit();


        Crepe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=1;
                int ICantCrepes1 = ajustes.getInt("cantidadCrepe1", 0);
                if(R1.isChecked())
                    num=1;
                if(R2.isChecked())
                    num=2;
                if(R3.isChecked())
                    num=3;
                if(R4.isChecked())
                    num=4;
                if(R5.isChecked())
                    num=5;
                if(R6.isChecked())
                    num=6;
                if(R7.isChecked())
                    num=7;
                int Cantidad=ICantCrepes1+ num;
                editor.putInt("cantidadCrepe1", Cantidad);
                editor.apply();
                R1.setChecked(true);
                Toast.makeText(getActivity(),"Has regsitrado "+String.valueOf(num)+" Creps 1",Toast.LENGTH_SHORT).show();
            }
        });

        Crepe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=1;
                int ICantCrepes2 = ajustes.getInt("cantidadCrepe2", 0);
                if(R1.isChecked())
                    num=1;
                if(R2.isChecked())
                    num=2;
                if(R3.isChecked())
                    num=3;
                if(R4.isChecked())
                    num=4;
                if(R5.isChecked())
                    num=5;
                if(R6.isChecked())
                    num=6;
                if(R7.isChecked())
                    num=7;
                int Cantidad=ICantCrepes2+ num;
                editor.putInt("cantidadCrepe2", Cantidad);
                editor.apply();
                R1.setChecked(true);
                Toast.makeText(getActivity(),"Has regsitrado "+String.valueOf(num)+" Creps 2",Toast.LENGTH_SHORT).show();
            }
        });

        Crepe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=1;
                int ICantCrepes3 = ajustes.getInt("cantidadCrepe3", 0);
                if(R1.isChecked())
                    num=1;
                if(R2.isChecked())
                    num=2;
                if(R3.isChecked())
                    num=3;
                if(R4.isChecked())
                    num=4;
                if(R5.isChecked())
                    num=5;
                if(R6.isChecked())
                    num=6;
                if(R7.isChecked())
                    num=7;
                int Cantidad=ICantCrepes3+ num;
                editor.putInt("cantidadCrepe3", Cantidad);
                editor.apply();
                R1.setChecked(true);
                Toast.makeText(getActivity(),"Has regsitrado "+String.valueOf(num)+" Creps 3",Toast.LENGTH_SHORT).show();
            }
        });

        Crepe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=1;
                int ICantCrepes4 = ajustes.getInt("cantidadCrepe4", 0);
                if(R1.isChecked())
                    num=1;
                if(R2.isChecked())
                    num=2;
                if(R3.isChecked())
                    num=3;
                if(R4.isChecked())
                    num=4;
                if(R5.isChecked())
                    num=5;
                if(R6.isChecked())
                    num=6;
                if(R7.isChecked())
                    num=7;
                int Cantidad=ICantCrepes4+ num;
                editor.putInt("cantidadCrepe4", Cantidad);
                editor.apply();
                R1.setChecked(true);
                Toast.makeText(getActivity(),"Has regsitrado "+String.valueOf(num)+" Creps 4",Toast.LENGTH_SHORT).show();
            }
        });



        Pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();

                PedidoFragment fragment = new PedidoFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();
            }
        });
        return inputfragment;
    }




}
