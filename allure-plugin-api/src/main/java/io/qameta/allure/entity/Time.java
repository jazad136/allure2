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
package io.qameta.allure.entity;

import java.io.Serializable;

import static java.util.Objects.isNull;

/**
 * @author charlie (Dmitry Baev).
 */
public class Time implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long start;
    protected Long stop;
    protected Long duration;

    public static Time create(final Long duration) {
        return new Time().setDuration(duration);
    }

    public static Time create(final Long start, final Long stop) {
        return new Time().setStart(start).setStop(stop).setDuration(isNull(start) || isNull(stop) ? null : stop - start);
    }

    public Long getStart() {
        return this.start;
    }

    public Long getStop() {
        return this.stop;
    }

    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return {@code this}.
     */
    public Time setStart(final Long start) {
        this.start = start;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Time setStop(final Long stop) {
        this.stop = stop;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Time setDuration(final Long duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Time)) {
            return false;
        }
        final Time other = (Time) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisstart = this.getStart();
        final Object otherstart = other.getStart();
        if (thisstart == null ? otherstart != null : !thisstart.equals(otherstart)) {
            return false;
        }
        final Object thisstop = this.getStop();
        final Object otherstop = other.getStop();
        if (thisstop == null ? otherstop != null : !thisstop.equals(otherstop)) {
            return false;
        }
        final Object thisduration = this.getDuration();
        final Object otherduration = other.getDuration();
        return !(thisduration == null ? otherduration != null : !thisduration.equals(otherduration));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Time;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object start = this.getStart();
        result = result * prime + (start == null ? 43 : start.hashCode());
        final Object stop = this.getStop();
        result = result * prime + (stop == null ? 43 : stop.hashCode());
        final Object duration = this.getDuration();
        result = result * prime + (duration == null ? 43 : duration.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Time(start=" + this.getStart() + ", stop=" + this.getStop() + ", duration=" + this.getDuration() + ")";
    }
}
