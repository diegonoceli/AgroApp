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


class Secao3Act : AppCompatActivity() {
    private var edtq: EditText? = null
    var edtv: EditText? = null
    var edtE: EditText? = null
    private var button3: Button? = null
    var toolbar: Toolbar? = null

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secao3)
        toolbar = findViewById(R.id.toolbar3) as Toolbar
        setSupportActionBar(toolbar)
        toolbar!!.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })

        edtq = findViewById(R.id.edtq) as EditText?
        edtv = findViewById(R.id.edtv) as EditText?
        edtE = findViewById(R.id.edtE) as EditText?
        button3 = findViewById(R.id.button3) as Button?
        button3!!.setOnClickListener(View.OnClickListener {
            var q = Integer.parseInt(edtq!!.text.toString())
            var v = Integer.parseInt(edtv!!.text.toString())
            var E = Integer.parseInt(edtE!!.text.toString())
            var Q = ((600 * q) / (v * E))
            val alertDilog = AlertDialog.Builder(this@Secao3Act).create()
            alertDilog.setTitle("Calculado com sucesso")
            alertDilog.setMessage("O resultado foi: " + Q + " L/hec")
            alertDilog.setButton(AlertDialog.BUTTON_NEUTRAL, "ok", { dialogInterface, k ->

            })
            alertDilog.show()

        })
    }
}
