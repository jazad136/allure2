/*
 *  Copyright 2016-2026 Qameta Software Inc
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
 */
package io.qameta.allure.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class EnvironmentItem implements Serializable {
    private static final long serialVersionUID = 1L;
    protected List<String> values = new ArrayList<>();
    protected String name;

    public List<String> getValues() {
        return this.values;
    }

    public String getName() {
        return this.name;
    }

    /**
     * @return {@code this}.
     */
    public EnvironmentItem setValues(final List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public EnvironmentItem setName(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "EnvironmentItem(values=" + this.getValues() + ", name=" + this.getName() + ")";
    }
}
