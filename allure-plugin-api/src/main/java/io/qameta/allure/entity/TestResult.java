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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.nullsFirst;

/**
 * @author charlie (Dmitry Baev).
 */
// this test result model class should not be reduced further
// as its fields will be useful in the processed JSON
@SuppressWarnings("PMD")
public class TestResult implements Serializable, Nameable, Parameterizable, Statusable, Timeable {
    private static final long serialVersionUID = 1L;
    protected String uid;
    protected String name;
    protected String fullName;
    @JsonIgnore
    protected String testCaseHash;
    @JsonIgnore
    protected String parametersHash;
    @JsonIgnore
    protected transient String legacyHistoryId;
    protected String testId;
    protected Time time = new Time();
    protected String description;
    protected String descriptionHtml;
    protected Status status;
    protected String statusMessage;
    protected String statusTrace;
    protected boolean flaky;
    protected boolean newFailed;
    protected boolean newBroken;
    protected boolean newPassed;
    protected int retriesCount;
    protected boolean retriesStatusChange;
    //    Execution
    protected List<StageResult> beforeStages = new ArrayList<>();
    protected StageResult testStage;
    protected List<StageResult> afterStages = new ArrayList<>();
    //    Meta
    protected List<Label> labels = new ArrayList<>();
    protected List<Parameter> parameters = new ArrayList<>();
    protected List<Link> links = new ArrayList<>();
    protected boolean hidden;
    protected boolean retry;
    protected final Map<String, Object> extra = new HashMap<>();

    @JsonProperty
    public String getSource() {
        return getUid() + ".json";
    }

    @JsonIgnore
    public String getRetryHash() {
        return testCaseHash == null || parametersHash == null ? null : testCaseHash + "." + parametersHash;
    }

    public void addExtraBlock(final String blockName, final Object block) {
        extra.put(blockName, block);
    }

    @SuppressWarnings("unchecked")
    public <T> T getExtraBlock(final String blockName, final T defaultValue) {
        return (T) extra.computeIfAbsent(blockName, name -> defaultValue);
    }

    @SuppressWarnings("unchecked")
    public <T> T getExtraBlock(final String blockName) {
        return (T) extra.get(blockName);
    }

    public boolean hasExtraBlock(final String blockName) {
        return extra.containsKey(blockName);
    }

    public <T> T findAllLabels(final LabelName name, final Collector<String, ?, T> collector) {
        return findAllLabels(name.value(), collector);
    }

    public <T> T findAllLabels(final String name, final Collector<String, ?, T> collector) {
        return getLabels().stream().filter(label -> name.equals(label.getName())).map(Label::getValue).collect(collector);
    }

    public List<String> findAllLabels(final LabelName name) {
        return findAllLabels(name, Collectors.toList());
    }

    public List<String> findAllLabels(final String name) {
        return findAllLabels(name, Collectors.toList());
    }

    public Optional<String> findOneLabel(final LabelName name) {
        return findOneLabel(name.value());
    }

    public Optional<String> findOneLabel(final String name) {
        return getLabels().stream().filter(label -> name.equals(label.getName())).findAny().map(Label::getValue);
    }

    public void addLabelIfNotExists(final LabelName name, final String value) {
        addLabelIfNotExists(name.value(), value);
    }

    public void addLabelIfNotExists(final String name, final String value) {
        if (value == null || name == null) {
            return;
        }
        final Optional<String> any = getLabels().stream().map(Label::getName).filter(name::equals).findAny();
        if (!any.isPresent()) {
            addLabel(name, value);
        }
    }

    public void addLabel(final String name, final String value) {
        getLabels().add(new Label().setName(name).setValue(value));
    }

    public static Comparator<TestResult> comparingByTime() {
        return comparingByTimeAsc().reversed();
    }

    public static Comparator<TestResult> comparingByTimeAsc() {
        return comparing(TestResult::getTime, nullsFirst(comparing(Time::getStart, nullsFirst(naturalOrder()))));
    }

    public Map<String, String> toMap() {
        final Map<String, String> map = new HashMap<>();
        for (Label l : getLabels()) {
            map.put(l.getName(), l.getValue());
        }
        return map;
    }

