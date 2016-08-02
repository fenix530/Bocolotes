package com.example.diegoorozco.bocolotes;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class PedidoFragment extends Fragment {


    public PedidoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View inputfragment = inflater.inflate(R.layout.fragment_pedido, container, false);

        LinearLayout Crepe1 = (LinearLayout) inputfragment.findViewById(R.id.Crepe1);
        LinearLayout Crepe2 = (LinearLayout) inputfragment.findViewById(R.id.Crepe2);
        LinearLayout Crepe3 = (LinearLayout) inputfragment.findViewById(R.id.Crepe3);
        LinearLayout Crepe4 = (LinearLayout) inputfragment.findViewById(R.id.Crepe4);
        TextView CantCrepe1 = (TextView) inputfragment.findViewById(R.id.CantCrepe1);
        TextView CantCrepe2 = (TextView) inputfragment.findViewById(R.id.CantCrepe2);
        TextView CantCrepe3 = (TextView) inputfragment.findViewById(R.id.CantCrepe3);
        TextView CantCrepe4 = (TextView) inputfragment.findViewById(R.id.CantCrepe4);
        TextView ValorCrepe1 = (TextView) inputfragment.findViewById(R.id.ValorCrepe1);
        TextView ValorCrepe2 = (TextView) inputfragment.findViewById(R.id.ValorCrepe2);
        TextView ValorCrepe3 = (TextView) inputfragment.findViewById(R.id.ValorCrepe3);
        TextView ValorCrepe4 = (TextView) inputfragment.findViewById(R.id.ValorCrepe4);

        TextView ETotal = (TextView) inputfragment.findViewById(R.id.Total);

        Button Tomador=(Button) inputfragment.findViewById(R.id.bTomador);

        Button DeleteCr1 = (Button) inputfragment.findViewById(R.id.deleteCre1);
        Button DeleteCr2 = (Button) inputfragment.findViewById(R.id.deleteCre2);
        Button DeleteCr3 = (Button) inputfragment.findViewById(R.id.deleteCre3);
        Button DeleteCr4 = (Button) inputfragment.findViewById(R.id.deleteCre4);

        Button BP10=(Button) inputfragment.findViewById(R.id.BP10);
        Button BP15=(Button) inputfragment.findViewById(R.id.BP15);
        Button BP20=(Button) inputfragment.findViewById(R.id.BP20);
        Button BP50=(Button) inputfragment.findViewById(R.id.BP50);
        Button BPOther=(Button) inputfragment.findViewById(R.id.BPOther);
        final TextView Pago =(TextView) inputfragment.findViewById(R.id.tPago);
        final TextView Cambio =(TextView) inputfragment.findViewById(R.id.tCambio);
        final EditText POther=(EditText) inputfragment.findViewById(R.id.EPOther);



            SharedPreferences ajustes = getActivity().getSharedPreferences("CANTIDADES", 0);
            final SharedPreferences.Editor editor= ajustes.edit();


            int ICantCrepes1 = ajustes.getInt("cantidadCrepe1", 0);
            int ICantCrepes2 = ajustes.getInt("cantidadCrepe2", 0);
            int ICantCrepes3 = ajustes.getInt("cantidadCrepe3", 0);
            int ICantCrepes4 = ajustes.getInt("cantidadCrepe4", 0);

            int Ivalorcrepe1 = ICantCrepes1 * 5500;
            int Ivalorcrepe2 = ICantCrepes2 * 6000;
            int Ivalorcrepe3 = ICantCrepes3 * 6500;
            int Ivalorcrepe4 = ICantCrepes4 * 6900;

            final int Total=Ivalorcrepe1+Ivalorcrepe2+Ivalorcrepe3+Ivalorcrepe4;

            ETotal.setText(String.valueOf(Total));


            if (ICantCrepes1 == 0) {
                Crepe1.setVisibility(View.GONE);
            } else {
                CantCrepe1.setText(String.valueOf(ICantCrepes1));
                ValorCrepe1.setText(String.valueOf(Ivalorcrepe1));
            }

            if (ICantCrepes2 == 0) {
                Crepe2.setVisibility(View.GONE);
            } else {
                CantCrepe2.setText(String.valueOf(ICantCrepes2));
                ValorCrepe2.setText(String.valueOf(Ivalorcrepe2));
            }

            if (ICantCrepes3 == 0) {
                Crepe3.setVisibility(View.GONE);
            } else {
                CantCrepe3.setText(String.valueOf(ICantCrepes3));
                ValorCrepe3.setText(String.valueOf(Ivalorcrepe3));
            }

            if (ICantCrepes4 == 0) {
                Crepe4.setVisibility(View.GONE);
            } else {
                CantCrepe4.setText(String.valueOf(ICantCrepes4));
                ValorCrepe4.setText(String.valueOf(Ivalorcrepe4));
            }

        Tomador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();
                BocolotesFragment fragment = new BocolotesFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();

            }
        });


        DeleteCr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("cantidadCrepe1", 0);
                editor.apply();
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();

                PedidoFragment fragment = new PedidoFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();
            }
        });

        DeleteCr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("cantidadCrepe2", 0);
                editor.apply();
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();

                PedidoFragment fragment = new PedidoFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();
            }
        });

        DeleteCr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("cantidadCrepe3", 0);
                editor.apply();
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();

                PedidoFragment fragment = new PedidoFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();
            }
        });

        DeleteCr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("cantidadCrepe4", 0);
                editor.apply();
                FragmentManager fragmentemaager = getFragmentManager();
                FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();

                PedidoFragment fragment = new PedidoFragment();
                fragmentradaction.replace(android.R.id.content, fragment).commit();
            }
        });




        BP10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ICambio;
                Pago.setText("Pagado Con: 10000");
                ICambio=10000-Total;
                Cambio.setText("Cambio: "+String.valueOf(ICambio));
                BorrarPedido();
            }
        });

        BP15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ICambio;
                Pago.setText("Pagado Con: 15000");
                ICambio=15000-Total;
                Cambio.setText("Cambio: "+String.valueOf(ICambio));
                BorrarPedido();
            }
        });

        BP20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ICambio;
                Pago.setText("Pagado Con: 20000");
                ICambio=20000-Total;
                Cambio.setText("Cambio: "+String.valueOf(ICambio));
                BorrarPedido();
            }
        });

        BP50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ICambio;
                Pago.setText("Pagado Con: 50000");
                ICambio=50000-Total;
                Cambio.setText("Cambio: "+String.valueOf(ICambio));
                BorrarPedido();
            }
        });

        BPOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ICambio;
                int IPago;
                IPago=Integer.parseInt(String.valueOf(POther.getText()));
                ICambio=IPago-Total;
                Pago.setText("Pagado Con: "+String.valueOf(IPago));
                Cambio.setText("Cambio: "+String.valueOf(ICambio));
                BorrarPedido();
            }
        });


            return inputfragment;

        }

    void BorrarPedido(){
        SharedPreferences ajustes = getActivity().getSharedPreferences("CANTIDADES", 0);
        final SharedPreferences.Editor editor= ajustes.edit();
        editor.putInt("cantidadCrepe1", 0);
        editor.apply();
        editor.putInt("cantidadCrepe2", 0);
        editor.apply();
        editor.putInt("cantidadCrepe3", 0);
        editor.apply();
        editor.putInt("cantidadCrepe4", 0);
        editor.apply();
    }


}







