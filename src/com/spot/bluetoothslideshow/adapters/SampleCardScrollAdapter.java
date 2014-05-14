package com.spot.bluetoothslideshow.adapters;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.spot.glass.slideshow.R;
import com.spot.bluetoothslideshow.models.ISampleModel;

public class SampleCardScrollAdapter extends BaseCardScrollAdapter<ISampleModel> {

	// { Construction

	protected SampleCardScrollAdapter(final Context context, final int resourceId, final List<ISampleModel> items) {
		super(context, resourceId, items);
	}

	public static SampleCardScrollAdapter create(final Context context, final int resourceId,
			final List<ISampleModel> items) {
		return new SampleCardScrollAdapter(context, resourceId, items);
	}

	// }

	// { BaseCardScrollAdapter abstract methods implementation

	@Override
	public View getView(int position, View convertView, ViewGroup parentView) {
		convertView = View.inflate(this.getContext(), this.getResourceId(), null);

		final ISampleModel model = (ISampleModel) this.getItem(position);

		final TextView idTextView = (TextView) convertView.findViewById(R.id.sample_item_id);
		final String idPlaceholderLabel = this.getContext().getString(R.string.sample_item_id_placeholder);
		final String idLabel = String.format(idPlaceholderLabel, model.getId());
		idTextView.setText(idLabel);

		final TextView nameTextView = (TextView) convertView.findViewById(R.id.sample_item_name);
		final String namePlaceholderLabel = this.getContext().getString(R.string.sample_item_name_placeholder);
		final String nameLabel = String.format(namePlaceholderLabel, model.getId());
		nameTextView.setText(nameLabel);

		return convertView;
	}

	// }

}
