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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class GaRequest {
    @JsonProperty("client_id")
    private String clientId;
    private List<GaEvent> events;

    public String getClientId() {
        return this.clientId;
    }

    public List<GaEvent> getEvents() {
        return this.events;
    }

    /**
     * @return {@code this}.
     */
    public GaRequest setClientId(final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public GaRequest setEvents(final List<GaEvent> events) {
        this.events = events;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GaRequest)) {
            return false;
        }
        final GaRequest other = (GaRequest) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object thisclientId = this.getClientId();
        final Object otherclientId = other.getClientId();
        if (thisclientId == null ? otherclientId != null : !thisclientId.equals(otherclientId)) {
            return false;
        }
        final Object thisevents = this.getEvents();
        final Object otherevents = other.getEvents();
        return !(thisevents == null ? otherevents != null : !thisevents.equals(otherevents));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GaRequest;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object clientId = this.getClientId();
        result = result * prime + (clientId == null ? 43 : clientId.hashCode());
        final Object events = this.getEvents();
        result = result * prime + (events == null ? 43 : events.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "GaRequest(clientId=" + this.getClientId() + ", events=" + this.getEvents() + ")";
    }
}
