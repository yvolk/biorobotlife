package com.yurivolkov.biorobotlife;

import android.app.*;
import android.os.*;
import android.widget.*;

/** 
 * Android wrapper for the BiorobotLife quiz
 */
public class AndroidWrapperActivity extends Activity
{
    private static final String NEWLINE = "\n";
	private static final String NUMBER_OF_MONTHS_TO_LIVE = "50";

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		String message = "";
		try {
			message += live();
		} catch (Exception e) {
			e.printStackTrace();
			message += e.getClass().getName() + " ";
			message += e.getMessage() + NEWLINE;
		}

		TextView messageView = (TextView) findViewById(R.id.message);
		messageView.setText(message);
    }

	private String live() {
		ConsoleWrapper.main( new String[]{NUMBER_OF_MONTHS_TO_LIVE});
		String message = ConsoleWrapper.printed + NEWLINE;

		return message;
	}
}
