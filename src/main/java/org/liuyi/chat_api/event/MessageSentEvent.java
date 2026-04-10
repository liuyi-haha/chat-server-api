package org.liuyi.chat_api.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.liuyi.common.domain.event.Event;

import java.time.Instant;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MessageSentEvent extends Event {
    public static String TOPIC = "message-sent";
    MessageType messageType;
    Instant sendTime;
    String sessionId;
    String messageId;
    String seqInSession;
    String textContent; // 文本消息内容，后续再扩展其它消息
    String senderUserId;

    @Override
    public String getTopic() {
        return TOPIC;
    }
}
