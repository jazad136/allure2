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
package io.qameta.allure.ga;

/**
 * @author charlie (Dmitry Baev).
 */
public class GaEvent {
    private String name;
    private Object params;

    public String getName() {
        return this.name;
    }

    public Object getParams() {
        return this.params;
    }

    /**
     * @return {@code this}.
     */
    public GaEvent setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaEvent setParams(final Object params) {
        this.params = params;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GaEvent)) {
            return false;
        }
        final GaEvent other = (GaEvent) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object name = this.getName();
        final Object othername = other.getName();
        if (name == null ? othername != null : !name.equals(othername)) {
            return false;
        }
        final Object params = this.getParams();
        final Object otherparams = other.getParams();
        return !(params == null ? otherparams != null : !params.equals(otherparams));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GaEvent;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object name = this.getName();
        result = result * prime + (name == null ? 43 : name.hashCode());
        final Object params = this.getParams();
        result = result * prime + (params == null ? 43 : params.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "GaEvent(name=" + this.getName() + ", params=" + this.getParams() + ")";
    }
}
