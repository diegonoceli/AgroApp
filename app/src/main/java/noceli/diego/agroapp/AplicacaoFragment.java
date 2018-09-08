package noceli.diego.agroapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AplicacaoFragment extends Fragment {
    public Button btnsec1, btnsec2, btnsec3;

    public AplicacaoFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aplicacao, container, false);
        btnsec1 = (Button) view.findViewById(R.id.btnsec1);
        btnsec2 = (Button) view.findViewById(R.id.btnsec2);
        btnsec3 = (Button) view.findViewById(R.id.btnsec3);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        btnsec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i =new Intent(getContext(),Secao1.class);
            startActivity(i);
            }
        });
        btnsec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getContext(),Secao2.class);
                startActivity(i);
            }
        });
        btnsec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getContext(),Secao3.class);
                startActivity(i);
            }
        });
    }
}
