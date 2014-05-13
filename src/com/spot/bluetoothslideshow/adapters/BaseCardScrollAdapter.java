package com.spot.bluetoothslideshow.adapters;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.widget.CardScrollAdapter;
import com.spot.bluetoothslideshow.models.IModel;

public abstract class BaseCardScrollAdapter<TModel extends IModel> extends CardScrollAdapter {

	private final Context mContext;
	private final int mResourceId;
	private final List<TModel> mItems;

	protected BaseCardScrollAdapter(final Context context, final int resourceId, final List<TModel> items) {
		super();

		this.mContext = context;
		this.mResourceId = resourceId;
		this.mItems = items;
	}

	// { Protected methods

	protected Context getContext() {
		return this.mContext;
	}

	protected int getResourceId() {
		return this.mResourceId;
	}

	// }

	// { CardScrollAdapter implementation

	@Override
	public int getCount() {
		return this.mItems.size();
	}

	@Override
	public Object getItem(final int position) {
		return this.mItems.get(position);
	}

	@Override
	public int getPosition(final Object item) {
		return this.mItems.indexOf(item);
	}

	@Override
	public abstract View getView(final int position, final View convertView, final ViewGroup parentView);

	// }

}
