package AE_AzureCustomNamespaceMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci : GitVcsRoot({
    uuid = "2de54c27-e130-4cea-8fef-57045953bbdf"
    name = "azurecustomnamespacemonitoringextensionci"
    url = "git@github.com:prashmeh/azure-custom-namespace-monitoring-extension.git"
    pushUrl = "git@github.com:prashmeh/azure-custom-namespace-monitoring-extension.git"
    branch = "refs/heads/1.0.0"
    authMethod = uploadedKey {
        uploadedKey = "teamcityBitbucket"
        passphrase = "credentialsJSON:1ca766cc-ced5-405c-990d-1d24fcbf1b22"
    }
})
