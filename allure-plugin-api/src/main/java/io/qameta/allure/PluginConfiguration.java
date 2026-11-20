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
package io.qameta.allure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class PluginConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String description;
    private List<String> extensions = new ArrayList<>();
    private List<String> jsFiles = new ArrayList<>();
    private List<String> cssFiles = new ArrayList<>();

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getExtensions() {
        return this.extensions;
    }

    public List<String> getJsFiles() {
        return this.jsFiles;
    }

    public List<String> getCssFiles() {
        return this.cssFiles;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setId(final String id) {
        this.id = id;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setExtensions(final List<String> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setJsFiles(final List<String> jsFiles) {
        this.jsFiles = jsFiles;
        return this;
    }

    /**
     * @return {@code this}.
     */
    public PluginConfiguration setCssFiles(final List<String> cssFiles) {
        this.cssFiles = cssFiles;
        return this;
    }

    @Override
    public String toString() {
        return "PluginConfiguration(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", extensions=" + this.getExtensions()
                + ", jsFiles=" + this.getJsFiles() + ", cssFiles=" + this.getCssFiles() + ")";
    }
}
