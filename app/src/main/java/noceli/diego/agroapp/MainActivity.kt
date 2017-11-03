package noceli.diego.agroapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.content.ClipData.newIntent



class MainActivity : AppCompatActivity() {
    private var button1: Button? = null
    private var button2: Button? = null
    private var button3: Button? = null
    private var button4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.btnsecao1) as Button
        button1!!.setOnClickListener(View.OnClickListener {
            val i = Intent(baseContext, Secao1Act::class.java)
            startActivity(i)
        })
        button2=findViewById(R.id.btnsecao2) as Button
        button2!!.setOnClickListener(View.OnClickListener {
            val i = Intent(baseContext, Secao2Act::class.java)
            startActivity(i)
        })
        button3=findViewById(R.id.btnsecao3) as Button
        button3!!.setOnClickListener(View.OnClickListener {
            val i = Intent(baseContext, Secao3Act::class.java)
            startActivity(i)
        })
        button4=findViewById(R.id.btnsecao4) as Button
        button4!!.setOnClickListener(View.OnClickListener {
            val i = Intent(baseContext, Secao4Act::class.java)
            startActivity(i)
        })
    }
}
