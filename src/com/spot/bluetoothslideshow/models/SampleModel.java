package com.spot.bluetoothslideshow.models;

public class SampleModel extends Model implements ISampleModel {

	// { Construction

	protected SampleModel(final int id, final String name) {
		super(id, name);
	}

	public static ISampleModel create(final int id, final String name) {
		return new SampleModel(id, name);
	}

	// }

}
