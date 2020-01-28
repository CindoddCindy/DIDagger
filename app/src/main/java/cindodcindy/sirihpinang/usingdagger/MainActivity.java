package cindodcindy.sirihpinang.usingdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

import static dagger.android.AndroidInjection.inject;

public class MainActivity extends AppCompatActivity {

    private TextView textView_dagger;

    private Button button_dagger;

    @Inject
    Darkknight darkknight;

    @Inject
    LightKnight  lightKnight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_dagger=findViewById(R.id.tv_id);
        button_dagger=findViewById(R.id.btn_id);

        DaggerBattleComponent.create().inject(this);

        button_dagger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String getReport = lightKnight.setEquiment() + " dan " + darkknight.setEquimpent();
                textView_dagger.setText(getReport);



            }
        });
    }
}
