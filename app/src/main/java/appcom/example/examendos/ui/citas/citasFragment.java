package appcom.example.examendos.ui.citas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import appcom.example.examendos.Citas;
import appcom.example.examendos.R;

public class citasFragment extends Fragment {

    private EditText hora,dia;
    private TextView textView2;
    private Button button2;
    Citas objCitas = new Citas();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_citas, container, false);

        hora = (EditText)root.findViewById(R.id.hora);
        dia = (EditText)root.findViewById(R.id.dia);
        button2 = (Button) root.findViewById(R.id.button2);
        textView2 = (TextView) root.findViewById(R.id.textView2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar();
            }
        });

        return root;
    }

    public void guardar(){

        objCitas.setHora(hora.getText().toString());
        objCitas.setDia(dia.getText().toString());

        textView2.setText("hora: " + objCitas.getHora() +"\n Dia: "+ objCitas.getDia());

    }

}