    public String getUid() {
        return this.uid;
    }

    public String getName() {
        return this.name;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getTestCaseHash() {
        return this.testCaseHash;
    }

    public String getParametersHash() {
        return this.parametersHash;
    }

    public String getLegacyHistoryId() {
        return this.legacyHistoryId;
    }

    public String getTestId() {
        return this.testId;
    }

    public Time getTime() {
        return this.time;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getStatusTrace() {
        return this.statusTrace;
    }

    public boolean isFlaky() {
        return this.flaky;
    }

    public boolean isNewFailed() {
        return this.newFailed;
    }

    public boolean isNewBroken() {
        return this.newBroken;
    }

    public boolean isNewPassed() {
        return this.newPassed;
    }

    public int getRetriesCount() {
        return this.retriesCount;
    }

    public boolean isRetriesStatusChange() {
        return this.retriesStatusChange;
    }

    public List<StageResult> getBeforeStages() {
        return this.beforeStages;
    }

    public StageResult getTestStage() {
        return this.testStage;
    }

    public List<StageResult> getAfterStages() {
        return this.afterStages;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isRetry() {
        return this.retry;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setUid(final String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setFullName(final String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setTestCaseHash(final String testCaseHash) {
        this.testCaseHash = testCaseHash;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setParametersHash(final String parametersHash) {
        this.parametersHash = parametersHash;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setLegacyHistoryId(final String legacyHistoryId) {
        this.legacyHistoryId = legacyHistoryId;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setTestId(final String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setTime(final Time time) {
        this.time = time;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setDescriptionHtml(final String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setStatus(final Status status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setStatusTrace(final String statusTrace) {
        this.statusTrace = statusTrace;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setFlaky(final boolean flaky) {
        this.flaky = flaky;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setNewFailed(final boolean newFailed) {
        this.newFailed = newFailed;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setNewBroken(final boolean newBroken) {
        this.newBroken = newBroken;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setNewPassed(final boolean newPassed) {
        this.newPassed = newPassed;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setRetriesCount(final int retriesCount) {
        this.retriesCount = retriesCount;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setRetriesStatusChange(final boolean retriesStatusChange) {
        this.retriesStatusChange = retriesStatusChange;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setBeforeStages(final List<StageResult> beforeStages) {
        this.beforeStages = beforeStages;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setTestStage(final StageResult testStage) {
        this.testStage = testStage;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setAfterStages(final List<StageResult> afterStages) {
        this.afterStages = afterStages;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setLabels(final List<Label> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setParameters(final List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setLinks(final List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setHidden(final boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public TestResult setRetry(final boolean retry) {
        this.retry = retry;
        return this;
    }

    @Override
    public String toString() {
        return "TestResult(uid=" + this.getUid() + ", name=" + this.getName() + ", fullName=" + this.getFullName() + ", testCaseHash=" + this.getTestCaseHash()
                + ", parametersHash=" + this.getParametersHash() + ", legacyHistoryId=" + this.getLegacyHistoryId() + ", testId=" + this.getTestId() + ", time=" + this.getTime()
                + ", description=" + this.getDescription() + ", descriptionHtml=" + this.getDescriptionHtml() + ", status=" + this.getStatus() + ", statusMessage="
                + this.getStatusMessage() + ", statusTrace=" + this.getStatusTrace() + ", flaky=" + this.isFlaky() + ", newFailed=" + this.isNewFailed() + ", newBroken="
                + this.isNewBroken() + ", newPassed=" + this.isNewPassed() + ", retriesCount=" + this.getRetriesCount() + ", retriesStatusChange=" + this.isRetriesStatusChange()
                + ", beforeStages=" + this.getBeforeStages() + ", testStage=" + this.getTestStage() + ", afterStages=" + this.getAfterStages() + ", labels=" + this.getLabels()
                + ", parameters=" + this.getParameters() + ", links=" + this.getLinks() + ", hidden=" + this.isHidden() + ", retry=" + this.isRetry() + ", extra=" + this.getExtra()
                + ")";
    }
}
