package noceli.diego.agroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Secao1 extends AppCompatActivity {
    public Button btn;
    public EditText edt1,edt2,edt3;
    public TextView lblresposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secao1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn= (Button) findViewById(R.id.btncalcula1);
        edt1= (EditText) findViewById(R.id.edt1);
        edt2= (EditText) findViewById(R.id.edt2);
        edt3= (EditText) findViewById(R.id.edt3);
        lblresposta= (TextView) findViewById(R.id.lblresposta);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a =edt1.getText().toString();
                String b =edt2.getText().toString();
                String c =edt3.getText().toString();
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
                cc=(cc*bb)/aa;
                DecimalFormat df = new DecimalFormat("0.00");
                lblresposta.setText(df.format(cc)+" L do produto em cada reabastecimento do pulverizador!");
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
