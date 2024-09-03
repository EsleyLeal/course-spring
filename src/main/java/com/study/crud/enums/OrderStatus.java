package com.study.crud.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    // A Cada iteracao o valor do codigo fica em value, e o array completo fica em OrderStatus.values
    public static OrderStatus valueOf(int code){
        for (OrderStatus value: OrderStatus.values()){
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}


