package org.jaram.timetable;

import org.jaram.Model.FileManage;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    /** Called when the activity is first created. */
	FileManage FM;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // program root location
		String path = this.getFilesDir()+"";
		
		// DB File Manage
        FM = new FileManage(this, path);
        
		
        ViewControl VC = new ViewControl(this);

    }
}