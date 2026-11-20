package io.qameta.allure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
public class CommandlineConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    protected List<String> plugins = new ArrayList<>();

    public List<String> getPlugins() {
        return this.plugins;
    }

    /**
     * @return {@code this}.
     */
    public CommandlineConfig setPlugins(final List<String> plugins) {
        this.plugins = plugins;
        return this;
    }
}
