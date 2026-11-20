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

/**
 * @author charlie (Dmitry Baev).
 */
public class Label implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * @return {@code this}.
     */
    public Label setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Label setValue(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Label(name=" + this.getName() + ", value=" + this.getValue() + ")";
    }
}
