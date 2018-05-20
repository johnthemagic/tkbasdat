package com.tkbasdat.service;

import com.tkbasdat.model.RatingModel;

public interface RatingService {
	RatingModel selectRatingByIP(String ip);
	void addRating(RatingModel rating);
}
