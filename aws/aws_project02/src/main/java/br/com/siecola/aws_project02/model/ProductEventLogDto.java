package br.com.siecola.aws_project02.model;

import br.com.siecola.aws_project02.enums.EventType;

public class ProductEventLogDto {

    private final String code;
    private final EventType eventType;
    private final long productId;
    private final String username;
    private final long timestamp;

    private final String messageId;

    public ProductEventLogDto(ProductEventLog productEventLog) {

        this.code = productEventLog.getPk();
        this.eventType = productEventLog.getEventType();
        this.productId = productEventLog.getProductId();
        this.username = productEventLog.getUserName();
        this.timestamp = productEventLog.getTimestamp();
        this.messageId = productEventLog.getMessageId();
    }

    public String getCode() {
        return code;
    }

    public EventType getEventType() {
        return eventType;
    }

    public long getProductId() {
        return productId;
    }

    public String getUsername() {
        return username;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessageId() {
        return messageId;
    }
}
