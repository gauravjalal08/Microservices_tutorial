package com.gauravjalal.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String ratingId;
    private String userid;
    private String hotelId;
    private String rating;
    private String feedback;

}
