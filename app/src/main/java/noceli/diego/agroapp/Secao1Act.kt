package noceli.diego.agroapp

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.support.v7.widget.Toolbar


class Secao1Act : AppCompatActivity() {
    private var edtQ1: EditText? = null
    var edtQ2: EditText? = null
    var edtP1: EditText? = null
    private var button: Button? = null
    var toolbar: Toolbar? = null


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secao1)
        toolbar = findViewById(R.id.toolbar1) as Toolbar
        setSupportActionBar(toolbar)
        toolbar!!.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })


        edtQ1 = findViewById(R.id.edtQ12) as EditText
        edtQ2 = findViewById(R.id.edtQ2) as EditText
        edtP1 = findViewById(R.id.edtP1) as EditText
        button = findViewById(R.id.button) as Button

        button!!.setOnClickListener({
            val sq1 = edtQ1!!.getText().toString()
            val q1 = Integer.parseInt(sq1)
            val sq2 = edtQ2!!.getText().toString()
            val q2 = Integer.parseInt(sq2)
            val sp1 = edtP1!!.getText().toString()
            val p1 = Integer.parseInt(sp1)
            val p2 = Math.pow(((q2 * Math.sqrt(p1.toDouble())) / q1), 2.0)

            val alertDilog = AlertDialog.Builder(this@Secao1Act).create()
            alertDilog.setTitle("Calculado com sucesso")
            alertDilog.setMessage("O resultado foi: " + p2 + " BAR")
            alertDilog.setButton(AlertDialog.BUTTON_NEUTRAL, "ok", { dialogInterface, k ->
                // Toast.makeText(applicationContext, "You clicked on NEUTRAL Button", Toast.LENGTH_SHORT).show()
            })
            alertDilog.show()


        })
    }
}
