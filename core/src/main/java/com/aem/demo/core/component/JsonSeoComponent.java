/*
 *   Copyright 2016 Adobe Systems Incorporated
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.aem.demo.core.component;

import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.demo.core.bean.JsonSeo;

public class JsonSeoComponent
        extends WCMUsePojo
{

    /** The hero text bean. */
    private JsonSeo jsonSeo = null;

    @Override
    public void activate() throws Exception {

        jsonSeo = new JsonSeo();

        //Get the values that the author entered into the AEM dialog

        String type = getProperties().get("price","");

        //Set the Bean with all the dialog values

        jsonSeo.setType(type);
    }

    public JsonSeo getJsonSeo() {
        return this.jsonSeo;
    }
}