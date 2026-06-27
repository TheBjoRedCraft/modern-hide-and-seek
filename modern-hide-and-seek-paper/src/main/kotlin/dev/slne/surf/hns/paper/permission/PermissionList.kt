package dev.slne.surf.hns.paper.permission

import dev.slne.surf.api.paper.permission.PermissionRegistry

object PermissionList : PermissionRegistry() {
    private const val BASE = "surf.hns"

    val BYPASS = create("$BASE.bypass")
}