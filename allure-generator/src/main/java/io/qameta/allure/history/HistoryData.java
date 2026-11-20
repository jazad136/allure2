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

import io.qameta.allure.entity.Statistic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class HistoryData implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Statistic statistic = new Statistic();
    protected List<HistoryItem> items = new ArrayList<>();

    public Statistic getStatistic() {
        return this.statistic;
    }

    public List<HistoryItem> getItems() {
        return this.items;
    }

    /**
     * @return {@code this}.
     */
    public HistoryData setStatistic(final Statistic statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public HistoryData setItems(final List<HistoryItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HistoryData)) {
            return false;
        }
        final HistoryData other = (HistoryData) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisstatistic = this.getStatistic();
        final Object otherstatistic = other.getStatistic();
        if (thisstatistic == null ? otherstatistic != null : !thisstatistic.equals(otherstatistic)) {
            return false;
        }
        final Object thisitems = this.getItems();
        final Object otheritems = other.getItems();
        return !(thisitems == null ? otheritems != null : !thisitems.equals(otheritems));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HistoryData;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object statistic = this.getStatistic();
        result = result * prime + (statistic == null ? 43 : statistic.hashCode());
        final Object items = this.getItems();
        result = result * prime + (items == null ? 43 : items.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "HistoryData(statistic=" + this.getStatistic() + ", items=" + this.getItems() + ")";
    }
}
