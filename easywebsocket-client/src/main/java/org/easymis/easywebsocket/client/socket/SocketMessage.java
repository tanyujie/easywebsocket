package org.easymis.easywebsocket.client.socket;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocketMessage {
    private String message;
    private Date sendDate;
}

