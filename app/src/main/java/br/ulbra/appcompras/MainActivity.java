package br.ulbra.appcompras;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;

    Button bttotal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_main);


        chkarroz = (CheckBox) chkarroz.findViewById(R.id.chkarroz);
        chkleite = (CheckBox) chkleite.findViewById(R.id.chkleite);
        chkcarne = (CheckBox) chkcarne.findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) chkfeijao.findViewById(R.id.chkfeijao);
        bttotal = (Button) bttotal.findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {






            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked())  {  total += 2.69; }
                if (chkleite.isChecked())   {  total += 5.00;  }
                if (chkcarne.isChecked()) {  total += 9.7;   }
                if (chkfeijao.isChecked())  { total += 2.30; }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra :"+ String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();

            }  });

    }
}
