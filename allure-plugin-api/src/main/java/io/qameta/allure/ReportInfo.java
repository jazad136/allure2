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
package io.qameta.allure;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class ReportInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String allureVersion;
    private String reportUuid;

    public String getAllureVersion() {
        return this.allureVersion;
    }

    public String getReportUuid() {
        return this.reportUuid;
    }

    /**
     * @return {@code this}.
     */
    public ReportInfo setAllureVersion(final String allureVersion) {
        this.allureVersion = allureVersion;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public ReportInfo setReportUuid(final String reportUuid) {
        this.reportUuid = reportUuid;
        return this;
    }

    @Override
    public String toString() {
        return "ReportInfo(allureVersion=" + this.getAllureVersion() + ", reportUuid=" + this.getReportUuid() + ")";
    }
}
