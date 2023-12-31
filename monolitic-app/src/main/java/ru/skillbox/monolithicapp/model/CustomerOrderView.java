package ru.skillbox.monolithicapp.model;

import lombok.Data;
import ru.furn.model.ItemView;

import java.util.List;

@Data
public class CustomerOrderView {
    private int id;
    private EOrderStatus status;
    private String statusText;
    private int totalPrice;
    private List<ItemView> items;
}
