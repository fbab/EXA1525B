// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.prodageo.exa6023.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import org.prodageo.exa6023.client.managed.request.PizzaOrderProxy;
import org.prodageo.exa6023.client.managed.request.PizzaProxy;
import org.prodageo.exa6023.client.scaffold.place.ProxyDetailsView;
import org.prodageo.exa6023.shared.PaymentType;

public abstract class PizzaOrderMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<PizzaOrderProxy> {

    @UiField
    Element id;

    @UiField
    Element version;

    @UiField
    Element name;

    @UiField
    Element address;

    @UiField
    Element total;

    @UiField
    Element paymentType;

    @UiField
    Element deliveryDate;

    @UiField
    Element pizzas;

    PizzaOrderProxy proxy;

    public void setValue(PizzaOrderProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        address.setInnerText(proxy.getAddress() == null ? "" : String.valueOf(proxy.getAddress()));
        total.setInnerText(proxy.getTotal() == null ? "" : String.valueOf(proxy.getTotal()));
        paymentType.setInnerText(proxy.getPaymentType() == null ? "" : String.valueOf(proxy.getPaymentType()));
        deliveryDate.setInnerText(proxy.getDeliveryDate() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_MEDIUM).format(proxy.getDeliveryDate()));
        pizzas.setInnerText(proxy.getPizzas() == null ? "" : org.prodageo.exa6023.client.scaffold.place.CollectionRenderer.of(org.prodageo.exa6023.client.managed.ui.PizzaProxyRenderer.instance()).render(proxy.getPizzas()));
    }
}
