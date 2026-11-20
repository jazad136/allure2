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
public class Link implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected String url;
    protected String type;

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getType() {
        return this.type;
    }

    /**
     * @return {@code this}.
     */
    public Link setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Link setUrl(final String url) {
        this.url = url;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Link setType(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Link(name=" + this.getName() + ", url=" + this.getUrl() + ", type=" + this.getType() + ")";
    }
}
