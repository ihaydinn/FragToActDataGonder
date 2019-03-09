package com.ismailhakkiaydin.fragtoactdatagonder;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentA extends Fragment {

    EditText sayi1, sayi2;
    Button sayilariGonder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        sayi1 = view.findViewById(R.id.etSayi1);
        sayi2 = view.findViewById(R.id.etSayi2);
        sayilariGonder = view.findViewById(R.id.btnActivityeSayilariGonder);

        sayilariGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });

        return view;
    }

    public void sendData() {

        int s1 = Integer.parseInt(sayi1.getText().toString());
        int s2 = Integer.parseInt(sayi2.getText().toString());

        MyListener listener = (MyListener) getActivity();
        listener.saylariTopla(s1,s2);

    }
}
