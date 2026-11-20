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
package io.qameta.allure.allure2;

import java.util.ArrayList;
import java.util.List;

/**
 * Allure 2 run-level data stored in {@code *-globals.json} files.
 */
public class Allure2Globals {

    private List<Error> errors = new ArrayList<>();
    private List<Attachment> attachments = new ArrayList<>();

    public static class Error {

        private Long timestamp;
        private String message;
        private String trace;
        private String actual;
        private String expected;

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
        public Allure2Globals.Error setTimestamp(final Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Error setMessage(final String message) {
            this.message = message;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Error setTrace(final String trace) {
            this.trace = trace;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Error setActual(final String actual) {
            this.actual = actual;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Error setExpected(final String expected) {
            this.expected = expected;
            return this;
        }

        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Allure2Globals.Error)) {
                return false;
            }
            final Allure2Globals.Error other = (Allure2Globals.Error) o;
            if (!other.canEqual((Object) this)) {
                return false;
            }
            final Object timestamp = this.getTimestamp();
            final Object othertimestamp = other.getTimestamp();
            if (timestamp == null ? othertimestamp != null : !timestamp.equals(othertimestamp)) {
                return false;
            }
            final Object message = this.getMessage();
            final Object othermessage = other.getMessage();
            if (message == null ? othermessage != null : !message.equals(othermessage)) {
                return false;
            }
            final Object trace = this.getTrace();
            final Object othertrace = other.getTrace();
            if (trace == null ? othertrace != null : !trace.equals(othertrace)) {
                return false;
            }
            final Object actual = this.getActual();
            final Object otheractual = other.getActual();
            if (actual == null ? otheractual != null : !actual.equals(otheractual)) {
                return false;
            }
            final Object expected = this.getExpected();
            final Object otherexpected = other.getExpected();
            return !(expected == null ? otherexpected != null : !expected.equals(otherexpected));
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Allure2Globals.Error;
        }

        @Override
        public int hashCode() {
            final int prime = 59;
            int result = 1;
            final Object timestamp = this.getTimestamp();
            result = result * prime + (timestamp == null ? 43 : timestamp.hashCode());
            final Object message = this.getMessage();
            result = result * prime + (message == null ? 43 : message.hashCode());
            final Object trace = this.getTrace();
            result = result * prime + (trace == null ? 43 : trace.hashCode());
            final Object actual = this.getActual();
            result = result * prime + (actual == null ? 43 : actual.hashCode());
            final Object expected = this.getExpected();
            result = result * prime + (expected == null ? 43 : expected.hashCode());
            return result;
        }

    }

    public static class Attachment {

        private Long timestamp;
        private String name;
        private String type;
        private String source;

        public Long getTimestamp() {
            return this.timestamp;
        }

        public String getName() {
            return this.name;
        }

        public String getType() {
            return this.type;
        }

        public String getSource() {
            return this.source;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Attachment setTimestamp(final Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Attachment setName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Attachment setType(final String type) {
            this.type = type;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Allure2Globals.Attachment setSource(final String source) {
            this.source = source;
            return this;
        }

        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Allure2Globals.Attachment)) {
                return false;
            }
            final Allure2Globals.Attachment other = (Allure2Globals.Attachment) o;
            if (!other.canEqual((Object) this)) {
                return false;
            }
            final Object timestamp = this.getTimestamp();
            final Object othertimestamp = other.getTimestamp();
            if (timestamp == null ? othertimestamp != null : !timestamp.equals(othertimestamp)) {
                return false;
            }
            final Object name = this.getName();
            final Object othername = other.getName();
            if (name == null ? othername != null : !name.equals(othername)) {
                return false;
            }
            final Object type = this.getType();
            final Object othertype = other.getType();
            if (type == null ? othertype != null : !type.equals(othertype)) {
                return false;
            }
            final Object source = this.getSource();
            final Object othersource = other.getSource();
            return !(source == null ? othersource != null : !source.equals(othersource));
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Allure2Globals.Attachment;
        }

        @Override
        public int hashCode() {
            final int prime = 59;
            int result = 1;
            final Object timestamp = this.getTimestamp();
            result = result * prime + (timestamp == null ? 43 : timestamp.hashCode());
            final Object name = this.getName();
            result = result * prime + (name == null ? 43 : name.hashCode());
            final Object type = this.getType();
            result = result * prime + (type == null ? 43 : type.hashCode());
            final Object source = this.getSource();
            result = result * prime + (source == null ? 43 : source.hashCode());
            return result;
        }

    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    /**
     * @return {@code this}.
     */
    public Allure2Globals setErrors(final List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public Allure2Globals setAttachments(final List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Allure2Globals)) {
            return false;
        }
        final Allure2Globals other = (Allure2Globals) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object errors = this.getErrors();
        final Object othererrors = other.getErrors();
        if (errors == null ? othererrors != null : !errors.equals(othererrors)) {
            return false;
        }
        final Object attachments = this.getAttachments();
        final Object otherattachments = other.getAttachments();
        return !(attachments == null ? otherattachments != null : !attachments.equals(otherattachments));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Allure2Globals;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        final Object errors = this.getErrors();
        result = result * prime + (errors == null ? 43 : errors.hashCode());
        final Object attachments = this.getAttachments();
        result = result * prime + (attachments == null ? 43 : attachments.hashCode());
        return result;
    }
}
