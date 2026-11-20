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
package io.qameta.allure.launch;

import io.qameta.allure.entity.Statistic;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class LaunchInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String uid;
    protected String name;
    protected Statistic statistic = new Statistic();

    public String getUid() {
        return this.uid;
    }

    public String getName() {
        return this.name;
    }

    public Statistic getStatistic() {
        return this.statistic;
    }

    /**
     * @return {@code this}.
     */
    public LaunchInfo setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public LaunchInfo setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public LaunchInfo setStatistic(final Statistic statistic) {
        this.statistic = statistic;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LaunchInfo)) {
            return false;
        }
        final LaunchInfo other = (LaunchInfo) o;
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
        final Object thisstatistic = this.getStatistic();
        final Object otherstatistic = other.getStatistic();
        return !(thisstatistic == null ? otherstatistic != null : !thisstatistic.equals(otherstatistic));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LaunchInfo;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object uid = this.getUid();
        result = result * prime + (uid == null ? 43 : uid.hashCode());
        final Object name = this.getName();
        result = result * prime + (name == null ? 43 : name.hashCode());
        final Object statistic = this.getStatistic();
        result = result * prime + (statistic == null ? 43 : statistic.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "LaunchInfo(uid=" + this.getUid() + ", name=" + this.getName() + ", statistic=" + this.getStatistic() + ")";
    }
}
