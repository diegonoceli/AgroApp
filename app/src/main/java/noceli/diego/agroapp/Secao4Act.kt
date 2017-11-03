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


class Secao4Act : AppCompatActivity() {
    private var edtq2: EditText? = null
    var edtv2: EditText? = null
    var edtE2: EditText? = null
    private var button4: Button? = null
    var toolbar: Toolbar? = null

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secao4)
        toolbar = findViewById(R.id.toolbar4) as Toolbar
        setSupportActionBar(toolbar)
        toolbar!!.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })

        edtq2 = findViewById(R.id.edtq2) as EditText?;
        edtv2 = findViewById(R.id.edtv2) as EditText?;
        edtE2 = findViewById(R.id.edtE2) as EditText?;
        button4 = findViewById(R.id.button4) as Button?;

        button4!!.setOnClickListener(View.OnClickListener {
            var Q = Integer.parseInt(edtq2!!.text.toString())
            var v = Integer.parseInt(edtv2!!.text.toString())
            var E = Integer.parseInt(edtE2!!.text.toString())
            var q = (Q * v * E) / 600
            val alertDilog = AlertDialog.Builder(this@Secao4Act).create()
            alertDilog.setTitle("Calculado com sucesso")
            alertDilog.setMessage("O resultado foi: " + q + " L/min")
            alertDilog.setButton(AlertDialog.BUTTON_NEUTRAL, "ok", { dialogInterface, k ->

            })
            alertDilog.show()
        })
    }
}
