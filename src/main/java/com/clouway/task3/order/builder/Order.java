package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Order {

    private Long orderId = 0000000000L;
    private String customerName = "none";
    private String customerAddress = "none";
    private Date creationDate = new Date();
    private Date deliveryDate = new Date();
    private List<OrderItem> items = new ArrayList();

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setOrderCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setOrderDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setOrderItems(List<OrderItem> items) {
        this.items = items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

}
