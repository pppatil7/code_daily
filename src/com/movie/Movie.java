package com.movie;

import java.util.Arrays;

public class Movie {

	int id;
	String movieName;
	String[] castingArr;
	int yearOfRelease;
	int rating;

	public Movie() {
		super();
	}

	public Movie(int id, String movieName, String[] castingArr, int yearOfRelease, int rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.castingArr = castingArr;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String[] getCastingArr() {
		return castingArr;
	}

	public void setCastingArr(String[] castingArr) {
		this.castingArr = castingArr;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", castingArr=" + Arrays.toString(castingArr)
				+ ", yearOfRelease=" + yearOfRelease + ", rating=" + rating + "]";
	}

}
