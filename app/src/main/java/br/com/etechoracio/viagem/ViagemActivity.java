package br.com.etechoracio.viagem;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ViagemActivity extends AppCompatActivity {

    private Button dataChegada;
    private Button dataSaida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
    }

    public Dialog onCreateDialog(int id) {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        switch (id) {
            case R.id.dataChegada:
                return new DatePickerDialog(this, dataChegadaListener, ano, mes, dia);
            case R.id.dataSaida:
                return new DatePickerDialog(this, dataSaidaListener, ano, mes, dia);
        }
        return null;


    }

    private DatePickerDialog.OnDateSetListener dataChegadaListener = new DatePickerDialog.OnDateSetListener() {

        public void OnDateSet(DatePicker view, int ano, int mes, int dia) {
            String data = String.valueOf(dia) + " /" + String.valueOf(mes + 1) + " /" + String.valueOf(ano);
            dataChegada.setText(data);
        }
    };

    private DatePickerDialog.OnDateSetListener dataSaidaListener = new DatePickerDialog.OnDateSetListener() {

        public void OnDateSet(DatePicker view, int ano, int mes, int dia) {
            String data = String.valueOf(dia) + " /" + String.valueOf(mes + 1) + " /" + String.valueOf(ano);
            dataSaida.setText(data);
        }
    };

    public void onClick(View v) {
        showDialog(v.getId());
    }


}
