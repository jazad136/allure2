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
package io.qameta.allure.category;

import io.qameta.allure.entity.Label;
import io.qameta.allure.entity.Status;
import io.qameta.allure.entity.TestResult;

import java.util.List;

/**
 *
 * @author JonathanSaddler
 */
public class CategoriesPluginTestHelper {
    TestResult first;
    TestResult second;
    TestResult third;
    TestResult other;
    public CategoriesPluginTestHelper() {
        Label myLabel = new Label();
        myLabel.setName("acctValueStream");
        myLabel.setValue("acquire-to-dispose");
        first = new TestResult()
                .setName("first")
                .setStatus(Status.FAILED)
                .setStatusMessage("A")
                .setLabels(List.of(myLabel));
        myLabel = new Label();
        myLabel.setName("acctValueStream");
        myLabel.setValue("bill-to-collect");
        second = new TestResult()
                .setName("second")
                .setStatus(Status.BROKEN)
                .setStatusMessage("B")
                .setLabels(List.of(myLabel));
        myLabel = new Label();
        myLabel.setName("acctValueStream");
        myLabel.setValue("acquire-to-dispose");
        third = new TestResult()
                .setName("third")
                .setStatus(Status.PASSED)
                .setStatusMessage("C")
                .setLabels(List.of(myLabel));
        myLabel = new Label();
        myLabel.setName("acctValueStream");
        myLabel.setValue("budget-formulation-to-execution");
        other = new TestResult()
                .setName("other")
                .setStatus(Status.PASSED)
                .setStatusMessage("O")
                .setLabels(List.of(myLabel));
    }
}
