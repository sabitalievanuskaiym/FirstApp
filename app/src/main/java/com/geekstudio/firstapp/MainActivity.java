package com.geekstudio.firstapp;

import static com.geekstudio.firstapp.R.string.edit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private Button enter;
    private ConstraintLayout container2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editOne);
        password = findViewById(R.id.editTwo);
        enter = findViewById(R.id.buttonOne);
        container2 = findViewById(R.id.container2);
        changeColor();

        enter.setOnClickListener(e -> {
            if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                container2.setVisibility(View.GONE);
                Toast.makeText(this,"Вы успешно зарегестрировались",Toast.LENGTH_LONG).show();
            } else {    Toast.makeText(this,"Неправильный логин или пароль",Toast.LENGTH_LONG).show();
                email.setText("");
                password.setText("");
            }


        });

    }

    public void changeColor(){
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (email.getText().toString().length() >= 1 || password.getText().toString().length() >= 1) {
                    enter.setBackgroundColor(enter.getContext().getResources().getColor(R.color.orange));
                } else {
                    enter.setBackgroundColor(enter.getContext().getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (email.getText().toString().length() >= 1 || password.getText().toString().length() >= 1) {
                    enter.setBackgroundColor(enter.getContext().getResources().getColor(R.color.orange));
                } else {
                    enter.setBackgroundColor(enter.getContext().getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

        });


    }
}

