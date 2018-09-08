package noceli.diego.agroapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FragmenteSecao22 extends Fragment {
    private TextView lblresposta22;
    private EditText edtb,edta,edtc;
    private Button btncalcular22;


    public FragmenteSecao22() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_secao22, container, false);
        lblresposta22 = (TextView)root.findViewById(R.id.lblresposta22);
        edtb = (EditText)root.findViewById(R.id.edtf);
        edta = (EditText)root.findViewById(R.id.edte);
        edtc = (EditText)root.findViewById(R.id.edtg);
        btncalcular22 = (Button)root.findViewById(R.id.btncalcular22);

        btncalcular22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =edta.getText().toString();
                String c =edtc.getText().toString();
                String b =edtb.getText().toString();
                try {
                    a = a.replace(',', '.');
                    b = b.replace(',', '.');
                    c = c.replace(',', '.');
                }catch (Exception e){

                }
                double ee,ff,gg;
                ee=Double.valueOf(a);
                ff=Double.valueOf(b);
                gg=Double.valueOf(c);
                gg=(gg*(Math.sqrt(ff)))/Math.sqrt(ee);
                DecimalFormat df = new DecimalFormat("0.00");
                lblresposta22.setText("A vazão para a pressão pretendida deverá ser "+df.format(gg)+" L/min");
            }
        });
        return root;
    }

}

