package com.auction.auction.data.models;

import java.util.List;

public class AddProductResponseModel {
    public String name;
    public String id;
    public Integer price;
    public Integer currentPrice;
    public String imageUrl;
    public String description;
    public String postedBy;
    public String categoryId;
    public List<String> bids;
    public String postedDate;
}