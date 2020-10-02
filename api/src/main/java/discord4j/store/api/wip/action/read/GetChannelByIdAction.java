package discord4j.store.api.wip.action.read;

import discord4j.discordjson.json.ChannelData;

public class GetChannelByIdAction implements ReadAction<ChannelData> {

    private final long channelId;

    public GetChannelByIdAction(long channelId) {
        this.channelId = channelId;
    }

    public long getChannelId() {
        return channelId;
    }
}
