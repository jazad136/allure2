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
package io.qameta.allure.tree;

import io.qameta.allure.entity.Statistic;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class TreeWidgetItem implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String uid;
    protected String name;
    protected Statistic statistic;

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
    public TreeWidgetItem setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TreeWidgetItem setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TreeWidgetItem setStatistic(final Statistic statistic) {
        this.statistic = statistic;
        return this;
    }

    @Override
    public String toString() {
        return "TreeWidgetItem(uid=" + this.getUid() + ", name=" + this.getName() + ", statistic=" + this.getStatistic() + ")";
    }
}
