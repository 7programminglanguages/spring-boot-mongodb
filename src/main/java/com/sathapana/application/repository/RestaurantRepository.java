package com.sathapana.application.repository;

import com.sathapana.application.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chhaichivon on 5/6/18
 */
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant,String> {

}
