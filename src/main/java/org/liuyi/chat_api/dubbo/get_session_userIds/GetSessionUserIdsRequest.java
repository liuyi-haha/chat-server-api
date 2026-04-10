package org.liuyi.chat_api.dubbo.get_session_userIds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetSessionUserIdsRequest implements Serializable {
    private String sessionId;
}
