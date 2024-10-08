package com.shanu.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
   @Autowired
   private ReviewService reviewServ;
   @PostMapping
   @CrossOrigin
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
       return new ResponseEntity<Review>(reviewServ.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);

   }
}
