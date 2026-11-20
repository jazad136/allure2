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
package io.qameta.allure.history;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.qameta.allure.entity.Statistic;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class HistoryTrendItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("data")
    @XmlElement(required = true)
    protected Statistic data;
    @XmlElement(
            required = true,
            type = Long.class,
            nillable = true
    )
    protected Long buildOrder;
    @XmlElement(required = true)
    protected String reportUrl;
    @XmlElement(required = true)
    protected String reportName;

    @JsonIgnore
    public Statistic getStatistic() {
        return data;
    }

    @JsonSetter("statistic")
    public HistoryTrendItem setStatistic(final Statistic statistic) {
        this.data = statistic;
        return this;
    }

    public Statistic getData() {
        return this.data;
    }

    public Long getBuildOrder() {
        return this.buildOrder;
    }

    public String getReportUrl() {
        return this.reportUrl;
    }

    public String getReportName() {
        return this.reportName;
    }

    /**
     * @return {@code this}.
     */
    public HistoryTrendItem setData(final Statistic data) {
        this.data = data;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryTrendItem setBuildOrder(final Long buildOrder) {
        this.buildOrder = buildOrder;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryTrendItem setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryTrendItem setReportName(final String reportName) {
        this.reportName = reportName;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HistoryTrendItem)) {
            return false;
        }
        final HistoryTrendItem other = (HistoryTrendItem) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisbuildOrder = this.getBuildOrder();
        final Object otherbuildOrder = other.getBuildOrder();
        if (thisbuildOrder == null ? otherbuildOrder != null : !thisbuildOrder.equals(otherbuildOrder)) {
            return false;
        }
        final Object thisdata = this.getData();
        final Object otherdata = other.getData();
        if (thisdata == null ? otherdata != null : !thisdata.equals(otherdata)) {
            return false;
        }
        final Object thisreportUrl = this.getReportUrl();
        final Object otherreportUrl = other.getReportUrl();
        if (thisreportUrl == null ? otherreportUrl != null : !thisreportUrl.equals(otherreportUrl)) {
            return false;
        }
        final Object thisreportName = this.getReportName();
        final Object otherreportName = other.getReportName();
        return !(thisreportName == null ? otherreportName != null : !thisreportName.equals(otherreportName));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HistoryTrendItem;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object buildOrder = this.getBuildOrder();
        result = result * prime + (buildOrder == null ? 43 : buildOrder.hashCode());
        final Object data = this.getData();
        result = result * prime + (data == null ? 43 : data.hashCode());
        final Object reportUrl = this.getReportUrl();
        result = result * prime + (reportUrl == null ? 43 : reportUrl.hashCode());
        final Object reportName = this.getReportName();
        result = result * prime + (reportName == null ? 43 : reportName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "HistoryTrendItem(data=" + this.getData() + ", buildOrder=" + this.getBuildOrder() + ", reportUrl=" + this.getReportUrl() + ", reportName=" + this.getReportName()
                + ")";
    }
}
