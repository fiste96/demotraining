/***************************************************************************
 *  Copyright 2016 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 **************************************************************************/


"use strict";
use(function () {
    var product = {};
    product.title = resource.properties["brand"];
    product.model = resource.properties["model"];
    product.color = resource.properties["color"];
    product.reviewCount = resource.properties["reviewCount"];
    product.ratingValue = resource.properties["ratingValue"];
    product.currency = resource.properties["currency"];
    product.price = resource.properties["price"];
    product.description = resource.properties["description"];
    product.img ="http://localhost:4502" + resource.properties["fileReference"];
    console.log(product.img);
    return product;
});


