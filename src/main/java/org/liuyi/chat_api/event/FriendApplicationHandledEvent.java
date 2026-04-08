package org.liuyi.chat_api.event;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.liuyi.common.domain.event.Event;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FriendApplicationHandledEvent extends Event{
    public static String TOPIC = "friend_application_handled_event";
    @Override
    public String getTopic() {
        return TOPIC;
    }
    private Instant operateTime;
    private String applicationId;
    private String fromUserId;
    private String toUserId;
    HandleFriendApplicationResultType resultType; // 如果是 ACCEPTED，才会有下面这些字段
    private boolean isNewFriendShip; // 是否新建了好友，如果没有新建好友，下面这些都不存在
    private String friendshipId;
    private String privateChatSessionId;
    private String applicantParticipantId;
    private String targetUserParticipantId;
}
