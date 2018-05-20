package com.udemy.materialdesign.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class SelectionControlsActivity extends AppCompatActivity {

    @BindView(R.id.sc_switch)
        public SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_controls);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged(R.id.sc_switch)
    public void onChangeSwitch(CompoundButton buttonView, boolean isChecked){
        Toast.makeText(this, isChecked ? "Ligando...": "Desligando...", Toast.LENGTH_SHORT).show();
    }

    @OnCheckedChanged(R.id.sc_checkbox)
    public void onChangeCheckbox(CompoundButton buttonView, boolean isChecked){
        Toast.makeText(this, isChecked ? "Quero!": "Não Quero!", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.sc_opcao_01, R.id.sc_opcao_02, R.id.sc_opcao_03})
    public void onChangeCheckbox(RadioButton  radioButton){

        boolean checked = radioButton.isChecked();

        switch (radioButton.getId()){
            case R.id.sc_opcao_01 : {
                Toast.makeText(this, "OPÇÃO 01", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.sc_opcao_02 : {
                Toast.makeText(this, "OPÇÃO 02", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.sc_opcao_03 : {
                Toast.makeText(this, "OPÇÃO 03", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

}
