/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.eagravos.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 *
 * @author barbosa
 */
public class DadosBasicos extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dadosbasicos01);

        // Criação a mapeamento do botão
        Button bntContinuar= (Button) findViewById(R.id.db1continuar);
        Button bntCancelar=(Button) findViewById(R.id.db1cancelar);

        // Listener que irá ouvir os eventos do botão
        bntContinuar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                Intent myIntent = new Intent(v.getContext(), DadosBasicos2.class);

                startActivity(myIntent);
            }
        });

        
        bntCancelar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                Intent myIntent = new Intent(v.getContext(), Principal.class);

                startActivity(myIntent);
            }
        });        
        
        
        
        // fim oncreate
    }
    
}
