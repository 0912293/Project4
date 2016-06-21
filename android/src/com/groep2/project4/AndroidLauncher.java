package com.groep2.project4;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.groep2.project4.Main;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		setContentView(R.layout.activity_main);

		GraphView graph = (GraphView) findViewById(R.id.graph);
		LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
				new DataPoint(0, 1),
				new DataPoint(1, 5),
				new DataPoint(2, 3),
				new DataPoint(3, 2),
				new DataPoint(4, 6)
		});
		graph.addSeries(series);

		initialize(new Main(), config);
	}
}
