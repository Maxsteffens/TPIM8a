package br.com.unip.menupima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        TextView textoResultado = findViewById(R.id.textoResultado);
        String nome = campoNome.getText().toString();
        String cpf = campoCPF.getText().toString();
        textoResultado.setText("Nome:"+nome+ "\n CPF"+cpf);

    }



}