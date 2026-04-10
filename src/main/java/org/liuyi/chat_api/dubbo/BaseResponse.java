package org.liuyi.chat_api.dubbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse implements Serializable {
    boolean success;
    String errMsg;
}
