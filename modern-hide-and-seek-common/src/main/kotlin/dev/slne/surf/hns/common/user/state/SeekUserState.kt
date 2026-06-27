package dev.slne.surf.hns.common.user.state

import dev.slne.surf.hns.common.user.role.SeekUserRole

sealed interface SeekUserState {
    object Waiting : SeekUserState
    data class Playing(val role: SeekUserRole) : SeekUserState
    object Found : SeekUserState
}
