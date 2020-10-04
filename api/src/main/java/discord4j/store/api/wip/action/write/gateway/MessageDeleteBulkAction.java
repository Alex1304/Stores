package discord4j.store.api.wip.action.write.gateway;

import discord4j.discordjson.json.MessageData;
import discord4j.discordjson.json.gateway.MessageDeleteBulk;

import java.util.Set;

public class MessageDeleteBulkAction extends AbstractGatewayWriteAction<Set<MessageData>> {

    private final MessageDeleteBulk messageDeleteBulk;

    public MessageDeleteBulkAction(int shardIndex, MessageDeleteBulk messageDeleteBulk) {
        super(shardIndex);
        this.messageDeleteBulk = messageDeleteBulk;
    }

    public MessageDeleteBulk getMessageDeleteBulk() {
        return messageDeleteBulk;
    }
}