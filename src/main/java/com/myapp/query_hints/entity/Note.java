package com.myapp.query_hints.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "af_delivery_note")
@Getter
@Setter
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEL_NOTE_ID")
    private Long deliveryNoteId;

    @Column(name = "CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @Column(name = "DEL_NOTE_DATE", nullable = false)
    private LocalDateTime deliveryNoteDate;

    @Column(name = "DEL_NOTE_NUM", nullable = false, length = 255)
    private String deliveryNoteNumber;

    @Column(name = "DEL_CANCELLED")
    private Integer deliveryCancelled;

    @Column(name = "BOTTLE_DECREASE")
    private Integer bottleDecrease;

    @Column(name = "BOTTLE_INCREASE")
    private Integer bottleIncrease;

    @Column(name = "PROMO_COLLECTION_COUNT")
    private Integer promoCollectionCount;

    @Column(name = "PROMO_DELIVERY_COUNT")
    private Integer promoDeliveryCount;

    @Column(name = "NEW_CUSTOMER_BOTTLE_COUNT")
    private Integer newCustomerBottleCount;

    @Column(name = "BOTTLES_AT_CLIENT")
    private Integer bottlesAtClient;

    @Column(name = "DAMAGED_BOTTLES")
    private Integer damagedBottles;

    @Column(name = "DELIVERED_BOTTLES")
    private Integer deliveredBottles;

    @Column(name = "EMPTY_BOTTLES")
    private Integer emptyBottles;

    @Column(name = "LOST_BOTTLES")
    private Integer lostBottles;

    @Column(name = "MISUSED_BOTTLES")
    private Integer misusedBottles;

    @Column(name = "NOT_USED_BOTTLES")
    private Integer notUsedBottles;

    @Column(name = "NOT_PURCHASED_STATUS")
    private Integer notPurchasedStatus;

    @Column(name = "PARTIAL_DELIVERY")
    private Integer partialDelivery;

    @Column(name = "TERMINATED_CUSTOMER_BOTTLE_COUNT")
    private Integer terminatedCustomerBottleCount;

    @Column(name = "UPDATED_DATE_TIME")
    private LocalDateTime updatedDateTime;

    @Column(name = "DEL_LOC_CARD_NO", length = 50)
    private String deliveryLocationCardNo;

    @Column(name = "DEL_LOC_ID")
    private Long deliveryLocationId;

    @Column(name = "TRIP_ID")
    private Long tripId;

    @Column(name = "DELIVERY_PLAN_ID")
    private Integer deliveryPlanId;

    @Column(name = "BATCH_NO", length = 45)
    private String batchNo;

    @Column(name = "IS_SENT")
    private Integer isSent;

    @Column(name = "ROUTE_ID")
    private Integer routeId;

    @Column(name = "ROUTE_CODE", length = 50)
    private String routeCode;

    @Column(name = "LOCATION_ADDRESS", columnDefinition = "TEXT")
    private String locationAddress;

    @Column(name = "CUST_CODE", length = 50)
    private String customerCode;

    @Column(name = "CUST_NAME", length = 200)
    private String customerName;

    @Column(name = "IS_REVERSAL", nullable = false)
    private Integer isReversal;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "UPDATED_COUNT", nullable = false)
    private Integer updatedCount;

    @Column(name = "SEQ_NUM", nullable = false, columnDefinition = "int default 0")
    private Integer sequenceNumber;
}
