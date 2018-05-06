package com.sathapana.application.service;

import com.sathapana.application.model.Restaurant;
import com.sathapana.application.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author chhaichivon on 5/6/18
 */
@Service
public class RestaurantService implements BaseService<Restaurant> {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant insert(Restaurant entity) {
        return restaurantRepository.save(entity);
    }

    @Override
    public Page<Restaurant> findAll(PageRequest  pageRequest) {
        return restaurantRepository.findAll(pageRequest);
    }

}
