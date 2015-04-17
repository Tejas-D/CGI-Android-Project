package za.co.cti;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends Activity implements OnClickListener{

    private Button historyButton;
    private Button mathsButton;
    private Button carButton; //Creating a technology button to be used
    // internally by the application
    private TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        historyButton = (Button) findViewById(R.id.history_button);
        historyButton.setOnClickListener(this);
        mathsButton = (Button) findViewById(R.id.math_button);
        mathsButton.setOnClickListener(this);
        carButton = (Button) findViewById(R.id.car_button);/*binding technology
        button created in main.xml file to private technologyButton declared above*/

        carButton.setOnClickListener(this); //use technologyB


        carButton.setOnClickListener(this); /*use technologyButton if clicked*/
        summary = (TextView) findViewById(R.id.totalAnswered);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View arg0)
    {
        if ( arg0 == historyButton ) {
            Log.i("QUIZ", "History selected");
            Toast.makeText(getApplicationContext(), "History button pressed", Toast.LENGTH_LONG).show();
            Intent link = new Intent(QuizActivity.this, MultipleChoiceActivity.class);
            startActivityForResult(link, 1);
        }
        if ( arg0 == mathsButton ) {
            Log.i("QUIZ", "Maths selected");
            Toast.makeText(getApplicationContext(), "Maths button pressed", Toast.LENGTH_LONG).show();
            Intent link = new Intent(QuizActivity.this, MathActivity.class);
            startActivityForResult(link, 2);
        }
        if ( arg0 == technologyButton ) {
            Log.i("QUIZ", "Technology selected");
            Toast.makeText(getApplicationContext(), "Technology button pressed", Toast.LENGTH_LONG).show();
            Intent link = new Intent(QuizActivity.this, TechnologyQuestionsActivity.class);
            startActivityForResult(link, 3);
        }/* if statement applied if technologyButton is clicked*/

    }


}
