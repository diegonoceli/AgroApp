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


class Secao2Act : AppCompatActivity() {
    private var edtQ1: EditText? = null
    var edtP1: EditText? = null
    var edtP2: EditText? = null
    private var button2: Button? = null
    var toolbar: Toolbar? = null


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secao2)

        toolbar = findViewById(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        toolbar!!.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })

        edtQ1 = findViewById(R.id.edtQ12) as EditText
        edtP2 = findViewById(R.id.edtP22) as EditText
        edtP1 = findViewById(R.id.edtP12) as EditText
        button2 = findViewById(R.id.button2) as Button
        button2!!.setOnClickListener(View.OnClickListener {

            var q1 = Integer.parseInt(edtQ1!!.text.toString())
            var p1 = Integer.parseInt(edtP1!!.text.toString())
            var p2 = Integer.parseInt(edtP2!!.text.toString())
            var q2 = ((q1 * Math.sqrt(p2.toDouble())) / Math.sqrt(p1.toDouble()))

            val alertDilog = AlertDialog.Builder(this@Secao2Act).create()
            alertDilog.setTitle("Calculado com sucesso")
            alertDilog.setMessage("O resultado foi: " + q2 + " L/min")
            alertDilog.setButton(AlertDialog.BUTTON_NEUTRAL, "ok", { dialogInterface, k ->

            })
            alertDilog.show()


        })
    }
}
