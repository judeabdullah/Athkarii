package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MONAWA extends AppCompatActivity {
    String adeya []={
            "اللهم إني أسألك عيشة نقية وميتة سوية ومرداً غير مخزٍ ولا فاضح .",
            "يا حي يا قيوم برحمتك أستغيث أصلح لي شأني كلة ولا تكلني إلي نفسي طرفة عين .",
            "اللهم فرج هم المهمومين واشرح صدورهم وانزل الراحة والسكينة في قلوبهم .",
            "اللهم كما زينت بحار أرضك باللؤلؤ والمرجان زين قلوبنا بالتقوي والغفران والعتق من النيران .",
            "اللهم فقهني في الدين اللهم احفظني بالإسلام قائماً ، و احفظني بالإسلام قاعداً واحفظني بالإسلام راقداً ولا تشمت بي عدواً ولا حاسداً اللهم إني أسألك من كل خير خزائنه بيدك ، وأعوذ بك من كل شر خزائنه بيدك .",
            "اللهم إني أعوذ بك من الجبن وأعوذ بك من البخل وأعوذ بك من أن أُرد إلى أرذل العمر ، وأعوذ بك من فتنة الدنيا وعذاب القبر اللهم جنبني منكرات الأخلاق ، والأهواء ، والأعمال ، والأدواء .",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_o_n_a_w);
        final TextView appearance = findViewById(R.id.textView5);
        appearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(adeya.length);
                String d = adeya[randomNumber];
                appearance.setText( d);




            }
        });
    }
}