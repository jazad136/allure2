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
package io.qameta.allure.prometheus;

import io.qameta.allure.metric.MetricLine;

/**
 * @author charlie (Dmitry Baev).
 */
public class PrometheusMetricLine implements MetricLine {

    private static final long serialVersionUID = 1L;
    private final String name;
    private final String key;
    private final String value;
    private final String labels;

    @Override
    public String asString() {
        return String.format("%s_%s%s %s", getName(), normalize(getKey()), normalizeLabels(getLabels()), getValue());
    }

    public static String normalize(final String string) {
        return string.toLowerCase().replaceAll("\\s+", "_");
    }

    private String normalizeLabels(final String labels) {
        return labels == null ? "" : "{" + labels + "}";
    }

    public PrometheusMetricLine(final String name, final String key, final String value, final String labels) {
        this.name = name;
        this.key = key;
        this.value = value;
        this.labels = labels;
    }

    public String getName() {
        return this.name;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String getLabels() {
        return this.labels;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PrometheusMetricLine)) {
            return false;
        }
        final PrometheusMetricLine other = (PrometheusMetricLine) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisname = this.getName();
        final Object othername = other.getName();
        if (thisname == null ? othername != null : !thisname.equals(othername)) {
            return false;
        }
        final Object thiskey = this.getKey();
        final Object otherkey = other.getKey();
        if (thiskey == null ? otherkey != null : !thiskey.equals(otherkey)) {
            return false;
        }
        final Object thisvalue = this.getValue();
        final Object othervalue = other.getValue();
        if (thisvalue == null ? othervalue != null : !thisvalue.equals(othervalue)) {
            return false;
        }
        final Object thislabels = this.getLabels();
        final Object otherlabels = other.getLabels();
        return !(thislabels == null ? otherlabels != null : !thislabels.equals(otherlabels));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PrometheusMetricLine;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object name = this.getName();
        result = result * prime + (name == null ? 43 : name.hashCode());
        final Object key = this.getKey();
        result = result * prime + (key == null ? 43 : key.hashCode());
        final Object value = this.getValue();
        result = result * prime + (value == null ? 43 : value.hashCode());
        final Object labels = this.getLabels();
        result = result * prime + (labels == null ? 43 : labels.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PrometheusMetricLine(name=" + this.getName() + ", key=" + this.getKey() + ", value=" + this.getValue() + ", labels=" + this.getLabels() + ")";
    }
}
