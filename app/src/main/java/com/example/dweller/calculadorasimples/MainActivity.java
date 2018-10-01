package com.example.dweller.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTxtExpressao;

    private InterfaceCalculadora calculadora = new Calculadora();

    private Button mBtnSoma, mBtnSubtracao, mBtnMultiplicacao, mBtnDivisao,
            mBtnC, mBtnMaisMenos, mBtnPorcentagem, mBtnIgual, mBtnPonto,
            mBtnUm, mBtnDois, mBtnTres, mBtnQuatro, mBtnCinco,
            mBtnSeis, mBtnSete, mBtnOito, mBtnNove, mBtnZero;

    private String display = "0", operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mTxtExpressao.setText(display);

        setListener();
    }

    public void atualizarTela() {
        mTxtExpressao.setText(display);
    }

    public void init() {
        mTxtExpressao = findViewById(R.id.txtExpressao);
        mBtnSoma = findViewById(R.id.btnSoma);
        mBtnSubtracao = findViewById(R.id.btnSubtracao);
        mBtnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        mBtnDivisao = findViewById(R.id.btnDivisao);
        mBtnC = findViewById(R.id.btnC);
        mBtnMaisMenos = findViewById(R.id.btnMaisMenos);
        mBtnPorcentagem = findViewById(R.id.btnPorcentagem);
        mBtnIgual = findViewById(R.id.btnIgual);
        mBtnPonto = findViewById(R.id.btnPonto);
        mBtnUm = findViewById(R.id.btnUm);
        mBtnDois = findViewById(R.id.btnDois);
        mBtnTres = findViewById(R.id.btnTres);
        mBtnQuatro = findViewById(R.id.btnQuatro);
        mBtnCinco = findViewById(R.id.btnCinco);
        mBtnSeis = findViewById(R.id.btnSeis);
        mBtnSete = findViewById(R.id.btnSete);
        mBtnOito = findViewById(R.id.btnOito);
        mBtnNove = findViewById(R.id.btnNove);
        mBtnZero = findViewById(R.id.btnZero);
    }

    public void setListener() {
        mTxtExpressao.setOnClickListener(this);
        mBtnSoma.setOnClickListener(this);
        mBtnSubtracao.setOnClickListener(this);
        mBtnMultiplicacao.setOnClickListener(this);
        mBtnDivisao.setOnClickListener(this);
        mBtnC.setOnClickListener(this);
        mBtnMaisMenos.setOnClickListener(this);
        mBtnPorcentagem.setOnClickListener(this);
        mBtnIgual.setOnClickListener(this);
        mBtnPonto.setOnClickListener(this);
        mBtnUm.setOnClickListener(this);
        mBtnDois.setOnClickListener(this);
        mBtnTres.setOnClickListener(this);
        mBtnQuatro.setOnClickListener(this);
        mBtnCinco.setOnClickListener(this);
        mBtnSeis.setOnClickListener(this);
        mBtnSete.setOnClickListener(this);
        mBtnOito.setOnClickListener(this);
        mBtnNove.setOnClickListener(this);
        mBtnZero.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnZero || view.getId() == R.id.btnUm
                || view.getId() == R.id.btnDois || view.getId() == R.id.btnTres
                || view.getId() == R.id.btnQuatro || view.getId() == R.id.btnCinco
                || view.getId() == R.id.btnSeis || view.getId() == R.id.btnSete
                || view.getId() == R.id.btnOito || view.getId() == R.id.btnNove
                || view.getId() == R.id.btnZero || view.getId() == R.id.btnPonto)
            onClickNumero(view);
        else if (view.getId() == R.id.btnSoma || view.getId() == R.id.btnSubtracao
                || view.getId() == R.id.btnMultiplicacao || view.getId() == R.id.btnDivisao
                || view.getId() == R.id.btnMaisMenos || view.getId() == R.id.btnPorcentagem)
            onClickOperador(view);
        else if (view.getId() == R.id.btnC)
            onClickC(view);
        else
            onClickIgual(view);
    }

    public void onClickOperador(View view) {
        Button b = (Button) view;
        if (display.endsWith("+") || display.endsWith("-") || display.endsWith("x")
                || display.endsWith("/") || display.endsWith("%"))
            display = display.substring(0, display.length() - 1);
        display += b.getText();
        operador = b.getText().toString();
        atualizarTela();
    }

    public void onClickNumero(View view) {
        Button b = (Button) view;
        display += b.getText();
        atualizarTela();
    }

    public void onClickIgual(View view) {
        double result = 0.0;
        result = calculadora.tratarExpressao(mTxtExpressao.getText().toString());

        mTxtExpressao.setText(String.valueOf(result));
    }

    public void onClickC(View view) {
        clear();
        atualizarTela();
    }

    private void clear() {
        display = display.substring(0, display.length() - 1);
    }

}
