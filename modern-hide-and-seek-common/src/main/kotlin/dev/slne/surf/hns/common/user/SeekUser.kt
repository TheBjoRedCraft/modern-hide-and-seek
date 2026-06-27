package dev.slne.surf.hns.common.user

import dev.slne.surf.api.core.serializer.java.uuid.SerializableUUID
import dev.slne.surf.hns.common.user.role.SeekUserRole
import dev.slne.surf.hns.common.user.state.SeekUserState
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class SeekUser(
    val playerUuid: SerializableUUID,
    val playerName: String,
    var role: SeekUserRole
) {
    var state: SeekUserState = SeekUserState.Waiting

    companion object {
        fun create(playerUuid: UUID, playerName: String, role: SeekUserRole) =
            SeekUser(playerUuid, playerName, role)
    }
}
