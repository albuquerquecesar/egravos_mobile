
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package br.com.eagravos.mobile;

//~--- non-JDK imports --------------------------------------------------------

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
public class OpcoesEagravos extends Activity {

    /**
     * Called when the activity is first created.
     * @param icicle
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes_egravos);

        // Criação a mapeamento do botão
        Button bntSincronizar= (Button) findViewById(R.id.bntsincronizar);
        Button bntRegistrar=(Button) findViewById(R.id.bntregistrarocorrencia);
        
        // Listener que irá ouvir os eventos do botão
        bntSincronizar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                Intent myIntent = new Intent(v.getContext(), SplashScreen.class);

                startActivity(myIntent);
            }
        });
        
        // Listener que irá ouvir os eventos do botão Registrar Ocorrência
        bntRegistrar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                Intent myIntent = new Intent(v.getContext(), DadosBasicos.class);

                startActivity(myIntent);
            }
        });        
        

        // fim oncreate
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
