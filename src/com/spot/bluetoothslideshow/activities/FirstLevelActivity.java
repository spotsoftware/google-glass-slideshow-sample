package com.spot.bluetoothslideshow.activities;

import java.util.ArrayList;
import java.util.List;

import com.google.android.glass.widget.CardScrollView;
import com.spot.bluetoothslideshow.R;
import com.spot.bluetoothslideshow.adapters.SampleCardScrollAdapter;
import com.spot.bluetoothslideshow.models.ISampleModel;
import com.spot.bluetoothslideshow.models.SampleModel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class FirstLevelActivity extends Activity implements OnItemClickListener {

	private static final String TAG = FirstLevelActivity.class.getName();

	private CardScrollView mCardScrollView;
	private SampleCardScrollAdapter mCardScrollAdapter;

	// { Activity methods overriding

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_level);

		Log.d(TAG, "Initializing card scroll view...");

		final List<ISampleModel> items = this.getSampleItems();
		this.mCardScrollAdapter = SampleCardScrollAdapter.create(this, R.layout.sample_card_item, items);
		this.mCardScrollView = (CardScrollView) findViewById(R.id.first_level_scroll_view);
		this.mCardScrollView.setAdapter(this.mCardScrollAdapter);
		this.mCardScrollView.setOnItemClickListener(this);
		this.mCardScrollView.activate();
	}

	// }

	// { Private and protected methods

	private List<ISampleModel> getSampleItems() {
		final List<ISampleModel> items = new ArrayList<ISampleModel>();
		for (int i = 0; i < 5; i++) {
			items.add(SampleModel.create(i, "Item " + i));
		}
		return items;
	}

	// }

	// { OnItemClickListener implementation

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Log.d(TAG, "Handling click event on the Card number " + position + "...");
		// INF: Empty
	}

	// }

}
