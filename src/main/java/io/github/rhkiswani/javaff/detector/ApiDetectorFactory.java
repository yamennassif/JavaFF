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
package io.github.rhkiswani.javaff.detector;

import io.github.rhkiswani.javaff.factory.AbstractFactory;

/**
 * @author Mohamed Kiswani
 * @email rhkiswani@gmail.com
 * @url https://github.com/rhkiswani
 * @since 0.0.1
 *
 */
public class ApiDetectorFactory extends AbstractFactory<ApiDetector>{
    private static ApiDetectorFactory instance = new ApiDetectorFactory();

    private ApiDetectorFactory(){
    }

    public static ApiDetectorFactory instance(){
        return instance;
    }

    @Override
    protected ApiDetector getDefault(Class targetClazz) {
        return new DefaultApiDetectorHandler();
    }

    public static ApiDetector getDetector() {
        return instance.create(ApiDetectorFactory.class);
    }

}
