package dev.slne.surf.hns.paper.listener

import dev.slne.surf.api.core.luckperms.LuckPermsAccess
import dev.slne.surf.api.core.messages.adventure.buildText
import dev.slne.surf.hns.common.user.SeekUser
import dev.slne.surf.hns.common.user.role.SeekUserRole
import dev.slne.surf.hns.paper.manager.RoleManager
import dev.slne.surf.hns.paper.manager.UserManager
import dev.slne.surf.hns.paper.permission.PermissionList
import kotlinx.coroutines.runBlocking
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerPreLoginEvent

object PlayerLoginListener : Listener {
    @EventHandler
    fun onPreLogin(event: AsyncPlayerPreLoginEvent) {
        val role = UserManager.connectRule.createRole()

        runBlocking {
            val luckpermsUser =
                LuckPermsAccess.getUser(event.uniqueId) ?: LuckPermsAccess.loadUser(event.uniqueId)

            if (role != null || luckpermsUser.cachedData.permissionData.checkPermission(
                    PermissionList.BYPASS
                ).asBoolean()
            ) {
                val user =
                    SeekUser.create(event.uniqueId, event.name, role ?: SeekUserRole.SPECTATOR)

                UserManager.submit(user)
                RoleManager.assignSpectator(user)
                return@runBlocking
            }

            val hasPlayed = UserManager.find { it.playerUuid == event.uniqueId } != null

            event.kickMessage(if(hasPlayed) )
            event.loginResult = AsyncPlayerPreLoginEvent.Result.KICK_OTHER
        }
    }


    private fun buildFoundMessage(user: SeekUser) = buildText {

    }

    private fun build
}