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
public class PrivateSessionCreatedEvent extends Event {
    public static String TOPIC = "private-session-created";
    Instant createTime;
    String sessionId;
    private String userId1;
    private String userId2;

    @Override
    public String getTopic() {
        return TOPIC;
    }
}
