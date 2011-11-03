// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.prodageo.exa6023.client.managed.request;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.ProxyForName;
import java.util.Date;
import java.util.Set;
import org.prodageo.exa6023.shared.PaymentType;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("org.prodageo.exa6023.server.domain.PizzaOrder")
@ProxyForName("org.prodageo.exa6023.server.domain.PizzaOrder")
public interface PizzaOrderProxy extends EntityProxy {

    abstract Long getId();

    abstract void setId(Long id);

    abstract Integer getVersion();

    abstract void setVersion(Integer version);

    abstract String getName();

    abstract void setName(String name);

    abstract String getAddress();

    abstract void setAddress(String address);

    abstract Float getTotal();

    abstract void setTotal(Float total);

    abstract PaymentType getPaymentType();

    abstract void setPaymentType(PaymentType paymentType);

    abstract Date getDeliveryDate();

    abstract void setDeliveryDate(Date deliveryDate);

    abstract Set<org.prodageo.exa6023.client.managed.request.PizzaProxy> getPizzas();

    abstract void setPizzas(Set<PizzaProxy> pizzas);
}
