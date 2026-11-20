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
public class StageResult implements Serializable, Summarizable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected Time time;
    protected String description;
    protected String descriptionHtml;
    protected Status status;
    protected String statusMessage;
    protected String statusTrace;
    protected List<Step> steps = new ArrayList<>();
    protected List<Attachment> attachments = new ArrayList<>();
    protected List<Parameter> parameters = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public Time getTime() {
        return this.time;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getStatusTrace() {
        return this.statusTrace;
    }

    public List<Step> getSteps() {
        return this.steps;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setTime(final Time time) {
        this.time = time;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setDescriptionHtml(final String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setStatus(final Status status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setStatusTrace(final String statusTrace) {
        this.statusTrace = statusTrace;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setSteps(final List<Step> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setAttachments(final List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StageResult setParameters(final List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        return "StageResult(name=" + this.getName() + ", time=" + this.getTime() + ", description=" + this.getDescription() + ", descriptionHtml=" + this.getDescriptionHtml()
                + ", status=" + this.getStatus() + ", statusMessage=" + this.getStatusMessage() + ", statusTrace=" + this.getStatusTrace() + ", steps=" + this.getSteps()
                + ", attachments=" + this.getAttachments() + ", parameters=" + this.getParameters() + ")";
    }
}
