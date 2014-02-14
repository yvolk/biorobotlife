package com.yurivolkov.biorobotlife;

import java.util.List;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

/** Android wrapper 
 *   for the BiorobotLife quiz
 */
public class AndroidWrapperActivity extends Activity
{
	private static String NEWLINE = "\n";
	private int intDump = 0;

    /** Called when the activity is first created. */
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
			message += "intDump=" + intDump + NEWLINE;
		}

		TextView messageView = (TextView) findViewById(R.id.message);
		messageView.setText(message);
    }

	private String live() {
		Launcher.main("50");
		String message = Launcher.printed + NEWLINE;

		return message;
	}
}
