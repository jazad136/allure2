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
public class ExecutorInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected String type;
    protected String url;
    protected Long buildOrder;
    protected String buildName;
    protected String buildUrl;
    protected String reportName;
    protected String reportUrl;

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public Long getBuildOrder() {
        return this.buildOrder;
    }

    public String getBuildName() {
        return this.buildName;
    }

    public String getBuildUrl() {
        return this.buildUrl;
    }

    public String getReportName() {
        return this.reportName;
    }

    public String getReportUrl() {
        return this.reportUrl;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setType(final String type) {
        this.type = type;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setUrl(final String url) {
        this.url = url;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setBuildOrder(final Long buildOrder) {
        this.buildOrder = buildOrder;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setBuildName(final String buildName) {
        this.buildName = buildName;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setBuildUrl(final String buildUrl) {
        this.buildUrl = buildUrl;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setReportName(final String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ExecutorInfo setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    @Override
    public String toString() {
        return "ExecutorInfo(name=" + this.getName() + ", type=" + this.getType() + ", url=" + this.getUrl() + ", buildOrder=" + this.getBuildOrder() + ", buildName="
                + this.getBuildName() + ", buildUrl=" + this.getBuildUrl() + ", reportName=" + this.getReportName() + ", reportUrl=" + this.getReportUrl() + ")";
    }
}
