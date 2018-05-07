package com.sathapana.application.controller;

import com.sathapana.application.model.Restaurant;
import com.sathapana.application.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

/**
 * @author chhaichivon on 5/6/18
 */
@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {

    private Map<String,Object> map;
    @Autowired
    private RestaurantService restaurantService;


    @RequestMapping(value = "",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String,Object>> findAll(){
        Page<Restaurant>  page = restaurantService.findAll(new PageRequest(0,100));
        map = new HashMap<>();
        map.put("data",page);
        map.put("status",200);
        map.put("message","success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


}
