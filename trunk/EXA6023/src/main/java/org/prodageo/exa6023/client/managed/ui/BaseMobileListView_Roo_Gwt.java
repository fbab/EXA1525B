// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.prodageo.exa6023.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import java.util.HashSet;
import java.util.Set;
import org.prodageo.exa6023.client.managed.request.BaseProxy;
import org.prodageo.exa6023.client.scaffold.ScaffoldMobileApp;
import org.prodageo.exa6023.client.scaffold.ui.MobileProxyListView;

public abstract class BaseMobileListView_Roo_Gwt extends MobileProxyListView<BaseProxy> {

    protected Set<String> paths = new HashSet<String>();

    public BaseMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<org.prodageo.exa6023.client.managed.request.BaseProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("id");
        paths.add("version");
    }
}
