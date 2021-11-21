package br.com.unip.tpim8a;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviar(View view){
        TextInputEditText campoNome = findViewById(R.id.editNome);
        TextInputEditText campoCPF = findViewById(R.id.editCPF);
        TextInputEditText campoLogradouro = findViewById(R.id.editLogradouro);
        TextView textoResultado = findViewById(R.id.textoResultado);
        String nome = campoNome.getText().toString();
        String cpf = campoCPF.getText().toString();
        String logradouro = campoLogradouro.getText().toString();
        textoResultado.setText("Nome:"+nome+ "\n CPF"+cpf+ "\n Logradouro "+logradouro);

    }

}