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
package io.qameta.allure.ga;

/**
 * Parameters for {@link GaPlugin}.
 *
 * @author eroshnkoam
 */
public class GaParameters {
    private String reportUuid;
    private String allureVersion;
    private String executorType;
    private String language;
    private String framework;
    private long resultsCount;
    private String resultsFormat;

    public String getReportUuid() {
        return this.reportUuid;
    }

    public String getAllureVersion() {
        return this.allureVersion;
    }

    public String getExecutorType() {
        return this.executorType;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getFramework() {
        return this.framework;
    }

    public long getResultsCount() {
        return this.resultsCount;
    }

    public String getResultsFormat() {
        return this.resultsFormat;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setReportUuid(final String reportUuid) {
        this.reportUuid = reportUuid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setAllureVersion(final String allureVersion) {
        this.allureVersion = allureVersion;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setExecutorType(final String executorType) {
        this.executorType = executorType;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setLanguage(final String language) {
        this.language = language;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setFramework(final String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setResultsCount(final long resultsCount) {
        this.resultsCount = resultsCount;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaParameters setResultsFormat(final String resultsFormat) {
        this.resultsFormat = resultsFormat;
        return this;
    }

    @Override
    public String toString() {
        return "GaParameters(reportUuid=" + this.getReportUuid() + ", allureVersion=" + this.getAllureVersion() + ", executorType=" + this.getExecutorType() + ", language="
                + this.getLanguage() + ", framework=" + this.getFramework() + ", resultsCount=" + this.getResultsCount() + ", resultsFormat=" + this.getResultsFormat() + ")";
    }
}
