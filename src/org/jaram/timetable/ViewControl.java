package org.jaram.timetable;

import org.jaram.Model.DateInfo;
import org.jaram.views.BodyView;
import org.jaram.views.HeadView;
import android.content.Context;
import android.view.ViewManager;

public class ViewControl {
	Context cMain;
	DateInfo DI = new DateInfo();
	HeadView HV;
	
	
	public ViewControl(Context context) {
		cMain = context;
	}
}