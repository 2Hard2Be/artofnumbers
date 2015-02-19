package com.example.artofnumbers;

import android.location.GpsStatus;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.util.EventListener;


public class MainActivity extends ActionBarActivity {

    private static final String[] UNIDADES = new String[] {"liter", "cubic meter", "gallon", "cubic centimeter",
            "milliliter","liter","barrel","centiliter", "hectoliter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Atencion textView (multiautocompletext) es declarado final

       final MultiAutoCompleteTextView textView = (MultiAutoCompleteTextView)findViewById(R.id.auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, UNIDADES);


//LEE EL AUTOCOMPLETE EN BUSCA DEL TOKEN PARA ESTE CASO ES UN ESPACIO
        textView.setTokenizer(new MultiAutoCompleteTextView.Tokenizer() {
            @Override
            public int findTokenStart(CharSequence text, int cursor) {
               int i = cursor;
                while (i>0 && text.charAt(i-1)!=' '){
                    i--;
                }
               while (i < cursor && text.charAt(i)== ' '){
                    i++;
                }
                return i;
            }

            @Override
            public int findTokenEnd(CharSequence text, int cursor) {
                int i = cursor;
                int len = text.length();

                while (i < len) {
                    if (text.charAt(i) == ' ') {
                        return i;
                    } else {
                        i++;
                    }
                }

                return len;
            }


            @Override
            public CharSequence terminateToken(CharSequence text) {
                int i = text.length();

                while (i > 0 && text.charAt(i - 1) == ' ') {
                    i--;
                }

                if (i > 0 && text.charAt(i - 1) == ' ') {
                    return text;
                } else {
                    if (text instanceof Spanned) {
                        SpannableString sp = new SpannableString(text + " ");
                        TextUtils.copySpansFrom((Spanned) text, 0, text.length(),
                                Object.class, sp, 0);
                        return sp;
                    } else {
                        return text + " ";
                    }
                }
            }
        });

                textView.setAdapter(adapter);



final Button botonigual = (Button)findViewById(R.id.botonaso);
        botonigual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            String informacion = textView.getText().toString();
            StringBuilder numeros = new StringBuilder();
            StringBuilder unidades = new StringBuilder();

                char[] texto = new char[informacion.length()];
                informacion.getChars(0, informacion.length(),texto, 0 );

                int i;
                int ii;

                for (i = 0; i < texto.length; i++) {
                    if (texto[i] != ' ') {
                        numeros.append(texto[i]).toString();
                    }
                    else {

                        ii = i+1;
                        while (texto[ii] != ' '){

                            unidades.append(texto[ii]).toString();
                            ii++;
                        }
                     break;

                }

                }


                TextView resultado = (TextView)findViewById(R.id.resultado);
                resultado.setText(numeros+" "+"con unidades"+" "+unidades);

        }});




        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}