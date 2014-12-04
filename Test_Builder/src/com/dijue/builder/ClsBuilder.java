package com.dijue.builder;

public class ClsBuilder {
	public final double lat, lng;

	public ClsBuilder(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "ClsBuilder [lat=" + lat + ", lng=" + lng + "]";
	}

	public static class Builder {

		private double lat, lng;

		public Builder lat(double at) {
			this.lat = at;
			return this;
		}

		public Builder lng(double ng) {
			this.lng = ng;
			return this;
		}

		public ClsBuilder build() {
			return new ClsBuilder(lat, lng);
		}

		@Override
		public String toString() {
			return "Builder [lat=" + lat + ", lng=" + lng + "]";
		}

	}
}
