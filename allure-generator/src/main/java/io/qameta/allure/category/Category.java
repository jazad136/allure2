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
package io.qameta.allure.category;

import io.qameta.allure.entity.Status;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected String description;
    protected String descriptionHtml;
    protected String messageRegex;
    protected String traceRegex;
    protected String groupByLabel;
    protected List<String> groupByLabelValue;
    protected List<Status> matchedStatuses = new ArrayList<>();
    protected Boolean flaky;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    public String getMessageRegex() {
        return this.messageRegex;
    }

    public String getTraceRegex() {
        return this.traceRegex;
    }

    public List<Status> getMatchedStatuses() {
        return this.matchedStatuses;
    }

    public Boolean getFlaky() {
        return this.flaky;
    }
    public String getGroupByLabel() { 
        return this.groupByLabel;
    }
    
    public List<String> getGroupByLabelValue() { 
        return this.groupByLabelValue;
    }

    /**
     * @return {@code this}.
     */
    public Category setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setDescriptionHtml(final String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setMessageRegex(final String messageRegex) {
        this.messageRegex = messageRegex;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setTraceRegex(final String traceRegex) {
        this.traceRegex = traceRegex;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setMatchedStatuses(final List<Status> matchedStatuses) {
        this.matchedStatuses = matchedStatuses;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Category setFlaky(final Boolean flaky) {
        this.flaky = flaky;
        return this;
    }

    public Category setGroupByLabel(String groupByLabel) { 
        this.groupByLabel = groupByLabel;
        return this;
    }
    public Category setGroupByLabelValue(List<String> groupByLabelValue) { 
        this.groupByLabelValue = groupByLabelValue;
        return this;
    }
    @Override
    public String toString() {
        return "Category(name=" + this.getName() + ", description=" + this.getDescription() + ", descriptionHtml=" + this.getDescriptionHtml() + ", messageRegex="
                + this.getMessageRegex() + ", traceRegex=" + this.getTraceRegex() + ", matchedStatuses=" + this.getMatchedStatuses() + ", flaky=" + this.getFlaky() + ")";
    }
}
