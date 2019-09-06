package android.example.logging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView mangoSorbet = findViewById(R.id.menu_item_1);
        String menuItem1 = mangoSorbet.getText().toString();
        Log.v("Our today menu", menuItem1);
        // Find second menu item TextView and print the text to the logs
        TextView blueberryPie = findViewById(R.id.menu_item_2);
        String menuItem2 = blueberryPie.getText().toString();
        Log.v("Our yesterday menu", menuItem2);
        // Find third menu item TextView and print the text to the logs
        TextView chocoCake = findViewById(R.id.menu_item_3);
        String menuItem3 = chocoCake.getText().toString();
        Log.v("Our tommorow menu",menuItem3);

    }
}