package br.com.eagravos.mobile;

//~--- non-JDK imports --------------------------------------------------------

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.eagravos.mobile.interfaces.Transaction;
import br.com.eagravos.mobile.modelos.Contatos;
import br.com.eagravos.mobile.tools.Criptografia;
import br.com.eagravos.mobile.tools.TransactionTask;
import br.com.eagravos.mobile.webservices.ContatosWebService;

public class Principal extends Activity implements Transaction {
    private EditText email;
    private EditText senha;
    private Button btnContinuar;
    private Button btnCancelar;
    private Contatos contato;
    
    /**
     * Called when the activity is first created.
     * @param savedInstanceState 
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

     // Criação a mapeamento do botão
        btnContinuar= (Button) findViewById(R.id.bntlogin);
        email=(EditText) this.findViewById(R.id.username_edit);
        senha=(EditText) this.findViewById(R.id.password_edit);

        // Listener que irá ouvir os eventos do botão
        btnContinuar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                // Cria a chamada para a página 2
                //Intent myIntent = new Intent(v.getContext(), Principal.class);
                // startActivity(myIntent);
                new TransactionTask(Principal.this,Principal.this,R.string.aguarde).execute(new Void[0]);
                 
            }
        });
        
        
        
        
        
        
    }

        // fim oncreate
        
       public void execute() throws Exception {
        contato=new Contatos();
        contato.setEmail(this.email.getText().toString());
        contato.setSenha(Criptografia.criptografe(this.senha.getText().toString(), Criptografia.MD5));
        
        System.out.println("senha "+contato.getSenha());
        ContatosWebService contatoService=new ContatosWebService();
        
        contato=contatoService.login(contato);
        
        
        
    }
    
    public void atualizarView() {
        if(contato!=null){
            Toast.makeText(this, "Usuario logado", Toast.LENGTH_LONG).show();
            this.startActivity(new Intent(this, DadosBasicos.class));
        } else {
            Toast.makeText(this, "Usuario não logado", Toast.LENGTH_LONG).show();
        }
        
    }  
}



//~ Formatted by Jindent --- http://www.jindent.com
