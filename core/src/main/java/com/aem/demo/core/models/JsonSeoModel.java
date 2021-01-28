package com.aem.demo.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.aem.demo.core.bean.JsonSeo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class)
public class JsonSeoModel {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    //Get all dialog fields by using the inject annotation


    @Inject @Optional
    public String description;

    @Inject @Optional
    public String brand;

    @Inject @Optional
    public String model;

    @Inject @Optional
    public String color;

    @Inject @Optional
    public String price;

    @Inject @Optional
    public String currency;

    @Inject @Optional
    public String reviewCount;

    @Inject @Optional
    public String ratingValue;

    @Inject @Optional
    public String fileReference;



    /** The hero text bean. */
    private JsonSeo jsonSeo = null;

    @PostConstruct
    protected void init() {
        LOG.info("In the  **** INIT *** method");

        jsonSeo = new JsonSeo();

        //Set the Bean with all the dialgo values
        jsonSeo.setDescription(description);
        jsonSeo.setBrand(brand);
        jsonSeo.setModel(model);
        jsonSeo.setColor(color);
        jsonSeo.setPrice(price);
        jsonSeo.setCurrency(currency);
        jsonSeo.setReviewCount(reviewCount);
        jsonSeo.setRatingValue(ratingValue);
        jsonSeo.setImage(fileReference);




    }
    public JsonSeo getJsonSeo() {
        return this.jsonSeo;
    }
}