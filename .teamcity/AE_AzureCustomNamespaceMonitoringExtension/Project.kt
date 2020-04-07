package AE_AzureCustomNamespaceMonitoringExtension

import AE_AzureCustomNamespaceMonitoringExtension.buildTypes.*
import AE_AzureCustomNamespaceMonitoringExtension.vcsRoots.*
import AE_AzureCustomNamespaceMonitoringExtension.vcsRoots.AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "8a2085ee-30c8-40c8-b68d-0c86abe73148"
    id("AE_AzureCustomNamespaceMonitoringExtension")
    parentId("AE")
    name = "Azure CustomNamespace Monitoring Extension"

    vcsRoot(AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci)

    buildType(AE_AzureCustomNamespaceMonitoringExtension_AzureBuild)

    features {
        versionedSettings {
            id = "PROJECT_EXT_4"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
