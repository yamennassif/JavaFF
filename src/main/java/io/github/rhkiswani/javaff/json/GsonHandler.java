/*
 * Copyright 2016 Mohamed Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.rhkiswani.javaff.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

/**
 * @author Mohamed Kiswani
 * @email rhkiswani@gmail.com
 * @url https://github.com/rhkiswani
 * @since 0.0.1
 *
 */
class GsonHandler implements JsonHandler {
    private final Gson gson = new GsonBuilder() .excludeFieldsWithModifiers(Modifier.STATIC) .create();


    @Override
    public <T> T fromJson(String json, Class clazz) {
        return (T) gson.fromJson(json, clazz);
    }

    @Override
    public String toJson(Object object) {
        return gson.toJson(object);
    }

    @Override
    public Object getImplementation() {
        return gson;
    }
}
