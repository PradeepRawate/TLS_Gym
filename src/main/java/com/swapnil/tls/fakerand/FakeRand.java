package com.swapnil.tls.fakerand;

import java.util.Arrays;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class FakeRand {
	
	private byte data[];
	private int index;
	private int numRead;
	
	
	
	
	
	public FakeRand() {
	}
	
	public FakeRand(byte[] data) {
		this.data = data;
	}

	public FakeRand(byte[] data, int index, int numRead) {
		super();
		this.data = data;
		this.index = index;
		this.numRead = numRead;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getNumRead() {
		return numRead;
	}

	public void setNumRead(int numRead) {
		this.numRead = numRead;
	}

	
	public int getMin(int a, int b) {
		return (a < b) ? a : b;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}	

}
