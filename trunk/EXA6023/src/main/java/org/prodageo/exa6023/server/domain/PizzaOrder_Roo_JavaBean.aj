// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.prodageo.exa6023.server.domain;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import java.lang.Float;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.prodageo.exa6023.server.domain.Pizza;
import org.prodageo.exa6023.shared.PaymentType;

privileged aspect PizzaOrder_Roo_JavaBean {
    
    declare @field: * PizzaOrder.pizzas: -@ManyToMany;
    
    declare @field: * PizzaOrder.pizzas: @Transient;
    
    private Set<Key> PizzaOrder.pizzasKeys = new HashSet<Key>();
    
    public String PizzaOrder.getName() {
        return this.name;
    }
    
    public void PizzaOrder.setName(String name) {
        this.name = name;
    }
    
    public String PizzaOrder.getAddress() {
        return this.address;
    }
    
    public void PizzaOrder.setAddress(String address) {
        this.address = address;
    }
    
    public Float PizzaOrder.getTotal() {
        return this.total;
    }
    
    public void PizzaOrder.setTotal(Float total) {
        this.total = total;
    }
    
    public PaymentType PizzaOrder.getPaymentType() {
        return this.paymentType;
    }
    
    public void PizzaOrder.setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    
    public Date PizzaOrder.getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void PizzaOrder.setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public Set<Pizza> PizzaOrder.getPizzas() {
        Set<org.prodageo.exa6023.server.domain.Pizza> localPizzas = new HashSet<org.prodageo.exa6023.server.domain.Pizza>();
        for (Key key : pizzasKeys) {
            Pizza entity = Pizza.findPizza(key.getId());
            if (entity != null) {
                localPizzas.add(entity);
            }
        }
        this.pizzas = localPizzas;
        return localPizzas;
    }
    
    public void PizzaOrder.setPizzas(Set<Pizza> pizzas) {
        Set<org.prodageo.exa6023.server.domain.Pizza> localPizzas = new HashSet<org.prodageo.exa6023.server.domain.Pizza>();
        List<Long> longIds = new ArrayList<Long>();
        for (Key key : pizzasKeys) {
            if (!longIds.contains(key.getId())) {
                longIds.add(key.getId());
            }
        }
        for (Pizza entity : pizzas) {
            if (!longIds.contains(entity.getId())) {
                longIds.add(entity.getId());
                pizzasKeys.add(KeyFactory.createKey(Pizza.class.getName(), entity.getId()));
            }
            localPizzas.add(entity);
        }
        this.pizzas = localPizzas;
    }
    
}
