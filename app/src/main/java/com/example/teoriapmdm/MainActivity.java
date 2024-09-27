package com.example.teoriapmdm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * Actividad Interfaz: Button
 * @author JC
 * @version 0.1
 *
 *  En esta rama se explicará los conceptos:
 *  1- Declaración e Inicialización de objetos TextView y Button
 *  2- Independencia del texto a través de archivo strings.xml
 *  3- Clases anónimas y uso de interfaces
 *  4- Conexión entre actividad y layout
 *  5- Ciclo de vida de las actividades
 *
 */
public class MainActivity extends AppCompatActivity {


    //Todo 2: Declaración de objetos

    //Todo 1: OnCreate como primera función para inicializar elementos de la actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Todo 3: Metodo para conectar la vista con la actividad.
        setContentView(R.layout.activity_main);


        //Todo 4: Inicialización de variables


        //Todo 5. Los botones tienen un listener según el tipo de toque sobre la vista.
        //Todo -> para ello se usa una clase anonima y se implementa su interfaz.
        //Todo -> Desde Java 8 se sustituyen las clases anonimas por lambdas


    }

    //Todo 6. Los siguientes métodos forman parte del ciclo de vida de cualquier actividad
    //Todo    Se podría ver como un diagrama de estados.

}