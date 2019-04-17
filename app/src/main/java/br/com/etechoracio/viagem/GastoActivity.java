package br.com.etechoracio.viagem;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;

public class GastoActivity extends AppCompatActivity {
    private Spinner spnTipoGasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto);

        spnTipoGasto = (Spinner) findViewById(R.id.spnTipoGasto);
        spnTipoGasto.setAdapter(getAdapterTipoGasto());

    }

    private ArrayAdapter getAdapterTipoGasto() {
        return new ArrayAdapter<TipoGastoEnum>(this,
                R.layout.support_simple_spinner_dropdown_item,
                TipoGastoEnum.values());
    }


}
