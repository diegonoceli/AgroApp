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
import java.util.concurrent.ExecutionException;

public class FragmenteSecao21 extends Fragment {
    private TextView lblresposta21;
    private EditText edtb,edta,edtc;
    private Button btncalcular21;


    public FragmenteSecao21() {
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
        View root = inflater.inflate(R.layout.fragment_secao21, container, false);
        lblresposta21 = (TextView)root.findViewById(R.id.lblresposta21);
        edtb = (EditText)root.findViewById(R.id.edtb);
        edta = (EditText)root.findViewById(R.id.edta);
        edtc = (EditText)root.findViewById(R.id.edtc);
        btncalcular21 = (Button)root.findViewById(R.id.btncalcular21);

        btncalcular21.setOnClickListener(new View.OnClickListener() {
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
                double aa,bb,cc;
                aa=Double.valueOf(a);
                bb=Double.valueOf(b);
                cc=Double.valueOf(c);
                cc=Math.pow(((Math.sqrt(cc)*bb)/aa),2);
                DecimalFormat df = new DecimalFormat("0.00");
                lblresposta21.setText("A pressão deverá ser ajustada para "+df.format(cc)+" bar");
            }
        });
        return root;
    }

}
