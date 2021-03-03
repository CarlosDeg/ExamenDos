package appcom.example.examendos.ui.personas;

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

import appcom.example.examendos.Paciente;
import appcom.example.examendos.R;

public class personaFragment extends Fragment {

     private EditText nombre,apellido,correo,telefono;
     private TextView res;
     private Button button;
     Paciente objPaciente = new Paciente();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_pacientes, container, false);

        nombre = (EditText)root.findViewById(R.id.nombre);
        apellido = (EditText)root.findViewById(R.id.apellido);
        correo = (EditText)root.findViewById(R.id.correo);
        telefono = (EditText)root.findViewById(R.id.telefono);
        res = (TextView)root.findViewById(R.id.telefono);
        button= (Button) root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatos();
            }
        });
        return root;
    }

    public void guardarDatos(){

       int tel = Integer.parseInt(telefono.getText().toString()) ;

        objPaciente.setNombre(nombre.getText().toString());
        objPaciente.setApellidos(apellido.getText().toString());
        objPaciente.setCorreo(correo.getText().toString());
        objPaciente.setTelefono(tel);

        res.setText("Nombre: " + objPaciente.getNombre() +"\nApellido: "+ objPaciente.getApellidos() +
                "Correo: "+ objPaciente.getCorreo()+"telefono: " + objPaciente.getTelefono());


    }



}