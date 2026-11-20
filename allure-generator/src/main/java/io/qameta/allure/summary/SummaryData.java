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
package io.qameta.allure.summary;

import io.qameta.allure.entity.GroupTime;
import io.qameta.allure.entity.Statistic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class SummaryData implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String reportName;
    protected List<String> testRuns = new ArrayList<>();
    protected Statistic statistic = new Statistic();
    protected GroupTime time = new GroupTime();

    public String getReportName() {
        return this.reportName;
    }

    public List<String> getTestRuns() {
        return this.testRuns;
    }

    public Statistic getStatistic() {
        return this.statistic;
    }

    public GroupTime getTime() {
        return this.time;
    }

    /**
     * @return {@code this}.
     */
    public SummaryData setReportName(final String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public SummaryData setTestRuns(final List<String> testRuns) {
        this.testRuns = testRuns;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public SummaryData setStatistic(final Statistic statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public SummaryData setTime(final GroupTime time) {
        this.time = time;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SummaryData)) {
            return false;
        }
        final SummaryData other = (SummaryData) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisreportName = this.getReportName();
        final Object otherreportName = other.getReportName();
        if (thisreportName == null ? otherreportName != null : !thisreportName.equals(otherreportName)) {
            return false;
        }
        final Object thistestRuns = this.getTestRuns();
        final Object othertestRuns = other.getTestRuns();
        if (thistestRuns == null ? othertestRuns != null : !thistestRuns.equals(othertestRuns)) {
            return false;
        }
        final Object thisstatistic = this.getStatistic();
        final Object otherstatistic = other.getStatistic();
        if (thisstatistic == null ? otherstatistic != null : !thisstatistic.equals(otherstatistic)) {
            return false;
        }
        final Object thistime = this.getTime();
        final Object othertime = other.getTime();
        return !(thistime == null ? othertime != null : !thistime.equals(othertime));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SummaryData;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object reportName = this.getReportName();
        result = result * prime + (reportName == null ? 43 : reportName.hashCode());
        final Object testRuns = this.getTestRuns();
        result = result * prime + (testRuns == null ? 43 : testRuns.hashCode());
        final Object statistic = this.getStatistic();
        result = result * prime + (statistic == null ? 43 : statistic.hashCode());
        final Object time = this.getTime();
        result = result * prime + (time == null ? 43 : time.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SummaryData(reportName=" + this.getReportName() + ", testRuns=" + this.getTestRuns() + ", statistic=" + this.getStatistic() + ", time=" + this.getTime() + ")";
    }
}
