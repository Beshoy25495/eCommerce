package com.sheryians.major.dto;

import com.sheryians.major.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    //used to transfer data between itself and the UI layer.

    private long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
