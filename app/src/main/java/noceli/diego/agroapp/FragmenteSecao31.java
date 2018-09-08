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

public class FragmenteSecao31 extends Fragment {
    private TextView lblresposta21;
    private EditText edtb,edta,edtc;
    private Button btncalcular21;


    public FragmenteSecao31() {
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
        View root = inflater.inflate(R.layout.fragment_secao31, container, false);
        lblresposta21 = (TextView)root.findViewById(R.id.lblresposta31);
        edtb = (EditText)root.findViewById(R.id.edtm31);
        edta = (EditText)root.findViewById(R.id.edtn31);
        edtc = (EditText)root.findViewById(R.id.edto31);
        btncalcular21 = (Button)root.findViewById(R.id.btncalcular31);

        btncalcular21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =edta.getText().toString();
                String b =edtb.getText().toString();
                String c =edtc.getText().toString();
                try {
                    a = a.replace(',', '.');
                    b = b.replace(',', '.');
                    c = c.replace(',', '.');
                }catch (Exception e){

                }
                double mm,nn,oo;
                mm=Double.valueOf(a);
                nn=Double.valueOf(b);
                oo=Double.valueOf(c);
                oo=(600*oo)/(mm*nn);
                DecimalFormat df = new DecimalFormat("0.00");
                lblresposta21.setText("Estão sendo aplcicados "+df.format(oo)+" L/ha de calda");
            }
        });
        return root;
    }

}
