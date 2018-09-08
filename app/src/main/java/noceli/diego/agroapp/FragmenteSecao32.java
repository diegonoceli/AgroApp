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

public class FragmenteSecao32 extends Fragment {
    private TextView lblresposta22;
    private EditText edtb, edta, edtc;
    private Button btncalcular22;


    public FragmenteSecao32() {
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
        View root = inflater.inflate(R.layout.fragment_secao32, container, false);
        lblresposta22 = (TextView) root.findViewById(R.id.lblresposta32);
        edtb = (EditText) root.findViewById(R.id.edtr32);
        edta = (EditText) root.findViewById(R.id.edts32);
        edtc = (EditText) root.findViewById(R.id.edtt32);
        btncalcular22 = (Button) root.findViewById(R.id.btncalcular32);

        btncalcular22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edta.getText().toString();
                String b = edtb.getText().toString();
                String c = edtc.getText().toString();
                try {
                    a = a.replace(',', '.');
                    b = b.replace(',', '.');
                    c = c.replace(',', '.');
                } catch (Exception e) {

                }
                double rr, ss, tt;
                rr = Double.valueOf(a);
                ss = Double.valueOf(b);
                tt = Double.valueOf(c);
                tt = (tt * rr * ss) / 600;
                DecimalFormat df = new DecimalFormat("0.00");
                lblresposta22.setText("A vazão nos bicos será de " + df.format(tt) + " L/min");
            }
        });
        return root;
    }

}
