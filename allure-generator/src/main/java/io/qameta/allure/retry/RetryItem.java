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
package io.qameta.allure.retry;

import io.qameta.allure.entity.Status;
import io.qameta.allure.entity.Time;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class RetryItem implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String uid;
    protected Status status;
    protected String statusDetails;
    protected Time time;

    public String getUid() {
        return this.uid;
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
    public RetryItem setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public RetryItem setStatus(final Status status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public RetryItem setStatusDetails(final String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public RetryItem setTime(final Time time) {
        this.time = time;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RetryItem)) {
            return false;
        }
        final RetryItem other = (RetryItem) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisuid = this.getUid();
        final Object otheruid = other.getUid();
        if (thisuid == null ? otheruid != null : !thisuid.equals(otheruid)) {
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
        return other instanceof RetryItem;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object uid = this.getUid();
        result = result * prime + (uid == null ? 43 : uid.hashCode());
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
        return "RetryItem(uid=" + this.getUid() + ", status=" + this.getStatus() + ", statusDetails=" + this.getStatusDetails() + ", time=" + this.getTime() + ")";
    }
}
