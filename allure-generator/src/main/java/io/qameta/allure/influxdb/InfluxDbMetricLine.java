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
package io.qameta.allure.influxdb;

import io.qameta.allure.metric.MetricLine;

import java.io.Serializable;

/**
 * @author charlie (Dmitry Baev).
 */
public class InfluxDbMetricLine implements MetricLine, Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final String key;
    private final String value;
    private final long timestamp;

    @Override
    public String asString() {
        return String.format("%s %s=%s %d", getName(), normalize(getKey()), getValue(), getTimestamp());
    }

    public static String normalize(final String string) {
        return string.toLowerCase().replaceAll("\\s+", "_");
    }

    public InfluxDbMetricLine(final String name, final String key, final String value, final long timestamp) {
        this.name = name;
        this.key = key;
        this.value = value;
        this.timestamp = timestamp;
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

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InfluxDbMetricLine)) {
            return false;
        }
        final InfluxDbMetricLine other = (InfluxDbMetricLine) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        if (this.getTimestamp() != other.getTimestamp()) {
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
        return !(thisvalue == null ? othervalue != null : !thisvalue.equals(othervalue));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InfluxDbMetricLine;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final long timestamp = this.getTimestamp();
        result = result * prime + (int) (timestamp >>> 32 ^ timestamp);
        final Object name = this.getName();
        result = result * prime + (name == null ? 43 : name.hashCode());
        final Object key = this.getKey();
        result = result * prime + (key == null ? 43 : key.hashCode());
        final Object value = this.getValue();
        result = result * prime + (value == null ? 43 : value.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "InfluxDbMetricLine(name=" + this.getName() + ", key=" + this.getKey() + ", value=" + this.getValue() + ", timestamp=" + this.getTimestamp() + ")";
    }
}
