package dev.slne.surf.hns.common.user.role.rule

import dev.slne.surf.hns.common.user.role.SeekUserRole

enum class SeekerUserConnectRoleRule {
    HIDER_ON_JOIN,
    SPECTATOR_ON_JOIN,
    SEEKER_ON_JOIN,
    NOT_ALLOWED_TO_JOIN;

    fun createRole() = when (this) {
        HIDER_ON_JOIN -> SeekUserRole.HIDER
        SPECTATOR_ON_JOIN -> SeekUserRole.SPECTATOR
        SEEKER_ON_JOIN -> SeekUserRole.SEEKER
        NOT_ALLOWED_TO_JOIN -> null
    }
}