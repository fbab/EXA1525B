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
import org.prodageo.exa6023.client.managed.request.PizzaOrderProxy;
import org.prodageo.exa6023.client.managed.request.PizzaProxy;
import org.prodageo.exa6023.client.scaffold.ScaffoldMobileApp;
import org.prodageo.exa6023.client.scaffold.ui.MobileProxyListView;
import org.prodageo.exa6023.shared.PaymentType;

public abstract class PizzaOrderMobileListView_Roo_Gwt extends MobileProxyListView<PizzaOrderProxy> {

    protected Set<String> paths = new HashSet<String>();

    public PizzaOrderMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("name");
        paths.add("address");
        paths.add("deliveryDate");
    }
}
