package basalt.player

import basalt.server.BasaltServer
import io.undertow.websockets.core.WebSocketChannel
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap

class SocketContext internal constructor(val server: BasaltServer, val channel: WebSocketChannel, val userId: String) {
    internal val players = Object2ObjectOpenHashMap<String, BasaltPlayer>()
    fun newPlayer(guildId: String) {

    }
}