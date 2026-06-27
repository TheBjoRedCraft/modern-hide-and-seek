package dev.slne.surf.hns.paper.manager

import dev.slne.surf.hns.common.user.SeekUser
import dev.slne.surf.hns.common.user.role.rule.SeekerUserConnectRoleRule
import dev.slne.surf.hns.common.user.role.rule.SeekerUserDeathRule
import java.util.concurrent.ConcurrentHashMap

object UserManager : Iterable<SeekUser> {
    private val users = ConcurrentHashMap.newKeySet<SeekUser>()

    var connectRule = SeekerUserConnectRoleRule.NOT_ALLOWED_TO_JOIN
    var deathRule = SeekerUserDeathRule.KICK

    fun submit(user: SeekUser) = users.add(user)

    override fun iterator() = users.iterator()
}