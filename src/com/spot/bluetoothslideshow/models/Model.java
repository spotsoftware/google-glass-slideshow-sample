package com.spot.bluetoothslideshow.models;

public class Model implements IModel {

	private final int mId;
	private final String mName;

	// { Construction

	protected Model(final int id, final String name) {
		this.mId = id;
		this.mName = name;
	}

	// }

	// { IModel implementation

	@Override
	public int getId() {
		return this.mId;
	}

	@Override
	public String getName() {
		return this.mName;
	}

	// }

}
