package com.bigademo.datetimepicker.wheel.adapter;

import java.util.ArrayList;

/**
 * The simple Array wheel adapter
 * @param <T> the element type
 */
public class TYArrayWheelAdapter<T> implements TYWheelAdapter {
	
	/** The default items length */
	public static final int DEFAULT_LENGTH = 4;
	
	// items
	private ArrayList<T> items;
	// length
	private int length;

	/**
	 * Constructor
	 * @param items the items
	 * @param length the max items length
	 */
	public TYArrayWheelAdapter(ArrayList<T> items, int length) {
		this.items = items;
		this.length = length;
	}
	
	/**
	 * Contructor
	 * @param items the items
	 */
	public TYArrayWheelAdapter(ArrayList<T> items) {
		this(items, DEFAULT_LENGTH);
	}

	@Override
	public Object getItem(int index) {
		if (index >= 0 && index < items.size()) {
			return items.get(index);
		}
		return "";
	}

	@Override
	public int getItemsCount() {
		return items.size();
	}

	@Override
	public int indexOf(Object o){
		return items.indexOf(o);
	}

}
