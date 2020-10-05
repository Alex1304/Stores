package discord4j.store.action.gateway;

import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.gateway.GuildEmojisUpdate;

import java.util.List;

public class GuildEmojisUpdateAction extends AbstractGatewayAction<List<EmojiData>> {

    private final GuildEmojisUpdate guildEmojisUpdate;

    public GuildEmojisUpdateAction(int shardIndex, GuildEmojisUpdate guildEmojisUpdate) {
        super(shardIndex);
        this.guildEmojisUpdate = guildEmojisUpdate;
    }

    public GuildEmojisUpdate getGuildEmojisUpdate() {
        return guildEmojisUpdate;
    }
}
