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

/**
 * Describes an error that belongs to the entire test run rather than to a test result.
 */
public class GlobalError implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long timestamp;
    protected String message;
    protected String trace;
    protected String actual;
    protected String expected;

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTrace() {
        return this.trace;
    }

    public String getActual() {
        return this.actual;
    }

    public String getExpected() {
        return this.expected;
    }

    /**
     * @return {@code this}.
     */
    public GlobalError setTimestamp(final Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalError setMessage(final String message) {
        this.message = message;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalError setTrace(final String trace) {
        this.trace = trace;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalError setActual(final String actual) {
        this.actual = actual;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GlobalError setExpected(final String expected) {
        this.expected = expected;
        return this;
    }
    @Override
    public String toString() {
        return "GlobalError(timestamp=" + this.getTimestamp() + ", message=" + this.getMessage() + ", trace=" + this.getTrace() + ", actual=" + this.getActual() + ", expected="
                + this.getExpected() + ")";
    }
}
