package org.jaram.views;

import org.jaram.timetable.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HeadView extends LinearLayout{
	public HeadView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public HeadView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	int[] dayImgIds = new int[]{
			R.drawable.sun,
			R.drawable.mon,
			R.drawable.tue,
			R.drawable.wed,
			R.drawable.thu,
			R.drawable.fri,
			R.drawable.sat,
	};
	private ImageView dayImg;

	protected void init() {
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.main_head, this);

		dayImg = (ImageView) findViewById(R.id.main_head_day);
	}


	/* 占쏙옙占쏙옙 占쏙옙 占쏙옙占�화占쏙옙 */
	public void show(int day_of_week) {
		dayImg.setImageResource(dayImgIds[day_of_week]);
	}
}
