package org.liuyi.chat_api.dubbo;


import org.liuyi.chat_api.dubbo.get_session_userIds.GetSessionUserIdsRequest;
import org.liuyi.chat_api.dubbo.get_session_userIds.GetSessionUserIdsResponse;

public interface ChatService {
    GetSessionUserIdsResponse getSessionUserIds(GetSessionUserIdsRequest request);
}
