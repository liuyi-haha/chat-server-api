package org.liuyi.chat_api.event;

import lombok.experimental.SuperBuilder;
import org.liuyi.common.domain.event.Event;

import java.time.Instant;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FriendApplicationSentEvent extends Event {
    public static String TOPIC = "friend-application-sent";
    @Override
    public String getTopic() {
        return TOPIC;
    }
    private String fromUserId;
    private String toUserId;
    private String applicationId;
    private String verificationMessage;
    private Instant sendTime;
}
