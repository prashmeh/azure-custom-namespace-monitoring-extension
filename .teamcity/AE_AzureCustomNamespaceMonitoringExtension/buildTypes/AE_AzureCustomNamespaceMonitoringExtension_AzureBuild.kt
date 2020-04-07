package AE_AzureCustomNamespaceMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object AE_AzureCustomNamespaceMonitoringExtension_AzureBuild : BuildType({
    uuid = "de2e79f2-0341-497b-ab3a-c382670b111f"
    name = "Azure Build"

    vcs {
        root(AE_AzureCustomNamespaceMonitoringExtension.vcsRoots.AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci)
    }
})
