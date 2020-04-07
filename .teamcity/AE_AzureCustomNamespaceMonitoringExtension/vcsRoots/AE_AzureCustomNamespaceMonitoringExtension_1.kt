package AE_AzureCustomNamespaceMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object AE_AzureCustomNamespaceMonitoringExtension_1 : GitVcsRoot({
    uuid = "3dac8258-6584-41ac-b06b-918096485c25"
    id("AE_AzureCustomNamespaceMonitoringExtension")
    name = "AE_AzureCustomNamespaceMonitoringExtension"
    url = "git@github.com:prashmeh/azure-custom-namespace-monitoring-extension.git"
    pushUrl = "git@github.com:prashmeh/azure-custom-namespace-monitoring-extension.git"
    branch = "refs/heads/1.0.0"
    authMethod = uploadedKey {
        uploadedKey = "teamcityBitbucket"
        passphrase = "credentialsJSON:0f731548-be91-4434-97a3-ab86bdbfd929"
    }
})
