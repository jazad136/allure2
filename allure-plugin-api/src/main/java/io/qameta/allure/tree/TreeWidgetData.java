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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class TreeWidgetData implements Serializable {
    private static final long serialVersionUID = 1L;
    protected long total;
    protected List<TreeWidgetItem> items = new ArrayList<>();

    public long getTotal() {
        return this.total;
    }

    public List<TreeWidgetItem> getItems() {
        return this.items;
    }

    /**
     * @return {@code this}.
     */
    public TreeWidgetData setTotal(final long total) {
        this.total = total;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TreeWidgetData setItems(final List<TreeWidgetItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "TreeWidgetData(total=" + this.getTotal() + ", items=" + this.getItems() + ")";
    }
}
