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
 * Describes an attachment that belongs to the entire test run rather than to a test result.
 */
public class GlobalAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long timestamp;
    protected String uid;
    protected String name;
    protected String source;
    protected String type;
    protected Long size;

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUid() {
        return this.uid;
    }

    public String getName() {
        return this.name;
    }

    public String getSource() {
        return this.source;
    }

    public String getType() {
        return this.type;
    }

    public Long getSize() {
        return this.size;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setTimestamp(final Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setSource(final String source) {
        this.source = source;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setType(final String type) {
        this.type = type;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalAttachment setSize(final Long size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return "GlobalAttachment(timestamp=" + this.getTimestamp() + ", uid=" + this.getUid() + ", name=" + this.getName() + ", source=" + this.getSource() + ", type="
                + this.getType() + ", size=" + this.getSize() + ")";
    }
}
