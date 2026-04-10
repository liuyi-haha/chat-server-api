package org.liuyi.chat_api.dubbo.get_session_userIds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.liuyi.chat_api.dubbo.BaseResponse;

import java.util.Set;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GetSessionUserIdsResponse extends BaseResponse {
    Set<String> userIds;
}
