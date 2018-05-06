package com.sathapana.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chhaichivon on 5/6/18
 */
@Data
@Document(collection = "tbl_restaurant")
public class Restaurant {

    @Id
    private String id;

    private String name;
    private String nameEn;
    private String des;
    private String desEn;

}
