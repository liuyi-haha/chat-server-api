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
    Integer seqInSession;
    String senderUserId;
    String textContent;
    // 文件类消息的文件id
    String fileId;
    // 图片消息的字段
    Integer imageWidth;
    Integer imageHeight;
    // 语音消息字段
    Integer speechDurationSeconds;
    // 文档消息字段
    String documentName;
    Long documentBytes;
    DocumentType documentType;



    @Override
    public String getTopic() {
        return TOPIC;
    }
}
