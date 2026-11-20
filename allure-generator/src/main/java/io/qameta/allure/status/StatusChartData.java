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
package io.qameta.allure.status;

import io.qameta.allure.entity.Status;
import io.qameta.allure.entity.Time;
import io.qameta.allure.severity.SeverityLevel;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class StatusChartData implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String uid;
    protected String name;
    protected Time time;
    protected Status status;
    protected SeverityLevel severity;

    public String getUid() {
        return this.uid;
    }

    public String getName() {
        return this.name;
    }

    public Time getTime() {
        return this.time;
    }

    public Status getStatus() {
        return this.status;
    }

    public SeverityLevel getSeverity() {
        return this.severity;
    }

    /**
     * @return {@code this}.
     */
    public StatusChartData setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StatusChartData setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StatusChartData setTime(final Time time) {
        this.time = time;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StatusChartData setStatus(final Status status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public StatusChartData setSeverity(final SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StatusChartData)) {
            return false;
        }
        final StatusChartData other = (StatusChartData) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisuid = this.getUid();
        final Object otheruid = other.getUid();
        if (thisuid == null ? otheruid != null : !thisuid.equals(otheruid)) {
            return false;
        }
        final Object thisname = this.getName();
        final Object othername = other.getName();
        if (thisname == null ? othername != null : !thisname.equals(othername)) {
            return false;
        }
        final Object thistime = this.getTime();
        final Object othertime = other.getTime();
        if (thistime == null ? othertime != null : !thistime.equals(othertime)) {
            return false;
        }
        final Object thisstatus = this.getStatus();
        final Object otherstatus = other.getStatus();
        if (thisstatus == null ? otherstatus != null : !thisstatus.equals(otherstatus)) {
            return false;
        }
        final Object thisseverity = this.getSeverity();
        final Object otherseverity = other.getSeverity();
        return !(thisseverity == null ? otherseverity != null : !thisseverity.equals(otherseverity));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StatusChartData;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object uid = this.getUid();
        result = result * prime + (uid == null ? 43 : uid.hashCode());
        final Object name = this.getName();
        result = result * prime + (name == null ? 43 : name.hashCode());
        final Object time = this.getTime();
        result = result * prime + (time == null ? 43 : time.hashCode());
        final Object status = this.getStatus();
        result = result * prime + (status == null ? 43 : status.hashCode());
        final Object severity = this.getSeverity();
        result = result * prime + (severity == null ? 43 : severity.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "StatusChartData(uid=" + this.getUid() + ", name=" + this.getName() + ", time=" + this.getTime() + ", status=" + this.getStatus() + ", severity="
                + this.getSeverity() + ")";
    }
}
