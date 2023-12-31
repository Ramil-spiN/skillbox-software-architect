package ru.skillbox.monolithicapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_items")
@IdClass(OrderItem.OrderItemId.class)
@ToString(exclude = {"order"})
public class OrderItem {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @Column(name = "item_id")
    private int item;

    @Column(name = "count")
    private int count;

    static class OrderItemId implements Serializable {
        int order;
        int item;
    }
}
