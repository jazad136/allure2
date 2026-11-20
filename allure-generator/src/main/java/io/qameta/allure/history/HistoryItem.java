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

import io.qameta.allure.entity.Status;
import io.qameta.allure.entity.Time;

import java.io.Serializable;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.nullsFirst;

/**
 * @author charlie (Dmitry Baev).
 */
public class HistoryItem implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String uid;
    protected String reportUrl;
    protected Status status;
    protected String statusDetails;
    protected Time time;

    public static Comparator<HistoryItem> comparingByTime() {
        return comparingByTimeAsc().reversed();
    }

    public static Comparator<HistoryItem> comparingByTimeAsc() {
        return comparing(HistoryItem::getTime, nullsFirst(comparing(Time::getStart, nullsFirst(naturalOrder()))));
    }

    public String getUid() {
        return this.uid;
    }

    public String getReportUrl() {
        return this.reportUrl;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStatusDetails() {
        return this.statusDetails;
    }

    public Time getTime() {
        return this.time;
    }

    /**
     * @return {@code this}.
     */
    public HistoryItem setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryItem setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryItem setStatus(final Status status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryItem setStatusDetails(final String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryItem setTime(final Time time) {
        this.time = time;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HistoryItem)) {
            return false;
        }
        final HistoryItem other = (HistoryItem) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisuid = this.getUid();
        final Object otheruid = other.getUid();
        if (thisuid == null ? otheruid != null : !thisuid.equals(otheruid)) {
            return false;
        }
        final Object thisreportUrl = this.getReportUrl();
        final Object otherreportUrl = other.getReportUrl();
        if (thisreportUrl == null ? otherreportUrl != null : !thisreportUrl.equals(otherreportUrl)) {
            return false;
        }
        final Object thisstatus = this.getStatus();
        final Object otherstatus = other.getStatus();
        if (thisstatus == null ? otherstatus != null : !thisstatus.equals(otherstatus)) {
            return false;
        }
        final Object thisstatusDetails = this.getStatusDetails();
        final Object otherstatusDetails = other.getStatusDetails();
        if (thisstatusDetails == null ? otherstatusDetails != null : !thisstatusDetails.equals(otherstatusDetails)) {
            return false;
        }
        final Object thistime = this.getTime();
        final Object othertime = other.getTime();
        return !(thistime == null ? othertime != null : !thistime.equals(othertime));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HistoryItem;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object uid = this.getUid();
        result = result * prime + (uid == null ? 43 : uid.hashCode());
        final Object reportUrl = this.getReportUrl();
        result = result * prime + (reportUrl == null ? 43 : reportUrl.hashCode());
        final Object status = this.getStatus();
        result = result * prime + (status == null ? 43 : status.hashCode());
        final Object statusDetails = this.getStatusDetails();
        result = result * prime + (statusDetails == null ? 43 : statusDetails.hashCode());
        final Object time = this.getTime();
        result = result * prime + (time == null ? 43 : time.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "HistoryItem(uid=" + this.getUid() + ", reportUrl=" + this.getReportUrl() + ", status=" + this.getStatus() + ", statusDetails=" + this.getStatusDetails() + ", time="
                + this.getTime() + ")";
    }
}
